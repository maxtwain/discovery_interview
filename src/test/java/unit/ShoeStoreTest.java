package unit;

import com.NikeShoe;
import com.Shoe;
import com.ShoeStore;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ShoeStoreTest {
    @Test
    public void recordSaleTest(){
        ShoeStore shoeStore01 = new ShoeStore(60, 60);
        Shoe[] shoes01 = new Shoe[] { new NikeShoe("red") };
        String employee01 = "Rebecca";

        shoeStore01.recordSale(shoes01, employee01);

        assertEquals(119, shoeStore01.getTotalShoes());
    }
}
