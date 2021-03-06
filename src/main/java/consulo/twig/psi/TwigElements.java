/*
 * Copyright 2013-2016 consulo.io
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package consulo.twig.psi;

import consulo.twig.TwigLanguage;
import consulo.twig.psi.impl.TwigBinaryExpressionImpl;
import consulo.twig.psi.impl.TwigBlockImpl;
import consulo.twig.psi.impl.TwigConstantExpressionImpl;
import consulo.twig.psi.impl.TwigExpressionBodyImpl;
import consulo.twig.psi.impl.TwigReferenceExpressionImpl;
import consulo.twig.psi.impl.TwigTagImpl;
import com.intellij.psi.tree.IElementType;
import consulo.psi.tree.ElementTypeAsPsiFactory;

/**
 * @author VISTALL
 * @since 02.11.13.
 */
public interface TwigElements
{
	IElementType OPEN_TAG = new ElementTypeAsPsiFactory("OPEN_TAG", TwigLanguage.INSTANCE, TwigTagImpl.class);

	IElementType CLOSE_TAG = new ElementTypeAsPsiFactory("CLOSE_TAG", TwigLanguage.INSTANCE, TwigTagImpl.class);

	IElementType BLOCK = new ElementTypeAsPsiFactory("BLOCK", TwigLanguage.INSTANCE, TwigBlockImpl.class);

	IElementType EXPRESSION_BODY = new ElementTypeAsPsiFactory("EXPRESSION_BODY", TwigLanguage.INSTANCE, TwigExpressionBodyImpl.class);

	IElementType CONSTANT_EXPRESSION = new ElementTypeAsPsiFactory("CONSTANT_EXPRESSION", TwigLanguage.INSTANCE, TwigConstantExpressionImpl.class);

	IElementType REFERENCE_EXPRESSION = new ElementTypeAsPsiFactory("REFERENCE_EXPRESSION", TwigLanguage.INSTANCE, TwigReferenceExpressionImpl.class);

	IElementType BINARY_EXPRESSION = new ElementTypeAsPsiFactory("BINARY_EXPRESSION", TwigLanguage.INSTANCE, TwigBinaryExpressionImpl.class);
}
