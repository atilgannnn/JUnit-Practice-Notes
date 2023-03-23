import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class Practice03Test {

    //Task-6 : Practice03 classının add, remove, removeAll metodlarını test ediniz.

    Practice02 mockRepo = mock(Practice02.class); //Burada mock obje oluşturduk ama içine bir eleman atamıyoruz. Atsak da mock olduğu için almıyor.
    Practice03 service = new Practice03(mockRepo);

    @Test
    public void testAddDeveloper(){

    service.addDeveloper("Donatello");
    verify(mockRepo).add("Donatello");
    verify(mockRepo,times(1)).add("Donatello");


    }

    @Test
    public void testRemoveDeveloper(){

        when(mockRepo.findByName("Raphael")).thenReturn("Raphael"); //--> Ama bunu kullandığımızda mock da eleman varmış gibi hareket ediyor ve elemanı alıyor
        service.addDeveloper("Raphael");
        service.removeDeveloper("Raphael");
        verify(mockRepo).findByName("Raphael");
        verify(mockRepo).remove("Raphael");

        //InOrder : ödev


    }

    @Test
    public void testRemoveAllDeveloper(){

        when(mockRepo.findByName("Raphael")).thenReturn("Raphael"); //--> Ama bunu kullandığımızda mock da eleman varmış gibi hareket ediyor ve elemanı alıyor
        service.addDeveloper("Raphael");
        service.removeAllDeveloper();
        verify(mockRepo).removeAll();



    }





}
