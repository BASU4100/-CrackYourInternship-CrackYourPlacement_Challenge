class Solution {
  public void printDuplicates(String s) {
    Map<Character, Integer> freq=new HashMap();
    for (char ch: s.toCharArray())
      freq.put(ch, freq.getOrDefault(ch, 0)+1);
    for (Map.Entry<Character, Integer> it: freq.entrySet()) {
      if (it.getValue()>1)
        System.out.println(it.getKey()+", count="+it.getValue());
    }
  }
}
