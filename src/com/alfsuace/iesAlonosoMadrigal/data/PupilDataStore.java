package com.alfsuace.iesAlonosoMadrigal.data;

public class PupilDataStore {
    import java.util.List;

    public class ChasisDataStore {
        private static ChasisDataStore instance = null;
        private TreeMap<Integer, Pupil> dataStore = new TreeMap<>();

        public void add(Pupil pupil){
            dataStore.put(pupil.getID(), pupil);
        }
        public Pupil get(String id){
            return dataStore.get(id);
        }

        public List<Pupil> getAll(){
            return (List<Pupil>) dataStore.values();
        }
        public static PupilDataStore getInstance(){
            if(instance==false){
                instance=new PupilDataStore();
            }
            return instance;
        }

    }
}