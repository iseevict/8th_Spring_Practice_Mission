package umc.converter.member;

import umc.domain.FoodCategory;
import umc.domain.Member;
import umc.domain.mapping.PreferCategory;
import umc.dto.member.MemberRequestDTO;
import umc.dto.member.MemberResponseDTO;

import java.time.LocalDateTime;
import java.util.List;

public class MemberConverter {

    public static MemberResponseDTO.JoinResultDto toJoinResultDto(Member member) {
        return MemberResponseDTO.JoinResultDto.builder()
                .memberId(member.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Member toMember(MemberRequestDTO.JoinDto request) {
        return Member.builder()
                .name(request.getName())
                .gender(request.getGender())
                .address(request.getAddress())
                .birth(request.getBirth())
                .mail(request.getMail())
                .password(request.getPassword())
                .role(request.getRole())
                .isPhone(request.getIsPhone())
                .phoneNum(request.getPhoneNum())
                .loginType(request.getLoginSort())
                .build();
    }

    public static MemberResponseDTO.LoginResultDTO toLoginResultDTO (Long memberId, String accessToken) {
        return MemberResponseDTO.LoginResultDTO.builder()
                .memberId(memberId)
                .accessToken(accessToken)
                .build();
    }

    public static MemberResponseDTO.MemberInfoDTO toMemberInfoDTO (Member member) {
        return MemberResponseDTO.MemberInfoDTO.builder()
                .name(member.getName())
                .mail(member.getMail())
                .gender(member.getGender())
                .birth(member.getBirth())
                .build();
    }
}
