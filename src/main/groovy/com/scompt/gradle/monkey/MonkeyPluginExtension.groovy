/*
 * The MIT License (MIT)
 *
 * Copyright (c) 2013 Edward Dale
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.

 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package com.scompt.gradle.monkey

import org.gradle.api.Project

class MonkeyPluginExtension {
    def Object outputDirectory
    def Object apkDirectory
    def Boolean teamCityLog = false
    def String apkFileNameRegex = ".*debug-unaligned.*.apk"
    def String testApkFileNameRegex = ".*test-unaligned.*.apk"

    private final Project project

    public MonkeyPluginExtension(Project project) {
        this.project = project
        this.outputDirectory = {
            return project.project.getBuildDir()
        }
    }

    File getOutputDirectory() {
        return project.file(outputDirectory)
    }

    void setOutputDirectory(Object outputDirectory) {
        this.outputDirectory = outputDirectory
    }

    File getApkDirectory() {
        return project.file(apkDirectory)
    }

    void setApkDirectory(Object apkDirectory) {
        this.apkDirectory = apkDirectory
    }

}