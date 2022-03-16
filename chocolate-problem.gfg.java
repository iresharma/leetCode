class Solution
{
    public long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        ArrayDeque<Long> dq = new ArrayDeque<Long>();
        Collections.sort(a);
        for(long i = 0; i < m; i ++) {
            dq.offerLast(a.get((int)i));
        }
        long min = a.get((int) m-1) - a.get(0);
        for(long i = m; i < n; i ++) {
            dq.pollFirst();
            dq.offerLast(a.get((int)i));
            long diff = dq.getLast() - dq.getFirst();
            if(diff < min) {
                min = diff;
            }
        }
        return min;
    }
}
