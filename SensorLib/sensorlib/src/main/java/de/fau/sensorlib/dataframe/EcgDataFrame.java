/**
 * Copyright (C) 2016 Digital Sports Group, Friedrich-Alexander University Erlangen-Nuremberg (FAU).
 * <p>
 * This file is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without
 * even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. If you reuse
 * this code you have to keep or cite this comment.
 */
package de.fau.sensorlib.dataframe;

/**
 * Electrocardiography data frame.
 */
public interface EcgDataFrame {

    String EXTRA_ECG_SAMPLE_1 = "ecg1";
    String EXTRA_ECG_SAMPLE_2 = "ecg2";

    double getEcgSample();

    double getSecondaryEcgSample();
}
