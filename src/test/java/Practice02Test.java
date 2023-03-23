import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.*;

public class Practice02Test {
    Practice02 object=new Practice02();
    //Task-8:Practice02 classının add, remove, removeAll metodlarını test ediniz.
    @Test
    public void testAdd(TestInfo info){
        object.add("Donatello");
        object.add("Leonardo");
        object.add("Raphael");
        assertTrue(object.devList.contains("Raphael"));
        assertEquals(3,object.devList.size());
        System.out.println(info.getDisplayName()+"çalıştı");
    }

    @Test
    public void testRemove(TestInfo info){
        object.add("April");
        object.add("Splinter");
        object.remove("Splinter");
        assertEquals(1,object.devList.size());
        assertFalse(object.devList.contains("Splinter"));
    }
    @Test
    public void testRemoveAll(TestInfo info){
        object.add("April");
        object.add("Splinter");
        object.removeAll();
        assertEquals(0,object.devList.size());
        assertTrue(object.devList.isEmpty());
    }

}
