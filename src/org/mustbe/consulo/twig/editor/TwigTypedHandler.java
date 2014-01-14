/*
 * Copyright 2013-2014 must-be.org
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

package org.mustbe.consulo.twig.editor;

import org.jetbrains.annotations.NotNull;
import com.intellij.codeInsight.editorActions.TypedHandlerDelegate;
import com.intellij.openapi.editor.Editor;
import com.intellij.openapi.project.Project;
import com.intellij.psi.PsiFile;
import lombok.val;

/**
 * @author VISTALL
 * @since 05.11.13.
 */
public class TwigTypedHandler extends TypedHandlerDelegate
{
	private static char[][] ourInsertChars = new char[][]{
			{
					'{',
					'%',
					'%',
					'}'
			},
			{
					'{',
					'{',
					'}',
					'}'
			},
			{
					'{',
					'#',
					'#',
					'}'
			}
	};

	@Override
	public Result charTyped(char c, Project project, Editor editor, @NotNull PsiFile file)
	{
		if(editor.getDocument().getTextLength() <= 1)
		{
			return super.charTyped(c, project, editor, file);
		}

		val offset = editor.getCaretModel().getOffset();
		for(char[] insertChar : ourInsertChars)
		{
			if(insertChar[1] == c)
			{
				CharSequence charsSequence = editor.getDocument().getCharsSequence();
				if(charsSequence.charAt(offset - 2) == insertChar[0])
				{
					editor.getDocument().insertString(offset, new StringBuilder(4).append("  ").append(insertChar[2]).append(insertChar[3]));
					editor.getCaretModel().moveToOffset(offset + 1);
					return Result.STOP;
				}
			}
		}

		return super.charTyped(c, project, editor, file);
	}
}
