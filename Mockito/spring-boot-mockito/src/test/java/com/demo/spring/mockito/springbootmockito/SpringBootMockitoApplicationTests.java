package com.demo.spring.mockito.springbootmockito;

import com.demo.spring.mockito.springbootmockito.controller.UserUtil;
import com.demo.spring.mockito.springbootmockito.dao.UserRepository;
import com.demo.spring.mockito.springbootmockito.model.Response;
import com.demo.spring.mockito.springbootmockito.model.User;
import com.demo.spring.mockito.springbootmockito.service.UserPowerMockService;
import com.demo.spring.mockito.springbootmockito.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
//@PrepareForTest(fullyQualifiedNames = "com.demo.spring.mockito.springbootmockito.controller.UserUtil")
class SpringBootMockitoApplicationTests {

    @MockBean
    private UserRepository userRepository;

    @InjectMocks
    private UserPowerMockService userPowerMockService;
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private UserService userService;

    @Before
    public void setUp() throws JsonProcessingException {
        MockitoAnnotations.initMocks(UserUtil.class);

        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        User user = new User();
        user.setId(1);
        user.setAddress("Pune");
        user.setAge(22);
        user.setName("Rajesh");

        userData = mapper.writeValueAsString(user);
    }

    ObjectMapper mapper = new ObjectMapper();
    String userData = "";


    @Test
    public void addUser() throws Exception {
        MvcResult mvcResult = mockMvc.perform(post("/User/addUser").content(userData)
                        .contentType(MediaType.APPLICATION_JSON_VALUE)).andExpect(status().isOk())
                .andReturn();
        String resultContent = mvcResult.getResponse().getContentAsString();
        Response response = mapper.readValue(resultContent, Response.class);
        assertEquals(response.getStatus(), Boolean.TRUE);
    }

    @Test
    public void findAllUser() throws Exception {
        MvcResult mvcResult = mockMvc.perform(get("/User/findAllUser")).andExpect(status().isOk()).andReturn();
        String data = mvcResult.getResponse().getContentAsString();
        Response response = mapper.readValue(data, Response.class);
        assertEquals(response.getStatus(), Boolean.TRUE);
    }

    @Test
    void getUserTest() {
        when(userRepository.findAll()).thenReturn(Stream
                .of(new User(376, "Danile", 31, "USA"),
                        new User(958, "Huy", 35, "UK"))
                .collect(Collectors.toList()));
        assertEquals(2, userService.getAllUsers().size());
    }

    @Test
    public void getUserByAddressTest() {
        String address = "Bangalore";
        when(userRepository.findByAddress(address))
                .thenReturn(Stream.of(new User(376, "Danile", 31, "USA"))
                        .collect(Collectors.toList()));
        assertEquals(1, userService.findUserByAddress(address).size());
    }

    @Test
    public void saveUserTest() {
        User user = new User(999, "Pranya", 33, "Pune");
        when(userRepository.save(user)).thenReturn(user);
        assertEquals(user, userService.addUser(user));
    }

    @Test
    public void deleteUserTest() {
        User user = new User(999, "Pranya", 33, "Pune");
        userService.deleteUser(user);
        verify(userRepository, times(1)).delete(user);
    }

    @Test
    public void testThanks() {
        PowerMockito.mockStatic(UserUtil.class);
        //when
        when(UserUtil.sendThanksMsg()).thenReturn("success");
        //then
        assertEquals("success", userPowerMockService.thanks());
    }
}
