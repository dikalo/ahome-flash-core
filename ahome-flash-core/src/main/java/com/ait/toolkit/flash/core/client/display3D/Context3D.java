/*
 Copyright (c) 2014 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.flash.core.client.display3D;

import com.ait.toolkit.flash.core.client.display.BitmapData;
import com.ait.toolkit.flash.core.client.display3D.textures.CubeTexture;
import com.ait.toolkit.flash.core.client.display3D.textures.Texture;
import com.ait.toolkit.flash.core.client.display3D.textures.TextureBase;
import com.ait.toolkit.flash.core.client.events.EventDispatcher;
import com.ait.toolkit.flash.core.client.geom.Matrix3D;
import com.ait.toolkit.flash.core.client.geom.Rectangle;
import com.ait.toolkit.flash.core.client.toplevel.NumberVector;
import com.google.gwt.core.client.JavaScriptObject;

/**
 * <p>
 * The Context3D class provides a context for rendering geometrically defined
 * graphics. A rendering context includes a drawing surface and its associated
 * resources and state. When possible, the rendering context uses the hardware
 * graphics processing unit (GPU). Otherwise, the rendering context uses
 * software. (If rendering through Context3D is not supported on a platform, the
 * stage3Ds property of the Stage object contains an empty list.)
 * </p>
 * <p>
 * The Context3D rendering context is a programmable pipeline that is very
 * similar to OpenGL ES 2, but is abstracted so that it is compatible with a
 * range of hardware and GPU interfaces. Although designed for 3D graphics, the
 * rendering pipeline does not mandate that the rendering is three dimensional.
 * Thus, you can create a 2D renderer by supplying the appropriate vertex and
 * pixel fragment programs. In both the 3D and 2D cases, the only geometric
 * primitive supported is the triangle.
 * </p>
 * <p>
 * Get an instance of the Context3D class by calling the requestContext3D()
 * method of a Stage3D object. A limited number of Context3D objects can exist
 * per stage; one for each Stage3D in the Stage.stage3Ds list. When the context
 * is created, the Stage3D object dispatches a context3DCreate event. A
 * rendering context can be destroyed and recreated at any time, such as when
 * another application that uses the GPU gains focus. Your code should
 * anticipate receiving multiple context3DCreate events. NotificationPosition the rendering
 * area on the stage using the x and y properties of the associated Stage3D
 * instance.
 * </p>
 * 
 * To render and display a scene (after getting a Context3D object), the
 * following steps are typical:
 * 
 * <ol>
 * <li>
 * Configure the main display buffer attributes by calling
 * configureBackBuffer().</li>
 * <li>Create and initialize your rendering resources, including:
 * 
 * <ul>
 * <li>Vertex and index buffers defining the scene geometry</li>
 * <li>Vertex and pixel programs (shaders) for rendering the scene</li>
 * <li>Textures</li>
 * </ul>
 * </li>
 * <li>Render a frame:
 * <ul>
 * <li>Set the render state as appropriate for an object or collection of
 * objects in the scene.</liY
 * <li>Call the drawTriangles() method to render a set of triangles.</li>
 * <li>Change the rendering state for the next group of objects.</li>
 * <li>Call drawTriangles() to draw the triangles defining the objects.
 * <li>
 * <li>Repeat until the scene is entirely rendered.</li>
 * <li>Call the present() method to display the rendered scene on the stage.</li>
 * </lu></li>
 * </ol>
 * 
 * <p>
 * The following limits apply to rendering:
 * </p>
 * <p>
 * Resource limits:
 * </p>
 * <table border="1">
 * <tr>
 * <th>Resource</th>
 * <th>Number allowed</th>
 * <th>Total Memory</th>
 * </tr>
 * <tr>
 * <td>Vertex buffers</td>
 * <td>4096</td>
 * <td>256 MB</td>
 * </tr>
 * <tr>
 * <td>Index buffers</td>
 * <td>4096</td>
 * <td>128 MB</td>
 * </tr>
 * <tr>
 * <td>Programs</td>
 * <td>4096</td>
 * <td>16 MB</td>
 * </tr>
 * <tr>
 * <td>Textures</td>
 * <td>128</td>
 * <td>256 MB</td>
 * </tr>
 * <tr>
 * <td>Cube Textures</td>
 * <td>4096</td>
 * <td>256 MB</td>
 * </tr>
 * </table>
 * <p>
 * AGAL limits: 200 opcodes per program.
 * </p>
 * 
 * <p>
 * Draw call limits: 32,768 drawTriangles() calls for each present() call.
 * </p>
 * 
 * <p>
 * 350 MB is the absolute limit for textures, including the texture memory
 * required for mipmaps. However, many devices do not support peer much texture
 * memory. For maximum compatibility, limit texture memory use to 128 MB, or
 * less.
 * </p>
 * 
 * You cannot create Context3D objects with the Context3D constructor. It is
 * constructed and available as a property of a Stage3D instance. The Context3D
 * class can be used on desktop platforms only, both when running in FlashDetect
 * Player and in AIR.
 * 
 * 
 */
