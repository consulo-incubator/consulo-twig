/*
 * Copyright 2013 must-be.org
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

package org.mustbe.consulo.twig.highlight;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.fileTypes.SyntaxHighlighterFactory;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.vfs.VirtualFile;

/**
 * @author VISTALL
 * @since 02.11.13.
 */
public class TwigSyntaxHighlighterFactory extends SyntaxHighlighterFactory
{
	@NotNull
	@Override
	public SyntaxHighlighter getSyntaxHighlighter(@Nullable Project project, @Nullable VirtualFile virtualFile)
	{
		return new TwigSyntaxHighlighter();
	}
}
