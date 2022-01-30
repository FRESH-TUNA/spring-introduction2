package hello.core.member;

/*
 * 테스트할때 아래의 Asserrtions를 많이 쓴다.
 */
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();

    @Test
    public void join() {
        //given
        Member member = new Member(1L, "memberA", Grade.VIP);

        //when
        memberService.join(member);
        memberService.findMember(1L);

        //then
        Assertions.assertThat(member).isEqualTo(
                memberService.findMember(1L));
    }
}