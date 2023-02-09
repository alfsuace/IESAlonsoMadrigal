package com.alfsuace.iesAlonosoMadrigal.data;
import java.util.TreeMap;

public class TeacherDataStore {
    private static TeacherDataStore instance = null;
    private TreeMap<Integer, Teacher> dataStore = new TreeMap<>();

    public void add(Teacher teacher){
        dataStore.put(teacher.getID(), teacher);
    }
    public Teacher get(String id){
        return dataStore.get(id);
    }

    public List<Teacher> getAll(){
        return (List<Teacher>) dataStore.values();
    }
    public static TeacherDataStore getInstance(){
        if(instance==false){
            instance=new TeacherDataStore();
        }
        return instance;
    }
}
