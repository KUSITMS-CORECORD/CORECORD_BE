package corecord.dev.domain.folder.entity;

import corecord.dev.common.base.BaseEntity;
import corecord.dev.domain.record.entity.Record;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Folder extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long folderId;

    @Column(nullable = false, length = 15)
    private String title;

    @OneToOne(mappedBy = "folder")
    private Record record;

    public void updateTitle(String title) {
        this.title = title;
    }
}
