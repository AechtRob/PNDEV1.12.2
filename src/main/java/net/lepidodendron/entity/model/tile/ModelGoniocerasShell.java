package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelRenderer;

public class ModelGoniocerasShell extends AdvancedModelBase {
    public AdvancedModelRenderer shellbase;
    public AdvancedModelRenderer shell1;
    public AdvancedModelRenderer shellcover1;
    public AdvancedModelRenderer shell2;
    public AdvancedModelRenderer shell3;
    public AdvancedModelRenderer shell4;
    public AdvancedModelRenderer shell5;
    public AdvancedModelRenderer shell6;
    public AdvancedModelRenderer shell7;
    public AdvancedModelRenderer shell8;
    public AdvancedModelRenderer shell9;
    public AdvancedModelRenderer shell10;
    public AdvancedModelRenderer shell11;
    public AdvancedModelRenderer shell12;
    public AdvancedModelRenderer shelltip;
    public AdvancedModelRenderer shellcover2;
    public AdvancedModelRenderer shellcovertop;
    public AdvancedModelRenderer shellcovertop2;

    public ModelGoniocerasShell() {
        this.textureWidth = 256;
        this.textureHeight = 256;
        this.shell9 = new AdvancedModelRenderer(this, 64, 102);
        this.shell9.setRotationPoint(0.0F, 0.2F, 7.8F);
        this.shell9.addBox(-2.0F, -2.0F, 0.0F, 4, 4, 7, 0.0F);
        this.setRotateAngle(shell9, 0.5585053606381855F, 0.0F, 0.0F);
        this.shell12 = new AdvancedModelRenderer(this, 0, 50);
        this.shell12.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.shell12.addBox(-0.5F, -1.5F, 0.0F, 1, 3, 5, 0.0F);
        this.setRotateAngle(shell12, 0.6283185307179586F, 0.0F, 0.0F);
        this.shell10 = new AdvancedModelRenderer(this, 68, 0);
        this.shell10.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.shell10.addBox(-1.5F, -1.5F, 0.0F, 3, 3, 5, 0.0F);
        this.setRotateAngle(shell10, 0.6283185307179586F, 0.0F, 0.0F);
        this.shell1 = new AdvancedModelRenderer(this, 0, 0);
        this.shell1.setRotationPoint(0.0F, 1.1F, -2.6F);
        this.shell1.addBox(-6.0F, -6.0F, 0.0F, 12, 12, 15, 0.0F);
        this.setRotateAngle(shell1, 0.45378560551852565F, 0.0F, 0.0F);
        this.shell5 = new AdvancedModelRenderer(this, 68, 49);
        this.shell5.setRotationPoint(0.0F, 0.8F, 7.9F);
        this.shell5.addBox(-4.0F, -4.0F, 0.0F, 8, 8, 12, 0.0F);
        this.setRotateAngle(shell5, 0.4886921905584123F, 0.0F, 0.0F);
        this.shellcovertop2 = new AdvancedModelRenderer(this, 68, 46);
        this.shellcovertop2.setRotationPoint(0.0F, 0.0F, -2.0F);
        this.shellcovertop2.addBox(-3.5F, -1.0F, 0.0F, 7, 1, 2, 0.0F);
        this.shell11 = new AdvancedModelRenderer(this, 0, 0);
        this.shell11.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.shell11.addBox(-1.0F, -1.5F, 0.0F, 2, 3, 5, 0.0F);
        this.setRotateAngle(shell11, 0.5585053606381855F, 0.0F, 0.0F);
        this.shellcover1 = new AdvancedModelRenderer(this, 31, 61);
        this.shellcover1.setRotationPoint(0.0F, 3.9F, -17.0F);
        this.shellcover1.addBox(-6.0F, 0.0F, -1.0F, 12, 2, 13, 0.0F);
        this.setRotateAngle(shellcover1, 0.9909979492823804F, 0.0F, 0.0F);
        this.shelltip = new AdvancedModelRenderer(this, 50, 66);
        this.shelltip.setRotationPoint(0.0F, -1.5F, 1.2F);
        this.shelltip.addBox(0.0F, -5.0F, 0.0F, 0, 10, 10, 0.0F);
        this.setRotateAngle(shelltip, 0.9316567547145731F, 0.0F, 0.0F);
        this.shell4 = new AdvancedModelRenderer(this, 71, 69);
        this.shell4.setRotationPoint(0.0F, 0.9F, 11.0F);
        this.shell4.addBox(-4.5F, -4.5F, 0.0F, 9, 9, 10, 0.0F);
        this.setRotateAngle(shell4, 0.4886921905584123F, 0.0F, 0.0F);
        this.shell6 = new AdvancedModelRenderer(this, 0, 72);
        this.shell6.setRotationPoint(0.0F, 0.7F, 10.2F);
        this.shell6.addBox(-3.5F, -3.5F, 0.0F, 7, 7, 11, 0.0F);
        this.setRotateAngle(shell6, 0.5235987755982988F, 0.0F, 0.0F);
        this.shell8 = new AdvancedModelRenderer(this, 53, 88);
        this.shell8.setRotationPoint(0.0F, 0.6F, 8.3F);
        this.shell8.addBox(-2.5F, -2.5F, 0.0F, 5, 5, 9, 0.0F);
        this.setRotateAngle(shell8, 0.6632251157578453F, 0.0F, 0.0F);
        this.shell3 = new AdvancedModelRenderer(this, 41, 14);
        this.shell3.setRotationPoint(-1.0F, 0.1F, 9.0F);
        this.shell3.addBox(-5.0F, -5.0F, 0.0F, 10, 10, 13, 0.0F);
        this.setRotateAngle(shell3, 0.6108652381980153F, 0.0F, 0.0F);
        this.shellcover2 = new AdvancedModelRenderer(this, 74, 18);
        this.shellcover2.setRotationPoint(0.0F, 0.8F, -2.8F);
        this.shellcover2.addBox(-5.0F, 0.0F, 0.0F, 10, 1, 2, 0.0F);
        this.setRotateAngle(shellcover2, 0.41887902047863906F, 0.0F, 0.0F);
        this.shellcovertop = new AdvancedModelRenderer(this, 39, 0);
        this.shellcovertop.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.shellcovertop.addBox(-4.5F, -1.0F, 0.0F, 9, 1, 11, 0.0F);
        this.shellbase = new AdvancedModelRenderer(this, 106, 85);
        this.shellbase.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shellbase.addBox(-6.5F, -6.4F, -10.0F, 13, 13, 10, 0.0F);
        this.shell2 = new AdvancedModelRenderer(this, 34, 38);
        this.shell2.setRotationPoint(1.0F, 1.9F, 12.1F);
        this.shell2.addBox(-6.5F, -6.5F, 0.0F, 11, 11, 12, 0.0F);
        this.setRotateAngle(shell2, 0.4886921905584123F, 0.0F, 0.0F);
        this.shell7 = new AdvancedModelRenderer(this, 74, 2);
        this.shell7.setRotationPoint(0.0F, 0.7F, 9.2F);
        this.shell7.addBox(-3.0F, -3.0F, 0.0F, 6, 6, 10, 0.0F);
        this.setRotateAngle(shell7, 0.5235987755982988F, 0.0F, 0.0F);
        this.shell8.addChild(this.shell9);
        this.shell11.addChild(this.shell12);
        this.shell9.addChild(this.shell10);
        this.shellbase.addChild(this.shell1);
        this.shell4.addChild(this.shell5);
        this.shellcovertop.addChild(this.shellcovertop2);
        this.shell10.addChild(this.shell11);
        this.shellbase.addChild(this.shellcover1);
        this.shell12.addChild(this.shelltip);
        this.shell3.addChild(this.shell4);
        this.shell5.addChild(this.shell6);
        this.shell7.addChild(this.shell8);
        this.shell2.addChild(this.shell3);
        this.shellcover1.addChild(this.shellcover2);
        this.shellcover1.addChild(this.shellcovertop);
        this.shell1.addChild(this.shell2);
        this.shell6.addChild(this.shell7);

        //2

        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.shellbase.offsetY = -1.5F;
        this.shellbase.render(0.1f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
