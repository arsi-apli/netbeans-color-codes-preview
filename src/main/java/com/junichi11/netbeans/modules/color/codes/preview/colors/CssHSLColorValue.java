/*
 * Copyright 2018 junichi11.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.junichi11.netbeans.modules.color.codes.preview.colors;

import com.junichi11.netbeans.modules.color.codes.preview.colors.model.AbstractColorValue;
import com.junichi11.netbeans.modules.color.codes.preview.colors.model.ColorCodesProvider;
import com.junichi11.netbeans.modules.color.codes.preview.utils.ColorType;
import com.junichi11.netbeans.modules.color.codes.preview.utils.ColorsUtils;
import java.awt.Color;
import org.netbeans.api.annotations.common.NonNull;

public class CssHSLColorValue extends AbstractColorValue {

    public CssHSLColorValue(@NonNull ColorCodesProvider colorCodesProvider, String value, int startOffset, int endOffset, int line) {
        super(colorCodesProvider, value, startOffset, endOffset, line);
    }

    @Override
    public Color getColor() {
        return ColorsUtils.decode(getValue(), ColorType.CSS_HSL);
    }

    @Override
    public ColorType getType() {
        return ColorType.CSS_HSL;
    }

}
