package hello.core.member;

public class MemberServiceImpl implements MemberService{
    /*
     * 구현체를 직접할당하므로 OCP 관점에서 좋지 않다.
     */
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
