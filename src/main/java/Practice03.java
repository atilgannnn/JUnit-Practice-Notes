//Service class ı gibi hayal ediyoruz burayı

public class Practice03 {

    Practice02 repo;

    public Practice03(Practice02 repo) {

        this.repo = repo;

    }

    public void addDeveloper(String name) {
        repo.add(name);
        System.out.println("developer eklendi");
    }

    public void removeDeveloper(String name) {
        String found= repo.findByName(name);
        repo.remove(found);
        System.out.println("developer silindi");
    }

    public void removeAllDeveloper(){
        repo.removeAll();
        System.out.println("tüm developerlar silindi");
    }


    public void sizeOfDevs() {
        repo.sizeOfDevs();
        System.out.println("tüm developerların sayısı:"+repo.sizeOfDevs());
    }


}
