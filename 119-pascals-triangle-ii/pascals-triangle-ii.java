class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<Integer> row = new ArrayList<>();
        long val = 1;
        row.add(1);

        for (int j = 1; j <= rowIndex; j++) {
            val = val * (rowIndex - j + 1) / j;
            row.add((int) val);
        }
        return row;
    }
}