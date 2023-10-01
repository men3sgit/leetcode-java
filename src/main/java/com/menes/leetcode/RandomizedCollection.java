class RandomizedCollection {
    private List<Integer> list = new ArrayList<>();
    public RandomizedCollection() {
        
    }
    
    public boolean insert(int val) {
        if(list.contains(val)){
            list.add(val);
            return false;
        }
        list.add(val);
        return true;
        
    }
    
    public boolean remove(int val) {
        if(list.contains(val)){
            list.remove((Integer)val);
            return true;
        }
       return false;    }
    
    public int getRandom() {
      return list.get((int)(Math.random()*list.size()));
    }
}

/**
 * Your RandomizedCollection object will be instantiated and called as such:
 * RandomizedCollection obj = new RandomizedCollection();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */
