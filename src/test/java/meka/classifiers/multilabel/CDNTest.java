/*
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

/*
 * Copyright (C) 2012 University of Waikato, Hamilton, New Zealand
 */

package meka.classifiers.multilabel;

import junit.framework.Test;
import junit.framework.TestSuite;
import meka.classifiers.AbstractMekaClassifierTest;
import weka.classifiers.Classifier;

/**
 * Tests CDN. Run from the command line with:<p/>
 * java meka.classifiers.multilabel.CDNTest
 *
 * @author FracPete (fracpete at waikato dot ac dot nz)
 * @version $Revision: 66 $
 */
public class CDNTest 
  extends AbstractMultiLabelClassifierTest {

  /**
   * Initializes the test.
   * 
   * @param name the name of the test
   */
  public CDNTest(String name) { 
    super(name);  
  }

  /** 
   * Creates a default classifier.
   * 
   * @return the classifier
   */
  @Override
  public Classifier getClassifier() {
    return new CDN();
  }

  public static Test suite() {
    return new TestSuite(CDNTest.class);
  }

  public static void main(String[] args){
    junit.textui.TestRunner.run(suite());
  }
}
