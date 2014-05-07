package com.mellanox.r4h;

import java.util.LinkedList;
import java.util.List;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.util.Tool;

public class Probability {
	private final List<GenInfo> genInfoList;
	private final List<CpyCmpInfo> cpyCmpInfoList;

	public Probability(Configuration initialConf) {
		genInfoList = new LinkedList<Probability.GenInfo>();
		cpyCmpInfoList = new LinkedList<Probability.CpyCmpInfo>();
		readProbability(initialConf);
	}

	private void readProbability(Configuration initialConf) {

		cpyCmpInfoList.add(new CpyCmpInfo("/teragen1gb/part-00000", 0, 100, initialConf));
		// TODO: read probability from given xml file stream

		// for each generator:
		//		genInfoList.add(new GenInfo(generatorTool, conf, cmdArgs));
		
		// for each cpyCmp:
		//		cpyCmpInfoList.add(new CpyCmpInfo(hdfsInputPath, delayMilli, closePercentage, conf));
    }

	class GenInfo {
		final Configuration conf;
		final String[] args;
		final Tool genTool;

		public GenInfo(Tool generatorTool, Configuration conf, String[] cmdArgs) {
			this.conf=conf;
			this.args=cmdArgs;
			this.genTool=generatorTool;
		}
	}

	class CpyCmpInfo {
		final String hdfsInputPath;
		final long delayMilli;
		final int closePercentage;
		final Configuration conf;

		public CpyCmpInfo(String hdfsInputPath, long delayMilli, int closePercentage,Configuration conf) {
			this.hdfsInputPath = hdfsInputPath;
			this.delayMilli = delayMilli;
			this.closePercentage = closePercentage;
			this.conf=conf;
		}

	}

	public List<GenInfo> getGenInfoList() {
		return genInfoList;
	}
	public List<CpyCmpInfo> getCpyCmpInfoList() {
		return cpyCmpInfoList;
	}
}
