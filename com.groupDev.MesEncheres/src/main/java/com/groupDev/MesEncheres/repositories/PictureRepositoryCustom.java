package com.groupDev.MesEncheres.repositories;

import java.io.File;
import java.util.Optional;

import com.groupDev.MesEncheres.auctions.Picture;
import com.groupDev.MesEncheres.auctions.Tag;

public interface PictureRepositoryCustom {
	
	

	boolean savePictureFile(Picture p, File f);
	Optional<File> getPictureFile(Picture p);
	Optional<File> getPictureThumbFile(Picture p);
	boolean removePictureFile(int id);
	
	Tag addTagToPicture(int pictureId, int tagId);
	Tag removeTagFromPicture(int picturerId, int tagId);
	Iterable<Picture> findPictureByTags(Iterable<Integer> tagids);
}
