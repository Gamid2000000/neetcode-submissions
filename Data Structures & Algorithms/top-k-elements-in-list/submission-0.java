class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        // Шаг 1: Считаем частоты элементов
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Шаг 2: Создаем массив бакетов (списков). 
        // Размер nums.length + 1, так как максимальная частота равна длины массива
        List<Integer>[] bucket = new List[nums.length + 1];

        // Шаг 3: Распределяем числа по бакетам в зависимости от их частоты
        for (int key : frequencyMap.keySet()) {
            int frequency = frequencyMap.get(key);
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        // Шаг 4: Собираем результат, двигаясь с конца массива бакетов
        int[] result = new int[k];
        int counter = 0;

        for (int pos = bucket.length - 1; pos >= 0 && counter < k; pos--) {
            if (bucket[pos] != null) {
                for (int num : bucket[pos]) {
                    result[counter++] = num;
                    if (counter == k) {
                        return result;
                    }
                }
            }
        }

        return result;
    }
}
