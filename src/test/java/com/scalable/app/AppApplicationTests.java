// package com.scalable.app;

// import static org.junit.jupiter.api.Assertions.assertEquals;
// import static org.junit.jupiter.api.Assertions.assertFalse;
// import static org.junit.jupiter.api.Assertions.assertNotNull;
// import static org.junit.jupiter.api.Assertions.assertNull;
// import static org.junit.jupiter.api.Assertions.assertTrue;

// import java.util.HashMap;
// import java.util.List;
// import java.util.Map;

// import org.springframework.http.MediaType;
// import org.junit.jupiter.api.Test;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
// import org.springframework.test.web.servlet.MockMvc;
// import org.springframework.test.web.servlet.MvcResult;
// import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
// import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

// import com.fasterxml.jackson.databind.ObjectMapper;
// import com.scalable.model.Cart;
// import com.scalable.repository.CartRepository;
// import com.scalable.services.CartService;

// @WebMvcTest
// class AppApplicationTests {
    
// 	@Autowired
//     private MockMvc mockMvc;

// 	@Autowired
// 	private ObjectMapper objectMapper;
// 	@Autowired
// 	private CartService cartService;
//     @Autowired
//     private CartRepository cartRepository;

// 	@Test
// 	void contextLoads() {
// 	}
    


//     @Test
//     void testEditItemInCart_ItemExistsInRepository() {
//         // Test case where the item exists and is edited successfully
//         Cart result = cartRepository.editItemInCart(1, "item1", "newItem");

//         assertNotNull(result, "Cart should not be null");
//         assertTrue(result.getItems().contains("newItem"), "New item should be added");
//         assertFalse(result.getItems().contains("item1"), "Old item should be removed");

//         List<Cart> carts = cartRepository.getCarts();
//         boolean cartExist = false;
//         for(Cart cart : carts){
//             if(cart.getId() == 1 && cart.getUserId() == 1 && cart.getItems().contains("newItem")){
//                 cartExist = true;
//                 break;
//             }
//         }
//         assertTrue(cartExist, "Updated Cart should exist in data.json");

//     }

// 	// @Test
//     // void testEditItemInCart_ItemExistsInService() {
//     //     // Test case where the item exists and is edited successfully
//     //     Cart result = cartService.editItemInCart(1, "item1", "newItem");

//     //     assertNotNull(result, "Cart should not be null");
//     //     assertTrue(result.getItems().contains("newItem"), "New item should be added");
//     //     assertFalse(result.getItems().contains("item1"), "Old item should be removed");
//     // }

//     // @Test
//     // void testEditItemInCart_CartNotFound() {
//     //     // Test case where the cart doesn't exist
//     //     Cart result = cartService.editItemInCart(999, "item1", "newItem");

//     //     assertNull(result, "Cart should be null if cartId doesn't exist");
//     // }

// 	// @Test
//     // void testEditItemInCart_EndPoint() throws Exception {
//     //     Map<String, Object> requestBody = new HashMap<>();
//     //     requestBody.put("cartId", 1); // Non-existing cartId
//     //     requestBody.put("item", "item1");
//     //     requestBody.put("newItem", "newItem");


//     //      MvcResult result = mockMvc.perform(MockMvcRequestBuilders
//     //                 .post("/editItemInCart")
//     //                 .content(objectMapper.writeValueAsString(requestBody))
//     //                 .contentType(MediaType.APPLICATION_JSON))
//     //         .andExpect(MockMvcResultMatchers.status().isOk())  // Check if the status is OK (200)
//     //         .andReturn();

// 	// 	String responseContent = result.getResponse().getContentAsString();

// 	// 	Cart responseCart = objectMapper.readValue(responseContent, Cart.class);
// 	// 	assertNotNull(responseCart);
// 	// 	assertEquals(1, responseCart.getId());
// 	// 	assertTrue(responseCart.getItems().contains("newItem"));
//     // }

	

// }
