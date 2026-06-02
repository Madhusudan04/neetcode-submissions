class TimeMap {

    Map<String,Map<Integer,List<String>>> map;

    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!map.containsKey(key)){
            map.put(key,new HashMap<>());
        }
        if(!map.get(key).containsKey(timestamp)){
            map.get(key).put(timestamp,new ArrayList<>());
        }
        map.get(key).get(timestamp).add(value);
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";
        int seen = 0;
        for(int num : map.get(key).keySet()){
            if(timestamp >= num)
                seen = Math.max(seen, num);
        }
        if(seen == 0) return "";
        int back = map.get(key).get(seen).size() - 1;
        return map.get(key).get(seen).get(back);
    }
}
