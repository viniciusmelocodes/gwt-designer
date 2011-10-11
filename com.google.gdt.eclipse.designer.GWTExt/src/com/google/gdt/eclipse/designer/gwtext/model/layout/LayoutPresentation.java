/*
 * Copyright 2011 Google Inc. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.gdt.eclipse.designer.gwtext.model.layout;

import org.eclipse.wb.internal.core.model.presentation.DefaultJavaInfoPresentation;
import org.eclipse.wb.internal.core.model.presentation.IObjectPresentation;

/**
 * Implementation of {@link IObjectPresentation} for {@link LayoutInfo}.
 * 
 * @author scheglov_ke
 * @coverage GWTExt.model.layout
 */
public final class LayoutPresentation extends DefaultJavaInfoPresentation {
  ////////////////////////////////////////////////////////////////////////////
  //
  // Constructor
  //
  ////////////////////////////////////////////////////////////////////////////
  public LayoutPresentation(LayoutInfo layoutInfo) {
    super(layoutInfo);
  }

  ////////////////////////////////////////////////////////////////////////////
  //
  // IObjectPresentation
  //
  ////////////////////////////////////////////////////////////////////////////
  @Override
  public boolean isVisible() throws Exception {
    return false;
  }
}