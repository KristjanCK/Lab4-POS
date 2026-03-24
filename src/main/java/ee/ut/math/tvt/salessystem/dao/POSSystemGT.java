package ee.ut.math.tvt.salessystem.dao;

import org.junit.Test;
import static org.junit.Assert.*;
import ee.ut.math.tvt.salessystem.dataobjects.SoldItem;
import ee.ut.math.tvt.salessystem.dataobjects.StockItem;
import java.util.List;

public class POSSystemGT {

	@Test(timeout = 4000)
	public void testFindStockItem() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    Long long0 = new Long(0L);
	    StockItem stockItem0 = new StockItem(long0, "F\tE#-", "F\tE#-", 0L, 0);
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    StockItem stockItem1 = inMemorySalesSystemDAO0.findStockItem(0L);
	    assertEquals("F\tE#-", stockItem1.getName());
	    assertNotNull(stockItem1);
	}

	@Test(timeout = 4000)
	public void testFindStockItemReturningStockItemWhereGetQuantityIsPositive() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = inMemorySalesSystemDAO0.findStockItem(2L);
	    assertEquals(8, stockItem0.getQuantity());
	    assertEquals("Sweets", stockItem0.getDescription());
	    assertEquals(8.0, stockItem0.getPrice(), 0.01);
	    assertEquals("Chupa-chups", stockItem0.getName());
	    assertNotNull(stockItem0);
	}

	@Test(timeout = 4000)
	public void testRollbackTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.rollbackTransaction();
	}

	@Test(timeout = 4000)
	public void testFindStockItemReturningStockItemWhereGetPriceIsZero() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    Long long0 = new Long(0L);
	    StockItem stockItem0 = new StockItem(long0, "F\tE#-", "F\tE#-", 0L, 0);
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    StockItem stockItem1 = inMemorySalesSystemDAO0.findStockItem(0L);
	    assertEquals("F\tE#-", stockItem1.getName());
	    assertNotNull(stockItem1);
	}

	@Test(timeout = 4000)
	public void testSaveStockItemWithStockItemWhereGetPriceIsPositive() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    Long long0 = new Long(265L);
	    StockItem stockItem0 = new StockItem(long0, "Lays chips", "Lays chips", 265L, (-2206));
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    StockItem stockItem1 = inMemorySalesSystemDAO0.findStockItem(265L);
	    assertNotNull(stockItem1);
	    assertEquals("Lays chips", stockItem1.getDescription());
	}

	@Test(timeout = 4000)
	public void testFindStockItemReturningNull() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = inMemorySalesSystemDAO0.findStockItem(1410L);
	    assertNull(stockItem0);
	}

	@Test(timeout = 4000)
	public void testCreatesInMemorySalesSystemDAOAndCallsRollbackTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.rollbackTransaction();
	}

	@Test(timeout = 4000)
	public void testFindStockItemThrowsNullPointerException() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = new StockItem();
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    // Undeclared exception!
	    inMemorySalesSystemDAO0.findStockItem((-126L));
	}

	@Test(timeout = 4000)
	public void testFindStockItemReturningStockItemWhereGetPriceIsNegative() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    Long long0 = Long.getLong("", (-1L));
	    StockItem stockItem0 = new StockItem(long0, "", "", (-1L), (-2141259056));
	    inMemorySalesSystemDAO0.saveStockItem(stockItem0);
	    StockItem stockItem1 = inMemorySalesSystemDAO0.findStockItem((-1L));
	    assertNotNull(stockItem1);
	    assertEquals((-1.0), stockItem1.getPrice(), 0.01);
	}

	@Test(timeout = 4000)
	public void testBeginTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.beginTransaction();
	}

	@Test(timeout = 4000)
	public void testCreatesInMemorySalesSystemDAOAndCallsFindStockItems() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    List<StockItem> list0 = inMemorySalesSystemDAO0.findStockItems();
	    assertFalse(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void testCreatesInMemorySalesSystemDAOAndCallsFindStockItem() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    StockItem stockItem0 = inMemorySalesSystemDAO0.findStockItem(2L);
	    assertEquals(8, stockItem0.getQuantity());
	    assertEquals("Sweets", stockItem0.getDescription());
	    assertEquals(8.0, stockItem0.getPrice(), 0.01);
	    assertEquals("Chupa-chups", stockItem0.getName());
	    assertNotNull(stockItem0);
	}

	@Test(timeout = 4000)
	public void testCommitTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.commitTransaction();
	}

	@Test(timeout = 4000)
	public void testCreatesInMemorySalesSystemDAOAndCallsBeginTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.beginTransaction();
	}

	@Test(timeout = 4000)
	public void testCreatesInMemorySalesSystemDAOAndCallsCommitTransaction() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    inMemorySalesSystemDAO0.commitTransaction();
	}

	@Test(timeout = 4000)
	public void testFindStockItems() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    List<StockItem> list0 = inMemorySalesSystemDAO0.findStockItems();
	    assertFalse(list0.isEmpty());
	}

	@Test(timeout = 4000)
	public void testCreatesInMemorySalesSystemDAOAndCallsSaveSoldItem() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    SoldItem soldItem0 = new SoldItem();
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem0);
	    assertNull(soldItem0.getId());
	}

	@Test(timeout = 4000)
	public void testSaveSoldItem() throws Throwable {
	    InMemorySalesSystemDAO inMemorySalesSystemDAO0 = new InMemorySalesSystemDAO();
	    SoldItem soldItem0 = new SoldItem();
	    inMemorySalesSystemDAO0.saveSoldItem(soldItem0);
	    assertNull(soldItem0.getId());
	}

}