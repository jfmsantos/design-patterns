package estruturais.facade.facade;

import java.io.File;

import estruturais.facade.library.AudioMixer;
import estruturais.facade.library.BitrateReader;
import estruturais.facade.library.Codec;
import estruturais.facade.library.CodecFactory;
import estruturais.facade.library.MPEG4CompressionCodec;
import estruturais.facade.library.OggCompressionCodec;
import estruturais.facade.library.VideoFile;

public class VideoConversionFacade {

	 public File convertVideo(String fileName, String format) {
	        System.out.println("VideoConversionFacade: conversion started.");
	        VideoFile file = new VideoFile(fileName);
	        Codec sourceCodec = CodecFactory.extract(file);
	        Codec destinationCodec;
	        if (format.equals("mp4")) {
	            destinationCodec = new MPEG4CompressionCodec();
	        } else {
	            destinationCodec = new OggCompressionCodec();
	        }
	        VideoFile buffer = BitrateReader.read(file, sourceCodec);
	        VideoFile intermediateResult = BitrateReader.convert(buffer, destinationCodec);
	        File result = (new AudioMixer()).fix(intermediateResult);
	        System.out.println("VideoConversionFacade: conversion completed.");
	        return result;
	    }
}
