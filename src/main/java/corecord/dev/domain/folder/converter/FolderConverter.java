package corecord.dev.domain.folder.converter;

import corecord.dev.domain.folder.dto.response.FolderResponse;
import corecord.dev.domain.folder.entity.Folder;

import java.util.List;

public class FolderConverter {

    public static Folder toFolderEntity(String title) {
        return Folder.builder()
                .title(title)
                .build();
    }

    public static FolderResponse.FolderDto toFolderDto(Folder folder) {
        return FolderResponse.FolderDto.builder()
                .title(folder.getTitle())
                .build();
    }

    public static FolderResponse.FolderDtoList toFolderDtoList(List<FolderResponse.FolderDto> folderDtoList) {
        return FolderResponse.FolderDtoList.builder()
                .folderDtoList(folderDtoList)
                .build();
    }
}