public class Context3D extends EventDispatcher {

    protected Context3D() {

    }

    Context3D(JavaScriptObject obj) {
        jsObj = obj;
    }

    /**
     * the type of graphics library driver used by peer rendering context.
     * 
     * @return
     */
    public native String getDriverInfo()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.getdriverInfo();
    }-*/;

    /**
     * Specifies whether errors encountered by the renderer are reported to the
     * application.
     * 
     * @return
     */
    public native boolean enableErrorChecking()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.enableErrorChecking;
    }-*/;

    public native void setEnableEroorChecking(boolean value)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.enableEroorChecking = value;
    }-*/;

    /**
     * Clears the color, depth, and stencil buffers associated with peer
     * Context3D object and fills them with the specified values.
     */
    public native void clear()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.clear();
    }-*/;

    /**
     * Clears the color, depth, and stencil buffers associated with peer
     * Context3D object and fills them with the specified values.
     * 
     * @param red
     */
    public native void clear(double red)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.clear(red);
    }-*/;

    /**
     * Clears the color, depth, and stencil buffers associated with peer
     * Context3D object and fills them with the specified values.
     * 
     * @param red
     * @param green
     */
    public native void clear(double red, double green)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.clear(red, green);
    }-*/;

    /**
     * Clears the color, depth, and stencil buffers associated with peer
     * Context3D object and fills them with the specified values.
     * 
     * @param red
     * @param green
     * @param blue
     */
    public native void clear(double red, double green, double blue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.clear(red, green, blue);
    }-*/;

    /**
     * Clears the color, depth, and stencil buffers associated with peer
     * Context3D object and fills them with the specified values.
     * 
     * @param red
     * @param green
     * @param blue
     * @param alpha
     */
    public native void clear(double red, double green, double blue, double alpha)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.clear(red, green, blue, alpha);
    }-*/;

    /**
     * Clears the color, depth, and stencil buffers associated with peer
     * Context3D object and fills them with the specified values.
     * 
     * @param red
     * @param green
     * @param blue
     * @param alpha
     * @param depth
     */
    public native void clear(double red, double green, double blue, double alpha, double depth)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.clear(red, green, blue, alpha, depth);
    }-*/;

    /**
     * Clears the color, depth, and stencil buffers associated with peer
     * Context3D object and fills them with the specified values.
     * 
     * @param red
     * @param green
     * @param blue
     * @param alpha
     * @param depth
     * @param stencil
     */
    public native void clear(double red, double green, double blue, double alpha, double depth, double stencil)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.clear(red, green, blue, alpha, depth, stencil);
    }-*/;

    /**
     * Clears the color, depth, and stencil buffers associated with peer
     * Context3D object and fills them with the specified values.
     * 
     * @param red
     * @param green
     * @param blue
     * @param alpha
     * @param depth
     * @param stencil
     * @param mask
     */
    public native void clear(double red, double green, double blue, double alpha, double depth, double stencil,
                    double mask)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.clear(red, green, blue, alpha, depth, stencil, mask);
    }-*/;

    public native void configureBackBuffer(int width, int height, int antiAlias)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.configureBackBuffer(width, height, antiAlias);
    }-*/;

    public native void configureBackBuffer(int width, int height, int antiAlias, boolean enableDepthAndStencil)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.configureBackBuffer(width, height, antiAlias,
				enableDepthAndStencil);
    }-*/;

    public native CubeTexture createCubeTexture(int size, String format, boolean optimizeForRenderToTexture)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.createCubeTexture(size, format,
				optimizeForRenderToTexture);
		return @com.ait.toolkit.flash.core.client.display3D.textures.CubeTexture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native IndexBuffer3D createIndexBuffer(int numIndices)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.createIndexBuffer(numIndices);
		return @com.ait.toolkit.flash.core.client.display3D.IndexBuffer3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native Program3D createProgram()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.createProgram();
		return @com.ait.toolkit.flash.core.client.display3D.Program3D::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native Texture createTexture(int width, int height, String format, boolean optimizeForRenderToTexture)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		var obj = peer.createTexture(width, height, format,
				optimizeForRenderToTexture);
		return @com.ait.toolkit.flash.core.client.display3D.textures.Texture::new(Lcom/google/gwt/core/client/JavaScriptObject;)(obj);
    }-*/;

    public native VertexBuffer3D createVertexBuffer(int numVertices, int data32PerVertex)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		return peer.createVertexBuffer(numVertices, data32PerVertex);
    }-*/;

    public native void dispose()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.dispose();
    }-*/;

    public native void drawToBitmapData(BitmapData destination)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.drawToBitmapData(destination.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void drawTriangles(IndexBuffer3D indexBuffer)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.drawTriangles(indexBuffer.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void drawTriangles(IndexBuffer3D indexBuffer, int firstIndex)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.drawTriangles(
						indexBuffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						firstIndex);
    }-*/;

    public native void drawTriangles(IndexBuffer3D indexBuffer, int firstIndex, int numTriangles)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.drawTriangles(
						indexBuffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						firstIndex, numTriangles);
    }-*/;

    public native void present()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.present();
    }-*/;

    public native void setBlendFactors(String sourceFactor, String destinationFactor)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setBlendFactors(sourceFactor, destinationFactor);
    }-*/;

    public native void setColorMask(boolean red, boolean green, boolean blue, boolean alpha)/*-{
		peer.setColorMask(red, green, blue, alpha);
    }-*/;

    public native void setCulling(String triangleFaceCull)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setCulling(triangleFaceCull);
    }-*/;

    public native void setDepthTest(boolean depthMask, String passCompareMode)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setDepthTest(depthMask, passCompareMode);
    }-*/;

    public native void setProgram(Program3D program)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setProgram(program.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void setProgramConstantsFromMatrix(String ProgramType, int firstRegister, Matrix3D matrix)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setProgramConstantsFromMatrix(
						ProgramType,
						firstRegister,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void setProgramConstantsFromMatrix(String ProgramType, int firstRegister, Matrix3D matrix,
                    boolean transposedMatrix)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setProgramConstantsFromMatrix(
						ProgramType,
						firstRegister,
						matrix.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						transposedMatrix);
    }-*/;

    public native void setProgramConstantsFromVector(String ProgramType, int firstRegister, NumberVector data)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setProgramConstantsFromVector(
						ProgramType,
						firstRegister,
						data.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void setProgramConstantsFromVector(String ProgramType, int firstRegister, NumberVector data,
                    int numRegisters)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setProgramConstantsFromVector(
						ProgramType,
						firstRegister,
						data.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						numRegisters);
    }-*/;

    public native void setRenderToBackBuffer()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.renderToBackBuffer();
    }-*/;

    public native void setRenderToTextute(TextureBase texture)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.renderToTextute(texture.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void setRenderToTextute(TextureBase texture, boolean enableDepthAndStencil)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setRenderToTextute(
						texture.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						enableDepthAndStencil);
    }-*/;

    public native void setRenderToTextute(TextureBase texture, boolean enableDepthAndStencil, int antiAlias)/*-{
		peer.setRenderToTextute(texture, enableDepthAndStencil, antiAlias);
    }-*/;

    public native void setRenderToTextute(TextureBase texture, boolean enableDepthAndStencil, int antiAlias,
                    int surfaceSelector)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setRenderToTextute(
						texture.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						enableDepthAndStencil, antiAlias, surfaceSelector);
    }-*/;

    public native void setScissorRectangle(Rectangle rectangle)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setScissorRectangle(rectangle.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void setStencilReferenceValue(int referenceValue)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setStencilReferenceValue(referenceValue);
    }-*/;

    public native void setStencilReferenceValue(int referenceValue, int readMask)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setStencilReferenceValue(referenceValue, readMask);
    }-*/;

    public native void setStencilReferenceValue(int referenceValue, int readMask, int writeMask)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.setStencilReferenceValue(referenceValue, readMask, writeMask);
    }-*/;

    public native void setTextureAt(int sampler, TextureBase texture)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setTextureAt(
						sampler,
						texture.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void setVertexBufferAt(int index, VertexBuffer3D buffer)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setVertexBufferAt(
						index,
						buffer.@com.ait.toolkit.core.client.JsObject::getJsObj()());
    }-*/;

    public native void setVertexBufferAt(int index, VertexBuffer3D buffer, int bufferOffset)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setVertexBufferAt(
						index,
						buffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						bufferOffset);
    }-*/;

    public native void setVertexBufferAt(int index, VertexBuffer3D buffer, int bufferOffset, String format)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setVertexBufferAt(
						index,
						buffer.@com.ait.toolkit.core.client.JsObject::getJsObj()(),
						bufferOffset, format);
    }-*/;

}
