package com.internousdev.leisurepass.dto;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;


public class PurchaseHistoryInfoDTOTest {
	int max = 2147483647;
	int min = -2147483648;
	String exmax = "2147483648";
	String exmin = "-2147483649";

	// Id test
	@Test
	public void testGetId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected, actual);

	}

	@Test
	public void testGetId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setId(expected);

		int actual = dto.getId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try {
			int expected = Integer.parseInt(exmax);
			dto.setId(expected);

			int actual = dto.getId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try {
			int expected = Integer.parseInt(exmax);
			dto.setId(expected);

			int actual = dto.getId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try {
			int expected = Integer.parseInt(exmin);
			dto.setId(expected);

			int actual = dto.getId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try {
			int expected = Integer.parseInt(exmin);
			dto.setId(expected);

			int actual = dto.getId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	// UserId test
	@Test
	public void testGetUserId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetUserId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}@Test
	public void testGetUserId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetUserId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}@Test
	public void testGetUserId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetUserId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetUserId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetUserId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);

	}

	@Test
	public void testGetUserId6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetUserId6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);

	}

	@Test
	public void testGetUserId7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetUserId7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);

	}

	@Test
	public void testGetUserId8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetUserId8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);

	}

	@Test
	public void testGetUserId9() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetUserId9() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);

	}

	@Test
	public void testGetUserId10() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetUserId10() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setUserId(expected);

		String actual = dto.getUserId();
		assertEquals(expected, actual);

	}

	// ProductId test
	@Test
	public void testGetProductId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetProductId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetProductId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected, actual);

	}

	@Test
	public void testGetProductId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetProductId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setProductId(expected);

		int actual = dto.getProductId();
		assertEquals(expected, actual);

	}

	@Test
	public void testGetProductId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try {

			int expected = Integer.parseInt(exmax);
			dto.setProductId(expected);

			int actual = dto.getProductId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}

	}

	@Test
	public void testSetProductId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try {

			int expected = Integer.parseInt(exmax);
			dto.setProductId(expected);

			int actual = dto.getProductId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}

	}

	@Test
	public void testGetProductId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try {

			int expected = Integer.parseInt(exmin);
			dto.setProductId(expected);

			int actual = dto.getProductId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

	@Test
	public void testSetProductId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try {

			int expected = Integer.parseInt(exmin);
			dto.setProductId(expected);

			int actual = dto.getProductId();
			assertEquals(expected, actual);
		} catch (RuntimeException e) {
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

	// ProductCount test
	@Test
	public void testGetProductCount1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setProductCount(expected);

		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setProductCount(expected);

		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setProductCount(expected);

		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setProductCount(expected);

		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setProductCount(expected);

		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductCount3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setProductCount(expected);

		int actual = dto.getProductCount();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductCount4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmax);
		dto.setProductCount(expected);

		int actual= dto.getProductCount();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}

	}

	@Test
	public void testSetProductCount4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmax);
		dto.setProductCount(expected);

		int actual= dto.getProductCount();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}

	}


	@Test
	public void testGetProductCount5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setProductCount(expected);

		int actual= dto.getProductCount();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

	@Test
	public void testSetProductCount5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setProductCount(expected);

		int actual= dto.getProductCount();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}

	}

	// Price test
	@Test
	public void testGetPrice1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetPrice1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetPrice2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetPrice2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetPrice3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetPrice3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetPrice4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmax);
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected , actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testSetPrice4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmax);
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected , actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}


	@Test
	public void testGetPrice5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected , actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetPrice5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setPrice(expected);

		int actual = dto.getPrice();
		assertEquals(expected , actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	// DestinationId test
	@Test
	public void testGetDestinationId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setDestinationId(expected);

		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDestinationId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setDestinationId(expected);

		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetDestinationId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setDestinationId(expected);

		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDestinationId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setDestinationId(expected);

		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetDestinationId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setDestinationId(expected);

		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetDestinationId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setDestinationId(expected);

		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetDestinationId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmax);
		dto.setDestinationId(expected);

		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}


	@Test
	public void testSetDestinationId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmax);
		dto.setDestinationId(expected);

		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetDestinationId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setDestinationId(expected);

		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetDestinationId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setDestinationId(expected);

		int actual = dto.getDestinationId();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	// RegistDate test
	@Test
	public void testGetRegistDate1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setRegistDate(expected);
		Date actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setRegistDate(expected);
		Date actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetRegistDate2() throws ParseException {
		ProductInfoDTO dto = new ProductInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}
	@Test
	public void testSetRegistDate2() throws ParseException {
		ProductInfoDTO dto = new ProductInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}

	// UpdateDate test
	@Test
	public void testGetUpdateDate1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate2() throws ParseException {
		ProductInfoDTO dto = new ProductInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}
	@Test
	public void testSetUpdateDate2() throws ParseException {
		ProductInfoDTO dto = new ProductInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected, dto.getUpdateDate());
	}

	// ProductName test
	@Test
	public void testGetProductName1() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = "0";
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}
	@Test
	public void testSetProductName1() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = "0";
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}
	@Test
	public void testGetProductName2() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}
	@Test
	public void testSetProductName2() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}
	@Test
	public void testGetProductName3() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}
	@Test
	public void testSetProductName3() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}
	@Test
	public void testGetProductName4() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = null;
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}
	@Test
	public void testSetProductName4() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = null;
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}
	@Test
	public void testGetProductName5() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = "";
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}
	@Test
	public void testSetProductName5() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = "";
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}
	@Test
	public void testGetProductName6() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = " ";
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}
	@Test
	public void testSetProductName6() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = " ";
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}
	@Test
	public void testGetProductName7() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = "　";
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}
	@Test
	public void testSetProductName7() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = "　";
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}
	@Test
	public void testGetProductName8() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = "abc123";
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}
	@Test
	public void testSetProductName8() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = "abc123";
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}
	@Test
	public void testGetProductName9() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}

	@Test
	public void testSetProductName9() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}
	@Test
	public void testGetProductName10() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}

	@Test
	public void testSetProductName10() {
		PurchaseHistoryInfoDTO dto =new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
	    dto.setProductName(expected);

	    String actual  = dto.getProductName();
	    assertEquals(expected , actual);
	}

	// ProductNameKana test
	@Test
	public void testGetProductNameKana1() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "0";
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana1() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "0";
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana2() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "2147483647";
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana2() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "2147483647";
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana3() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "-2147483648";
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana3() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "-2147483648";
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana4() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = null;
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana4() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = null;
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana5() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "";
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}

	@Test
	public void testSetProductNameKana5() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "";
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana6() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = " ";
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana6() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = " ";
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}

	@Test
	public void testGetProductNameKana7() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "　";
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana7() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "　";
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana8() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "abc123";
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana8() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "abc123";
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana9() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "あいう１２３";
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana9() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "あいう１２３";
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana10() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "abc123あいう１２３漢字";
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana10() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "abc123あいう１２３漢字";
	dto.setProductNameKana(expected);

	String  actual = dto.getProductNameKana();;
	assertEquals(expected, actual);
	}

	// ProductDescription test
	@Test
	public void testGetProductDescription1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}@Test
	public void testGetProductDescription2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}@Test
	public void testGetProductDescription3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetProductDescription9() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription9() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductDescription10() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductDescription10() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setProductDescription(expected);

		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	// CategoryId test
	@Test
	public void testGetCategoryId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setCategoryId(expected);

		int actual = dto.getCategoryId();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetCategoryId1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setCategoryId(expected);

		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetCategoryId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setCategoryId(expected);

		int actual = dto.getCategoryId();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetCategoryId2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setCategoryId(expected);

		int actual = dto.getCategoryId();
		assertEquals(expected, actual);

	}

	@Test
	public void testGetCategoryId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setCategoryId(expected);

		int actual = dto.getCategoryId();
		assertEquals(expected, actual);

	}

	@Test
	public void testSetCategoryId3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setCategoryId(expected);

		int actual = dto.getCategoryId();
		assertEquals(expected, actual);

	}

	@Test
	public void testGetCategoryId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmax);
		dto.setCategoryId(expected);

		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}

	}

	@Test
	public void testSetCategoryId4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmax);
		dto.setCategoryId(expected);

		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetCategoryId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setCategoryId(expected);

		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"-2147483649\"");
		}

	}

	@Test
	public void testSetCategoryId5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setCategoryId(expected);

		int actual = dto.getCategoryId();
		assertEquals(expected, actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(),"For input string: \"-2147483649\"");
		}

	}

	// ImageFileName test
	@Test
	public void testGetImageFileName1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetImageFileName4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetImageFileName6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetImageFileName7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetImageFileName7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetImageFileName8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName9() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName9() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetImageFileName10() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetImageFileName10() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setImageFileName(expected);

		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	// ImageFilePath test
	@Test
	public void testGetImageFilePath1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetImageFilePath1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);
	}@Test
	public void testGetImageFilePath2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetImageFilePath2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);
	}@Test
	public void testGetImageFilePath3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetImageFilePath3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);
	}
	@Test
	public void testGetImageFilePath4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetImageFilePath4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetImageFilePath5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);

	}


	@Test
	public void testSetImageFilePath5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);

	}


	@Test
	public void testGetImageFilePath6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);

	}


	@Test
	public void testSetImageFilePath6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);

	}


	@Test
	public void testGetImageFilePath7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetImageFilePath7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);

	}

	@Test
	public void testGetImageFilePath8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);

	}


	@Test
	public void testSetImageFilePath8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);

	}


	@Test
	public void testGetImageFilePath9() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetImageFilePath9() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);

	}

	@Test
	public void testGetImageFilePath10() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);

	}

	@Test
	public void testSetImageFilePath10() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setImageFilePath(expected);

		String actual = dto.getImageFilePath();
		assertEquals(expected , actual);

	}

	// ReleaseCompany test
	@Test
	public void testGetReleaseCompany1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetReleaseCompany1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}@Test
	public void testGetReleaseCompany2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetReleaseCompany2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}@Test
	public void testGetReleaseCompany3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetReleaseCompany3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}
	@Test
	public void testGetReleaseCompany4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetReleaseCompany4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}


	@Test
	public void testGetReleaseCompany5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetReleaseCompany5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetReleaseCompany6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetReleaseCompany6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetReleaseCompany7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}
	@Test
	public void testSetReleaseCompany7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetReleaseCompany8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}
	@Test
	public void testSetReleaseCompany8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetReleaseCompany9() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}


	@Test
	public void testSetReleaseCompany9() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}


	@Test
	public void testGetReleaseCompany10() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetReleaseCompany10() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setReleaseCompany(expected);

		String actual  = dto.getReleaseCompany();
		assertEquals(expected , actual);
	}

	// ReleaseDate test
	@Test
	public void testGetReleaseDate1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseDate1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseDate2() throws ParseException{
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setReleaseDate(expected);
		assertEquals(expected,dto.getReleaseDate());
	}

	@Test
	public void testSetReleaseDate2() throws ParseException{
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();

		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setReleaseDate(expected);
		assertEquals(expected,dto.getReleaseDate());
	}

	// FamilyName test
	@Test
	public void testGetFamilyName1() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "0";
	dto.setFamilyName(expected);

	String actual = dto.getFamilyName();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName2() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "2147483647";
	dto.setFamilyName(expected);

	String actual = dto.getFamilyName();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName3() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "-2147483648";
	dto.setFamilyName(expected);

	String actual = dto.getFamilyName();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFamilyName4() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = null;
	dto.setFamilyName(expected);

	String actual = dto.getFamilyName();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setFamilyName(expected);

		String actual = dto.getFamilyName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName5() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "";
	dto.setFamilyName(expected);

	String actual = dto.getFamilyName();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName5() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "";
	dto.setFamilyName(expected);

	String actual = dto.getFamilyName();
	assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName6() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = " ";
	dto.setFamilyName(expected);

	String actual = dto.getFamilyName();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName6() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = " ";
	dto.setFamilyName(expected);

	String actual = dto.getFamilyName();
	assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName7() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "　";
	dto.setFamilyName(expected);

	String actual = dto.getFamilyName();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName7() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "　";
	dto.setFamilyName(expected);

	String actual = dto.getFamilyName();
	assertEquals(expected, actual);
	}

	@Test
	public void testGetFamilyName8() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "abc123";
	dto.setFamilyName(expected);

	String actual = dto.getFamilyName();
	assertEquals(expected, actual);
	}


	@Test
	public void testSetFamilyName8() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "abc123";
	dto.setFamilyName(expected);

	String actual = dto.getFamilyName();
	assertEquals(expected, actual);
	}


	@Test
	public void testGetFamilyName9() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "あいう１２３";
	dto.setFamilyName(expected);

	String actual = dto.getFamilyName();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName9() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "あいう１２３";
	dto.setFamilyName(expected);

	String actual = dto.getFamilyName();
	assertEquals(expected, actual);
	}


	@Test
	public void testGetFamilyName10() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "abc123あいう１２３漢字";
	dto.setFamilyName(expected);

	String actual = dto.getFamilyName();
	assertEquals(expected, actual);
	}

	@Test
	public void testSetFamilyName10() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "abc123あいう１２３漢字";
	dto.setFamilyName(expected);

	String actual = dto.getFamilyName();
	assertEquals(expected, actual);
	}

	// FirstName test
	@Test
	public void testGetFirstName1() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName1() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName2() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName2() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "2147483648";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName3() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName3() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName4() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName4() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstName5() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName5() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName6() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName6() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName7() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName7() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName8() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName8() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName9() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName9() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstName10() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstName10() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setFirstName(expected);

		String actual = dto.getFirstName();
		assertEquals(expected, actual);
	}

	// FamilyNameKana test
	@Test
	public void testGetFamilyNameKana1() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "0";
	dto.setFamilyNameKana(expected);

	String actual = dto.getFamilyNameKana();
	assertEquals(expected , actual);
	}

	@Test
	public void testSetFamilyNameKana1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setFamilyNameKana(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected , actual);
	}
	@Test
	public void testGetFamilyNameKana2() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "2147483647";
	dto.setFamilyNameKana(expected);

	String actual = dto.getFamilyNameKana();
	assertEquals(expected , actual);
	}

	@Test
	public void testSetFamilyNameKana2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setFamilyNameKana(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected , actual);
	}
	@Test
	public void testGetFamilyNameKana3() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "-2147483648";
	dto.setFamilyNameKana(expected);

	String actual = dto.getFamilyNameKana();
	assertEquals(expected , actual);
	}

	@Test
	public void testSetFamilyNameKana3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setFamilyNameKana(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetFamilyNameKana4() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = null;
	dto.setFamilyNameKana(expected);

	String actual = dto.getFamilyNameKana();
	assertEquals(expected , actual);
	}

	@Test
	public void testSetFamilyNameKana4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setFamilyNameKana(expected);

		String actual = dto.getFamilyNameKana();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetFamilyNameKana5() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "";
	dto.setFamilyNameKana(expected);

	String actual = dto.getFamilyNameKana();
	assertEquals(expected , actual);
	}

	@Test
	public void testSetFamilyNameKana5() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "";
	dto.setFamilyNameKana(expected);

	String actual = dto.getFamilyNameKana();
	assertEquals(expected , actual);
	}

	@Test
	public void testGetFamilyNameKana6() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = " ";
	dto.setFamilyNameKana(expected);

	String actual = dto.getFamilyNameKana();
	assertEquals(expected , actual);
	}
	@Test
	public void testSetFamilyNameKana6() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = " ";
	dto.setFamilyNameKana(expected);

	String actual = dto.getFamilyNameKana();
	assertEquals(expected , actual);
	}


	@Test
	public void testGetFamilyNameKana7() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "　";
	dto.setFamilyNameKana(expected);

	String actual = dto.getFamilyNameKana();
	assertEquals(expected , actual);
	}


	@Test
	public void testSetFamilyNameKana7() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "　";
	dto.setFamilyNameKana(expected);

	String actual = dto.getFamilyNameKana();
	assertEquals(expected , actual);
	}


	@Test
	public void testGetFamilyNameKana8() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "abc123";
	dto.setFamilyNameKana(expected);

	String actual = dto.getFamilyNameKana();
	assertEquals(expected , actual);
	}

	@Test
	public void testSetFamilyNameKana8() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "abc123";
	dto.setFamilyNameKana(expected);

	String actual = dto.getFamilyNameKana();
	assertEquals(expected , actual);
	}

	@Test
	public void testGetFamilyNameKana9() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "あいう１２３";
	dto.setFamilyNameKana(expected);

	String actual = dto.getFamilyNameKana();
	assertEquals(expected , actual);
	}

	@Test
	public void testSetFamilyNameKana9() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "あいう１２３";
	dto.setFamilyNameKana(expected);

	String actual = dto.getFamilyNameKana();
	assertEquals(expected , actual);
	}

	@Test
	public void testGetFamilyNameKana10() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "abc123あいう１２３漢字";
	dto.setFamilyNameKana(expected);

	String actual = dto.getFamilyNameKana();
	assertEquals(expected , actual);
	}

	@Test
	public void testSetFamilyNameKana10() {
	PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
	String expected = "abc123あいう１２３漢字";
	dto.setFamilyNameKana(expected);

	String actual = dto.getFamilyNameKana();
	assertEquals(expected , actual);
	}

	// FirstNameKana test
	@Test
	public void testGetFirstNameKana1() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana1() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}@Test
	public void testGetFirstNameKana2() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana2() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}@Test
	public void testGetFirstNameKana3() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana3() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana4() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana4() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetFirstNameKana5() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana5() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana6() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana6() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana7() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana7() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana8() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana8() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana9() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana9() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetFirstNameKana10() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetFirstNameKana10() {
		PurchaseHistoryInfoDTO dto= new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setFirstNameKana(expected);

		String actual = dto.getFirstNameKana();
		assertEquals(expected, actual);
	}

	// Email test
	@Test
	public void testGetEmail1() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetEmail1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetEmail2() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetEmail2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetEmail3() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetEmail3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetEmail4() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetEmail4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetEmail5() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetEmail5() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetEmail6() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}


	@Test
	public void testSetEmail6() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetEmail7() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetEmail7() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}
	@Test
	public void testGetEmail8() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}
	@Test
	public void testSetEmail8() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetEmail9() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetEmail9() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetEmail10() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetEmail10() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setEmail(expected);

		String actual  = dto.getEmail();
		assertEquals(expected , actual);
	}

	// TelNumber test
	@Test
	public void testGetTelNumber1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumber1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumber2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}@Test
	public void testGetTelNumber3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetTelNumber4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetTelNumber4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumber5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumber5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumber6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumber6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumber7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumber7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumber8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumber8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetTelNumber9() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetTelNumber9() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetTelNumber10() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetTelNumber10() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setTelNumber(expected);

		String actual= dto.getTelNumber();
		assertEquals(expected, actual);
	}

	// UserAddress test
	@Test
	public void testGetUserAddress1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddress1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddress2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddress2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddress3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddress3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddress4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddress4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddress5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddress5() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddress6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddress6() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddress7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}


	@Test
	public void testSetUserAddress7() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}


	@Test
	public void testGetUserAddress8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddress8() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddress9() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddress9() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUserAddress10() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUserAddress10() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setUserAddress(expected);

		String actual = dto.getUserAddress();
		assertEquals(expected, actual);
	}

	// Subtotal test
	@Test
	public void testGetSubtotal1() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setSubtotal(expected);

		int actual = dto.getSubtotal();
		assertEquals(expected,actual);

	}

	@Test
	public void testSetSubtotal1() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		int expected = 0;
		dto.setSubtotal(expected);

		int actual = dto.getSubtotal();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetSubtotal2() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setSubtotal(expected);

		int actual = dto.getSubtotal();
		assertEquals(expected,actual);

	}

	@Test
	public void testSetSubtotal2() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		int expected = max;
		dto.setSubtotal(expected);

		int actual = dto.getSubtotal();
		assertEquals(expected,actual);

	}

	@Test
	public void testGetSubtotal3() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setSubtotal(expected);

		int actual = dto.getSubtotal();
		assertEquals(expected,actual);

	}

	@Test
	public void testSetSubtotal3() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		int expected = min;
		dto.setSubtotal(expected);

		int actual = dto.getSubtotal();
		assertEquals(expected,actual);

	}

	@Test
	public void testGetSubtotal4() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmax);
		dto.setSubtotal(expected);

		int actual = dto.getSubtotal();
		assertEquals(expected,actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetSubtotal4() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmax);
		dto.setSubtotal(expected);

		int actual = dto.getSubtotal();
		assertEquals(expected,actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"2147483648\"");
		}
	}

	@Test
	public void testGetSubtotal5() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setSubtotal(expected);

		int actual = dto.getSubtotal();
		assertEquals(expected,actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	@Test
	public void testSetSubtotal5() {
		PurchaseHistoryInfoDTO dto  = new PurchaseHistoryInfoDTO();
		try{
		int expected = Integer.parseInt(exmin);
		dto.setSubtotal(expected);

		int actual = dto.getSubtotal();
		assertEquals(expected,actual);
		}catch(RuntimeException e){
			assertEquals(e.getMessage(), "For input string: \"-2147483649\"");
		}
	}

	// ReleaseDateString test
	@Test
	public void testGetReleaseDateString1() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetReleaseDateString1() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "0";
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetReleaseDateString2() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetReleaseDateString2() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "2147483647";
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetReleaseDateString3() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetReleaseDateString3() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "-2147483648";
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetReleaseDateString4() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetReleaseDateString4() {
		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = null;
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetReleaseDateString5() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetReleaseDateString5() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "";
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetReleaseDateString6() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}


	@Test
	public void testSetReleaseDateString6() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = " ";
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetReleaseDateString7() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetReleaseDateString7() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "　";
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}
	@Test
	public void testGetReleaseDateString8() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}
	@Test
	public void testSetReleaseDateString8() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123";
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetReleaseDateString9() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetReleaseDateString9() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "あいう１２３";
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}

	@Test
	public void testGetReleaseDateString10() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}

	@Test
	public void testSetReleaseDateString10() {

		PurchaseHistoryInfoDTO dto = new PurchaseHistoryInfoDTO();
		String expected = "abc123あいう１２３漢字";
		dto.setReleaseDateString(expected);

		String actual  = dto.getReleaseDateString();
		assertEquals(expected , actual);
	}
}