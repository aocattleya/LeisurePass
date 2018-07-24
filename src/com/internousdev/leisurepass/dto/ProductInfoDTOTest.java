package com.internousdev.leisurepass.dto;


import static org.junit.Assert.*;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class ProductInfoDTOTest {

	//get Id test
	@Test
	public void testGetId1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetId4() throws Exception{
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax=Integer.parseInt("2147483648");
			dto.setId(postalMax);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetId5() throws Exception{
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMin=Integer.parseInt("-2147483649");
			dto.setId(postalMin);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	// set Id test
	@Test
	public void testSetId1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setId(expected);
		int actual = dto.getId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetId4() throws Exception{
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax=Integer.parseInt("2147483648");
			dto.setId(postalMax);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	public void testSetId5() throws Exception{
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMin=Integer.parseInt("-2147483649");
			dto.setId(postalMin);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}


	// get ProductId test
	@Test
	public void testGetProductId1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductId4() throws Exception{
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax=Integer.parseInt("2147483648");
			dto.setProductId(postalMax);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetProductId5() throws Exception{
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMin=Integer.parseInt("-2147483649");
			dto.setProductId(postalMin);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	// set ProductId test
	@Test
	public void testSetProductId1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setProductId(expected);
		int actual = dto.getProductId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductId4() throws Exception{
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax=Integer.parseInt("2147483648");
			dto.setProductId(postalMax);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}

	public void testSetProductId5() throws Exception{
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMin=Integer.parseInt("-2147483649");
			dto.setProductId(postalMin);

		}catch(RuntimeException e){
		assertEquals(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	// get ProductName test
	@Test
	public void testGetProductName() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="0";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="-2147483648";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected =" ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductName10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	// set ProductName test
	@Test
	public void testSetProductName1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="0";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="2147483647";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="-2147483648";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="null";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected =" ";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="abc123";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="あいう１２３";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductName10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setProductName(expected);
		String actual = dto.getProductName();
		assertEquals(expected, actual);
	}

	// get ProductNameKana test
	@Test
	public void testGetProductNameKana1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "0";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "-2147483648";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "null";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductNameKana10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	// set ProductNameKana test
	@Test
	public void testSetProductNameKana1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "0";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "2147483647";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "-2147483648";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "null";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductNameKana10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductNameKana(expected);
		String actual = dto.getProductNameKana();
		assertEquals(expected, actual);
	}

	//  get ProductDescription test
	@Test
	public void testGetProductDescription1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "0";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "2147483647";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "-2147483648";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "null";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductDescription10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	// set ProductDescription test
	@Test
	public void testSetProductDescription() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "0";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "2147483647";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "-2147483648";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "null";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductDescription10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setProductDescription(expected);
		String actual = dto.getProductDescription();
		assertEquals(expected, actual);
	}

	// get CategoryId test
	@Test
	public void testGetCategoryId1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategoryId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategoryId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetCategoryId4() throws Exception {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setCategoryId(postalMax);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetCategoryId5() throws Exception {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483649");
			dto.setCategoryId(postalMin);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	// set CategoryId test
	@Test
	public void testSetCategoryId1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategoryId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategoryId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setCategoryId(expected);
		int actual = dto.getCategoryId();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetCategoryId4() throws Exception {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setCategoryId(postalMax);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetCategoryId5() throws Exception {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483649");
			dto.setCategoryId(postalMin);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	// get PlaceId test
	@Test
	public void testGetPlaceId1(){
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setPlaceId(expected);
		int actual = dto.getPlaceId();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPlaceId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setPlaceId(expected);
		int actual = dto.getPlaceId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPlaceId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setPlaceId(expected);
		int actual = dto.getPlaceId();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPlaceId4() throws Exception {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setCategoryId(postalMax);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetPlaceId5() throws Exception {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483649");
			dto.setCategoryId(postalMin);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	// set PlaceId test
	@Test
	public void testSetPlaceId1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setPlaceId(expected);
		int actual = dto.getPlaceId();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPlaceId2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setPlaceId(expected);
		int actual = dto.getPlaceId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPlaceId3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setPlaceId(expected);
		int actual = dto.getPlaceId();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPlaceId4() throws Exception {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setCategoryId(postalMax);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetPlaceId5() throws Exception {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483649");
			dto.setCategoryId(postalMin);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	// get Price test
	@Test
	public void testGetPrice1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetPrice2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetPrice4() throws Exception {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setCategoryId(postalMax);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetPrice5() throws Exception {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483649");
			dto.setCategoryId(postalMin);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}


	// set Price test
	@Test
	public void testSetPrice1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetPrice2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setPrice(expected);
		int actual = dto.getPrice();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetPrice4() throws Exception {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setCategoryId(postalMax);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}
	@Test
	public void testPrice5() throws Exception {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483649");
			dto.setCategoryId(postalMin);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	// get ImageFilePath test
	@Test
	public void testGetImageFilePath1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="0";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="2147473647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="-2147483648";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected =null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetImageFilePath6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected =" ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testGetImageFilePath10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	// set ImageFilePath test
	@Test
	public void testSetImageFilePath1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="0";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="2147483647";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="-2147483648";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected =null;

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetImageFilePath6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected =" ";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="　";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="abc123";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="あいう１２３";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	@Test
	public void testSetImageFilePath10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected ="abc123あいう１２３漢字";

		dto.setImageFilePath(expected);
		String actual = dto.getImageFilePath();
		assertEquals(expected,actual);
	}

	// get ImageFileName test
	@Test
	public void testGetImageFileName1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "0";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "-2147483648";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetImageFileName10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	// set ImageFileName test
	@Test
	public void testSetImageFileName1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "0";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "2147483647";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "-2147483648";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = null;

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = " ";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "　";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "あいう１２３";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetImageFileName10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected = "abc123あいう１２３漢字";

		dto.setImageFileName(expected);
		String actual = dto.getImageFileName();
		assertEquals(expected, actual);
	}

	// get  ReleaseDate test
	@Test
	public void testGetReleaseDate1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseDate2() throws ParseException {
		ProductInfoDTO dto = new ProductInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setReleaseDate(expected);
		assertEquals(expected, dto.getReleaseDate());
	}

	// set ReleaseDate test
	@Test
	public void testSetReleaseDate1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setReleaseDate(expected);
		Date actual = dto.getReleaseDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseDate2() throws ParseException {
		ProductInfoDTO dto = new ProductInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setReleaseDate(expected);
		assertEquals(expected, dto.getReleaseDate());
	}

	//get ReleaseCompany test
	@Test
	public void testGetReleaseCompany1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="0";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetReleaseCompany2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="-2147483648";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=" ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetReleaseCompany10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	// set ReleaseCompany test
	@Test
	public void testSetReleaseCompany1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="0";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetReleaseCompany2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="2147483647";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseCompany3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="-2147483648";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseCompany4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=null;

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseCompany5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseCompany6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=" ";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseCompany7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="　";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseCompany8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseCompany9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="あいう１２３";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetReleaseCompany10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setReleaseCompany(expected);
		String actual = dto.getReleaseCompany();
		assertEquals(expected, actual);
	}

	//get Location test
	@Test
	public void testGetLocation1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="0";

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetLocation2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="2147483647";

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLocation3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="-2147483648";

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLocation4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=null;

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLocation5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="";

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLocation6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=" ";

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLocation7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="　";

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLocation8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123";

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLocation9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="あいう１２３";

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetLocation10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}

	// set Location test
	@Test
	public void testSetLocation1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="0";

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetLocation2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="2147483647";

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLocation3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="-2147483648";

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLocation4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=null;

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLocation5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="";

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLocation6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=" ";

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLocation7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="　";

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLocation8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123";

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLocation9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="あいう１２３";

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetLocation10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setLocation(expected);
		String actual = dto.getLocation();
		assertEquals(expected, actual);
	}

	//get Access test
	@Test
	public void testGetAccess1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="0";

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetAccess2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="2147483647";

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAccess3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="-2147483648";

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAccess4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=null;

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAccess5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="";

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAccess6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=" ";

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAccess7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="　";

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAccess8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123";

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAccess9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="あいう１２３";

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetAccess10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}

	// set Access test
	@Test
	public void testSetAccess1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="0";

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetAccess2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="2147483647";

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAccess3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="-2147483648";

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAccess4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=null;

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAccess5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="";

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAccess6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=" ";

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAccess7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="　";

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAccess8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123";

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAccess9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="あいう１２３";

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetAccess10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setAccess(expected);
		String actual = dto.getAccess();
		assertEquals(expected, actual);
	}

	//get Url test
	@Test
	public void testGetUrl1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="0";

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetUrl2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="2147483647";

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUrl3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="-2147483648";

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUrl4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=null;

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUrl5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="";

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUrl6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=" ";

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUrl7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="　";

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUrl8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123";

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUrl9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="あいう１２３";

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUrl10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}

	// set Url test
	@Test
	public void testSetUrl1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="0";

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetUrl2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="2147483647";

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUrl3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="-2147483648";

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUrl4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=null;

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUrl5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="";

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUrl6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=" ";

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUrl7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="　";

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUrl8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123";

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUrl9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="あいう１２３";

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUrl10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setUrl(expected);
		String actual = dto.getUrl();
		assertEquals(expected, actual);
	}

	// get Status test
	@Test
	public void testGetStatus1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testGetStatus4() throws Exception {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setStatus(postalMax);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}
	@Test
	public void testGetStatus5() throws Exception {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483649");
			dto.setStatus(postalMin);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	// set Status test
	@Test
	public void testSetStatus1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 0;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = 2147483647;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		int expected = -2147483648;

		dto.setStatus(expected);
		int actual = dto.getStatus();
		assertEquals(expected,actual);
	}
	@Test
	public void testSetStatus4() throws Exception {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMax = Integer.parseInt("2147483648");
			dto.setStatus(postalMax);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"2147483648\"");
		}
	}
	@Test
	public void testSetStatus5() throws Exception {
		ProductInfoDTO dto = new ProductInfoDTO();
		try{
			int postalMin = Integer.parseInt("-2147483649");
			dto.setStatus(postalMin);

		}catch (RuntimeException e) {
			assertEquals(e.getMessage(),"For input string: \"-2147483649\"");
		}
	}

	// get  StartDate test
	@Test
	public void testGetStartDate1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setStartDate(expected);
		Date actual = dto.getStartDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetStartDate2() throws ParseException {
		ProductInfoDTO dto = new ProductInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setStartDate(expected);
		assertEquals(expected, dto.getStartDate());
	}

	// set StartDate test
	@Test
	public void testSetStartDate1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setStartDate(expected);
		Date actual = dto.getStartDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetStartDate2() throws ParseException {
		ProductInfoDTO dto = new ProductInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setStartDate(expected);
		assertEquals(expected, dto.getStartDate());
	}

	// get  EndDate test
	@Test
	public void testGetEndDate1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setEndDate(expected);
		Date actual = dto.getEndDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetEndDate2() throws ParseException {
		ProductInfoDTO dto = new ProductInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setEndDate(expected);
		assertEquals(expected, dto.getEndDate());
	}

	// set EndDate test
	@Test
	public void testSetEndDate1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setEndDate(expected);
		Date actual = dto.getEndDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetEndDate2() throws ParseException {
		ProductInfoDTO dto = new ProductInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setEndDate(expected);
		assertEquals(expected, dto.getEndDate());
	}

	// get  registDate test
	@Test
	public void testGetRegistDate1() {
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

	// set registDate test
	@Test
	public void testSetRegistDate1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setRegistDate(expected);
		Date actual = dto.getRegistDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetRegistDate2() throws ParseException {
		ProductInfoDTO dto = new ProductInfoDTO();

		SimpleDateFormat sdf= new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setRegistDate(expected);
		assertEquals(expected, dto.getRegistDate());
	}


	//get UpdateDate test
	@Test
	public void testGetUpdateDate1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetUpdateDate2() throws ParseException{
		ProductInfoDTO dto = new ProductInfoDTO();

		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected,dto.getUpdateDate());
	}

	//set UpdateDate test
	@Test
	public void testSetUpdateDate1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		Date expected = null;

		dto.setUpdateDate(expected);
		Date actual = dto.getUpdateDate();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetUpdateDate2() throws ParseException{
		ProductInfoDTO dto = new ProductInfoDTO();

		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMdd HH:mm:ss");
		Date expected = sdf.parse("20180420 12:00:00");
		dto.setUpdateDate(expected);
		assertEquals(expected,dto.getUpdateDate());
	}

	//get ProductImage test
	@Test
	public void testGetProductImage(){
		ProductInfoDTO dto = new ProductInfoDTO();

		File expected = null;

		dto.setProductImage(expected);
		File actual = dto.getProductImage();
		assertEquals(expected, actual);
	}

	//set ProductImage test
	@Test
	public void testSetProductImage(){
		ProductInfoDTO dto = new ProductInfoDTO();
		File expected = null;

		dto.setProductImage(expected);
		File actual = dto.getProductImage();
		assertEquals(expected, actual);
	}

	//get ProductImageContentType test
	@Test
	public void testGetProductImageContentType1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="0";

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductImageContentType2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="2147483647";

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductImageContentType3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="-2147483648";

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductImageContentType4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=null;

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductImageContentType5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="";

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductImageContentType6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=" ";

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductImageContentType7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="　";

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductImageContentType8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123";

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductImageContentType9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="あいう１２３";

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductImageContentType10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}

	// set ProductImageContentType test
	@Test
	public void testSetProductImageContentType1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="0";

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductImageContentType2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="2147483647";

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductImageContentType3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="-2147483648";

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductImageContentType4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=null;

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductImageContentType5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="";

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductImageContentType6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=" ";

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductImageContentType7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="　";

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductImageContentType8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123";

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductImageContentType9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="あいう１２３";

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductImageContentType10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setProductImageContentType(expected);
		String actual = dto.getProductImageContentType();
		assertEquals(expected, actual);
	}

	//get ProductImageFileName test
	@Test
	public void testGetProductImageFileName1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="0";

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testGetProductImageFileName2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="2147483647";

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductImageFileName3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="-2147483648";

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductImageFileName4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=null;

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductImageFileName5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="";

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductImageFileName6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=" ";

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductImageFileName7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="　";

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductImageFileName8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123";

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductImageFileName9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="あいう１２３";

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testGetProductImageFileName10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}

	// set ProductImageFileName test
	@Test
	public void testSetProductImageFileName1() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="0";

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}

	@Test
	public void testSetProductImageFileName2() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="2147483647";

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductImageFileName3() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="-2147483648";

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductImageFileName4() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=null;

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductImageFileName5() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="";

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductImageFileName6() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected=" ";

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductImageFileName7() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="　";

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductImageFileName8() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123";

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductImageFileName9() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="あいう１２３";

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}
	@Test
	public void testSetProductImageFileName10() {
		ProductInfoDTO dto = new ProductInfoDTO();
		String expected="abc123あいう１２３漢字";

		dto.setProductImageFileName(expected);
		String actual = dto.getProductImageFileName();
		assertEquals(expected, actual);
	}
}