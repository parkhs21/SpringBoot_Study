package umc.study.domain.mapping;

import umc.study.domain.Member;
import umc.study.domain.common.BaseEntity;
import umc.study.domain.enums.MissionStatus;
import lombok.*;
import javax.persistence.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class MemberMission extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "mission_id")
    private Member mission;

    @Enumerated(EnumType.STRING)
    private MissionStatus status;
}