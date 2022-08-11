package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelEndocerasShell extends AdvancedModelBase {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer shellbase;
    private final AdvancedModelRenderer shellbasebottom;
    private final AdvancedModelRenderer shellbasetop;
    private final AdvancedModelRenderer shell1;
    private final AdvancedModelRenderer shell2;
    private final AdvancedModelRenderer shell3;
    private final AdvancedModelRenderer shell4;
    private final AdvancedModelRenderer shell5;
    private final AdvancedModelRenderer shell6;
    private final AdvancedModelRenderer shell7;
    private final AdvancedModelRenderer shell8;
    private final AdvancedModelRenderer shell9;
    private final AdvancedModelRenderer shell10;
    private final AdvancedModelRenderer shell11;
    private final AdvancedModelRenderer shelltip;
    private final AdvancedModelRenderer shell10top;
    private final AdvancedModelRenderer shell10bottom;
    private final AdvancedModelRenderer shell9top;
    private final AdvancedModelRenderer shell9bottom;
    private final AdvancedModelRenderer shell8top;
    private final AdvancedModelRenderer shell8bottom;
    private final AdvancedModelRenderer shell7top;
    private final AdvancedModelRenderer shell7bottom;
    private final AdvancedModelRenderer shell6top;
    private final AdvancedModelRenderer shell6bottom;
    private final AdvancedModelRenderer shell5top;
    private final AdvancedModelRenderer shell5bottom;
    private final AdvancedModelRenderer shell4top;
    private final AdvancedModelRenderer shell4bottom;
    private final AdvancedModelRenderer shell3top;
    private final AdvancedModelRenderer shell3bottom;
    private final AdvancedModelRenderer shell2top;
    private final AdvancedModelRenderer shell2bottom;
    private final AdvancedModelRenderer shell1top;
    private final AdvancedModelRenderer shell1bottom;

    public ModelEndocerasShell() {
        this.textureWidth = 256;
        this.textureHeight = 256;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 0.0F, 31.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 18.5F, 12.0F);
        this.root.addChild(head);
        this.setRotateAngle(head, 0.0F, -3.1416F, 0.0F);


        this.shellbase = new AdvancedModelRenderer(this);
        this.shellbase.setRotationPoint(0.0F, -1.5F, 17.0F);
        this.head.addChild(shellbase);
        this.shellbase.cubeList.add(new ModelBox(shellbase, 0, 0, -6.5F, -5.5F, -10.0F, 13, 11, 20, 0.0F, false));

        this.shellbasebottom = new AdvancedModelRenderer(this);
        this.shellbasebottom.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.shellbase.addChild(shellbasebottom);
        this.shellbasebottom.cubeList.add(new ModelBox(shellbasebottom, 0, 60, -5.5F, 0.0F, -10.0F, 11, 1, 20, 0.0F, false));

        this.shellbasetop = new AdvancedModelRenderer(this);
        this.shellbasetop.setRotationPoint(0.0F, -6.5F, 0.0F);
        this.shellbase.addChild(shellbasetop);
        this.shellbasetop.cubeList.add(new ModelBox(shellbasetop, 46, 11, -5.5F, 0.0F, -10.0F, 11, 1, 20, 0.0F, false));

        this.shell1 = new AdvancedModelRenderer(this);
        this.shell1.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.shellbase.addChild(shell1);
        this.shell1.cubeList.add(new ModelBox(shell1, 95, 192, -6.0F, -5.0F, 0.0F, 12, 10, 19, 0.0F, false));

        this.shell2 = new AdvancedModelRenderer(this);
        this.shell2.setRotationPoint(0.0F, 0.0F, 19.0F);
        this.shell1.addChild(shell2);
        this.shell2.cubeList.add(new ModelBox(shell2, 116, 164, -5.5F, -4.5F, 0.0F, 11, 9, 18, 0.0F, false));

        this.shell3 = new AdvancedModelRenderer(this);
        this.shell3.setRotationPoint(0.0F, 0.0F, 18.0F);
        this.shell2.addChild(shell3);
        this.shell3.cubeList.add(new ModelBox(shell3, 144, 144, -5.0F, -4.0F, 0.0F, 10, 8, 11, 0.0F, false));

        this.shell4 = new AdvancedModelRenderer(this);
        this.shell4.setRotationPoint(0.0F, 0.0F, 11.0F);
        this.shell3.addChild(shell4);
        this.shell4.cubeList.add(new ModelBox(shell4, 174, 83, -4.5F, -3.5F, 0.0F, 9, 7, 10, 0.0F, false));

        this.shell5 = new AdvancedModelRenderer(this);
        this.shell5.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.shell4.addChild(shell5);
        this.shell5.cubeList.add(new ModelBox(shell5, 182, 66, -4.0F, -3.0F, 0.0F, 8, 6, 10, 0.0F, false));

        this.shell6 = new AdvancedModelRenderer(this);
        this.shell6.setRotationPoint(0.0F, 0.0F, 10.0F);
        this.shell5.addChild(shell6);
        this.shell6.cubeList.add(new ModelBox(shell6, 194, 52, -3.5F, -2.5F, 0.0F, 7, 5, 8, 0.0F, false));

        this.shell7 = new AdvancedModelRenderer(this);
        this.shell7.setRotationPoint(0.0F, 0.0F, 8.0F);
        this.shell6.addChild(shell7);
        this.shell7.cubeList.add(new ModelBox(shell7, 202, 40, -3.0F, -2.0F, 0.0F, 6, 4, 7, 0.0F, false));

        this.shell8 = new AdvancedModelRenderer(this);
        this.shell8.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.shell7.addChild(shell8);
        this.shell8.cubeList.add(new ModelBox(shell8, 204, 29, -2.5F, -1.5F, 0.0F, 5, 3, 7, 0.0F, false));

        this.shell9 = new AdvancedModelRenderer(this);
        this.shell9.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.shell8.addChild(shell9);
        this.shell9.cubeList.add(new ModelBox(shell9, 205, 19, -2.0F, -1.0F, 0.0F, 4, 2, 7, 0.0F, false));

        this.shell10 = new AdvancedModelRenderer(this);
        this.shell10.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.shell9.addChild(shell10);
        this.shell10.cubeList.add(new ModelBox(shell10, 208, 12, -1.5F, -0.5F, 0.0F, 3, 1, 5, 0.0F, false));

        this.shell11 = new AdvancedModelRenderer(this);
        this.shell11.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.shell10.addChild(shell11);
        this.shell11.cubeList.add(new ModelBox(shell11, 211, 6, -1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F, false));

        this.shelltip = new AdvancedModelRenderer(this);
        this.shelltip.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.shell11.addChild(shelltip);
        this.shelltip.cubeList.add(new ModelBox(shelltip, 212, 1, -0.5F, -0.5F, 0.0F, 1, 1, 3, 0.0F, false));

        this.shell10top = new AdvancedModelRenderer(this);
        this.shell10top.setRotationPoint(0.0F, -1.5F, 10.0F);
        this.shell10.addChild(shell10top);
        this.shell10top.cubeList.add(new ModelBox(shell10top, 193, 12, -1.0F, 0.0F, -10.0F, 2, 1, 5, 0.0F, false));

        this.shell10bottom = new AdvancedModelRenderer(this);
        this.shell10bottom.setRotationPoint(0.0F, 0.5F, 10.0F);
        this.shell10.addChild(shell10bottom);
        this.shell10bottom.cubeList.add(new ModelBox(shell10bottom, 225, 12, -1.0F, 0.0F, -10.0F, 2, 1, 5, 0.0F, false));

        this.shell9top = new AdvancedModelRenderer(this);
        this.shell9top.setRotationPoint(0.0F, -2.0F, 10.0F);
        this.shell9.addChild(shell9top);
        this.shell9top.cubeList.add(new ModelBox(shell9top, 184, 20, -1.5F, 0.0F, -10.0F, 3, 1, 7, 0.0F, false));

        this.shell9bottom = new AdvancedModelRenderer(this);
        this.shell9bottom.setRotationPoint(0.0F, 1.0F, 10.0F);
        this.shell9.addChild(shell9bottom);
        this.shell9bottom.cubeList.add(new ModelBox(shell9bottom, 228, 20, -1.5F, 0.0F, -10.0F, 3, 1, 7, 0.0F, false));

        this.shell8top = new AdvancedModelRenderer(this);
        this.shell8top.setRotationPoint(0.0F, -2.5F, 10.0F);
        this.shell8.addChild(shell8top);
        this.shell8top.cubeList.add(new ModelBox(shell8top, 181, 31, -2.0F, 0.0F, -10.0F, 4, 1, 7, 0.0F, false));

        this.shell8bottom = new AdvancedModelRenderer(this);
        this.shell8bottom.setRotationPoint(0.0F, 1.5F, 10.0F);
        this.shell8.addChild(shell8bottom);
        this.shell8bottom.cubeList.add(new ModelBox(shell8bottom, 229, 31, -2.0F, 0.0F, -10.0F, 4, 1, 7, 0.0F, false));

        this.shell7top = new AdvancedModelRenderer(this);
        this.shell7top.setRotationPoint(0.0F, -3.0F, 10.0F);
        this.shell7.addChild(shell7top);
        this.shell7top.cubeList.add(new ModelBox(shell7top, 177, 43, -2.5F, 0.0F, -10.0F, 5, 1, 7, 0.0F, false));

        this.shell7bottom = new AdvancedModelRenderer(this);
        this.shell7bottom.setRotationPoint(0.0F, 2.0F, 10.0F);
        this.shell7.addChild(shell7bottom);
        this.shell7bottom.cubeList.add(new ModelBox(shell7bottom, 229, 42, -2.5F, 0.0F, -10.0F, 5, 1, 7, 0.0F, false));

        this.shell6top = new AdvancedModelRenderer(this);
        this.shell6top.setRotationPoint(0.0F, -3.5F, 10.0F);
        this.shell6.addChild(shell6top);
        this.shell6top.cubeList.add(new ModelBox(shell6top, 165, 56, -3.0F, 0.0F, -10.0F, 6, 1, 8, 0.0F, false));

        this.shell6bottom = new AdvancedModelRenderer(this);
        this.shell6bottom.setRotationPoint(0.0F, 2.5F, 10.0F);
        this.shell6.addChild(shell6bottom);
        this.shell6bottom.cubeList.add(new ModelBox(shell6bottom, 225, 56, -3.0F, 0.0F, -10.0F, 6, 1, 8, 0.0F, false));

        this.shell5top = new AdvancedModelRenderer(this);
        this.shell5top.setRotationPoint(0.0F, -4.0F, 10.0F);
        this.shell5.addChild(shell5top);
        this.shell5top.cubeList.add(new ModelBox(shell5top, 147, 71, -3.5F, 0.0F, -10.0F, 7, 1, 10, 0.0F, false));

        this.shell5bottom = new AdvancedModelRenderer(this);
        this.shell5bottom.setRotationPoint(0.0F, 3.0F, 10.0F);
        this.shell5.addChild(shell5bottom);
        this.shell5bottom.cubeList.add(new ModelBox(shell5bottom, 219, 71, -3.5F, 0.0F, -10.0F, 7, 1, 10, 0.0F, false));

        this.shell4top = new AdvancedModelRenderer(this);
        this.shell4top.setRotationPoint(0.0F, -4.5F, 10.0F);
        this.shell4.addChild(shell4top);
        this.shell4top.cubeList.add(new ModelBox(shell4top, 137, 89, -4.0F, 0.0F, -10.0F, 8, 1, 10, 0.0F, false));

        this.shell4bottom = new AdvancedModelRenderer(this);
        this.shell4bottom.setRotationPoint(0.0F, 3.5F, 10.0F);
        this.shell4.addChild(shell4bottom);
        this.shell4bottom.cubeList.add(new ModelBox(shell4bottom, 213, 89, -4.0F, 0.0F, -10.0F, 8, 1, 10, 0.0F, false));

        this.shell3top = new AdvancedModelRenderer(this);
        this.shell3top.setRotationPoint(0.0F, -5.0F, 10.0F);
        this.shell3.addChild(shell3top);
        this.shell3top.cubeList.add(new ModelBox(shell3top, 103, 151, -4.5F, 0.0F, -10.0F, 9, 1, 11, 0.0F, false));

        this.shell3bottom = new AdvancedModelRenderer(this);
        this.shell3bottom.setRotationPoint(0.0F, 4.0F, 10.0F);
        this.shell3.addChild(shell3bottom);
        this.shell3bottom.cubeList.add(new ModelBox(shell3bottom, 187, 151, -4.5F, 0.0F, -10.0F, 9, 1, 11, 0.0F, false));

        this.shell2top = new AdvancedModelRenderer(this);
        this.shell2top.setRotationPoint(0.0F, -5.5F, 10.0F);
        this.shell2.addChild(shell2top);
        this.shell2top.cubeList.add(new ModelBox(shell2top, 59, 172, -5.0F, 0.0F, -10.0F, 10, 1, 18, 0.0F, false));

        this.shell2bottom = new AdvancedModelRenderer(this);
        this.shell2bottom.setRotationPoint(0.0F, 4.5F, 10.0F);
        this.shell2.addChild(shell2bottom);
        this.shell2bottom.cubeList.add(new ModelBox(shell2bottom, 175, 172, -5.0F, 0.0F, -10.0F, 10, 1, 18, 0.0F, false));

        this.shell1top = new AdvancedModelRenderer(this);
        this.shell1top.setRotationPoint(0.0F, -6.0F, 10.0F);
        this.shell1.addChild(shell1top);
        this.shell1top.cubeList.add(new ModelBox(shell1top, 36, 201, -5.0F, 0.0F, -10.0F, 10, 1, 19, 0.0F, false));

        this.shell1bottom = new AdvancedModelRenderer(this);
        this.shell1bottom.setRotationPoint(0.0F, 5.0F, 10.0F);
        this.shell1.addChild(shell1bottom);
        this.shell1bottom.cubeList.add(new ModelBox(shell1bottom, 158, 201, -5.0F, 0.0F, -10.0F, 10, 1, 19, 0.0F, false));

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.offsetY = -1.5F;
        this.root.render(0.1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
