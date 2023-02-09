package com.alfsuace.iesAlonosoMadrigal.data;

public class ClassroomDataStore {
    private static ClassroomDataStore instance = null;
    private TreeMap<Integer, Classroom> dataStore = new TreeMap<>();

    public void add(Classroom classroom){
        dataStore.put(classroom.getID(), classroom);
    }
    public Classroom get(String id){
        return dataStore.get(id);
    }

    public List<Classroom> getAll(){
        return (List<Classroom>) dataStore.values();
    }
    public static ClassroomDataStore getInstance(){
        if(instance==false){
            instance=new ClassroomDataStore();
        }
        return instance;
    }
}
