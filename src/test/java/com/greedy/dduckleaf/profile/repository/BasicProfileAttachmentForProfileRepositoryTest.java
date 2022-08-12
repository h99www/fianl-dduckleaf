package com.greedy.dduckleaf.profile.repository;

import com.greedy.dduckleaf.config.BeanConfiguration;
import com.greedy.dduckleaf.config.DduckleafApplication;
import com.greedy.dduckleaf.config.JPAConfiguration;
import com.greedy.dduckleaf.profile.entity.BasicProfileAttachment;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@ContextConfiguration(classes = {
        BeanConfiguration.class,
        com.greedy.dduckleaf.config.ContextConfiguration.class,
        JPAConfiguration.class,
        DduckleafApplication.class
})
class BasicProfileAttachmentForProfileRepositoryTest {

    @Autowired
    private BasicProfileAttachmentForProfileRepository basicProfileAttachmentForProfileRepository;

    @Test
    public void initTest() {
        assertNotNull(basicProfileAttachmentForProfileRepository);
    }

    @Test
    @DisplayName("번호로 기본이미지 정보 불러오기 테스트")
    public void findByIdTest() {

        //given
        int basicProfileAttachmentNo = 1;

        //when
        BasicProfileAttachment basicProfileAttachment = basicProfileAttachmentForProfileRepository.findById(basicProfileAttachmentNo).get();

        //then
        System.out.println(basicProfileAttachment);
        assertNotNull(basicProfileAttachment);
    }
}