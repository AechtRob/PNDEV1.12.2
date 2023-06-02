package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.EntityPrehistoricFloraElasmodectes;
import net.lepidodendron.entity.EntityPrehistoricFloraTitanichthys;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelElasmodectes extends AdvancedModelBase {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer frontleftfin;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer frontrightfin;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cheek;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cheek2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer spikedorsal;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer backleftfin;
    private final AdvancedModelRenderer backrightfin;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer tail4;
    private final AdvancedModelRenderer tail5;
    private final AdvancedModelRenderer tail6;

    public ModelElasmodectes() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -7.0F, -2.0F, 6, 7, 4, 0.0F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 11, -2.5F, -6.5F, 2.0F, 5, 6, 4, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -7.0F, 2.0F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1178F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 7, -2.5F, 0.025F, 0.0F, 5, 1, 4, 0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -0.5F, 4.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0916F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 14, 17, -2.5F, -0.8F, -2.05F, 5, 1, 4, 0.01F, false));

        this.frontleftfin = new AdvancedModelRenderer(this);
        this.frontleftfin.setRotationPoint(2.425F, -0.65F, 1.55F);
        this.main.addChild(frontleftfin);
        this.setRotateAngle(frontleftfin, 0.0503F, 0.5214F, 0.5806F);


        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.3338F, -2.5786F, 2.2518F);
        this.frontleftfin.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.1309F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 7, 0.0F, -2.225F, -2.5F, 0, 5, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.3338F, -1.0786F, 1.2518F);
        this.frontleftfin.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1309F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 7, 38, -0.5F, -0.9F, -1.5F, 1, 2, 3, 0.0F, false));

        this.frontrightfin = new AdvancedModelRenderer(this);
        this.frontrightfin.setRotationPoint(-2.425F, -0.65F, 1.55F);
        this.main.addChild(frontrightfin);
        this.setRotateAngle(frontrightfin, 0.0503F, -0.5214F, -0.5806F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.3338F, -2.5786F, 2.2518F);
        this.frontrightfin.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1309F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 18, 7, 0.0F, -2.225F, -2.5F, 0, 5, 5, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.3338F, -1.0786F, 1.2518F);
        this.frontrightfin.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.1309F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 7, 38, -0.5F, -0.9F, -1.5F, 1, 2, 3, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 28, 12, -1.5F, -4.5F, -6.0F, 3, 2, 4, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 32, 0, -1.0F, -3.55F, -7.95F, 2, 1, 2, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -5.484F, -4.5971F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3796F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 36, -1.0F, -0.1894F, -4.1928F, 2, 1, 3, -0.001F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 18, 36, -1.0F, 0.4856F, -4.1928F, 2, 1, 3, -0.01F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 9, -1.5F, -0.2394F, -1.9928F, 3, 2, 2, 0.001F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.5F, -3.5F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.2182F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 34, 33, -1.5F, -1.875F, -1.225F, 3, 3, 3, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -0.6678F, -4.9375F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.5541F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 0, -1.0F, -1.9986F, -3.5767F, 2, 2, 2, -0.02F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 40, 0.5F, -1.9986F, -2.0017F, 1, 2, 2, -0.01F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 42, 22, -0.5F, -1.2236F, -2.0017F, 1, 1, 2, 0.0F, false));
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 42, -1.5F, -1.9986F, -2.0017F, 1, 2, 2, -0.01F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -7.0F, -2.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.4407F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 16, 22, -1.5F, 0.0F, -4.0F, 3, 3, 4, -0.01F, false));

        this.cheek = new AdvancedModelRenderer(this);
        this.cheek.setRotationPoint(2.825F, -3.375F, -2.0F);
        this.head.addChild(cheek);
        this.setRotateAngle(cheek, 0.0F, 0.3316F, 0.0F);
        this.cheek.cubeList.add(new ModelBox(cheek, 0, 28, -2.0F, -1.875F, -4.0F, 2, 4, 4, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-0.5F, -2.375F, -0.75F);
        this.cheek.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0044F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 42, 14, -0.725F, -0.375F, -1.1F, 1, 1, 2, 0.0F, false));

        this.cheek2 = new AdvancedModelRenderer(this);
        this.cheek2.setRotationPoint(-2.825F, -3.375F, -2.0F);
        this.head.addChild(cheek2);
        this.setRotateAngle(cheek2, 0.0F, -0.3316F, 0.0F);
        this.cheek2.cubeList.add(new ModelBox(cheek2, 26, 25, 0.0F, -1.875F, -4.0F, 2, 4, 4, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, -2.375F, -0.75F);
        this.cheek2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0044F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 38, 13, -0.275F, -0.375F, -1.1F, 1, 1, 2, 0.0F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.6678F, -4.9375F);
        this.head.addChild(jaw);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.5541F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 20, 42, -0.5F, -0.9986F, -2.0017F, 1, 1, 2, 0.0F, false));

        this.spikedorsal = new AdvancedModelRenderer(this);
        this.spikedorsal.setRotationPoint(0.5F, -7.2F, 1.2F);
        this.main.addChild(spikedorsal);
        this.setRotateAngle(spikedorsal, -0.8029F, 0.0F, 0.0F);
        this.spikedorsal.cubeList.add(new ModelBox(spikedorsal, 27, 39, -1.0F, -6.3046F, -0.401F, 1, 7, 1, 0.0F, false));
        this.spikedorsal.cubeList.add(new ModelBox(spikedorsal, 42, 0, -1.0F, -1.5546F, 0.599F, 1, 2, 2, 0.0F, false));
        this.spikedorsal.cubeList.add(new ModelBox(spikedorsal, 8, 25, -0.5F, -5.5546F, 0.599F, 0, 4, 3, 0.0F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, -3.5256F, 6.0136F);
        this.main.addChild(tail);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -1.4744F, 4.9864F);
        this.tail.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2225F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 36, 36, 0.0F, -2.325F, -3.9F, 0, 2, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 3.0256F, -0.0136F);
        this.tail.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1745F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 20, 0, -2.0F, -3.0F, 0.0F, 4, 3, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -2.9744F, -0.0136F);
        this.tail.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 21, -2.0F, 0.025F, -0.025F, 4, 3, 4, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.1902F, 3.4361F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 32, 3, -1.5F, -0.7842F, -0.4498F, 3, 2, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -1.2842F, 1.5502F);
        this.tail2.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.2225F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 30, 6, 0.0F, -2.325F, -0.9F, 0, 2, 3, 0.0F, false));
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 12, 29, -1.5F, -0.475F, -1.9F, 3, 2, 4, -0.01F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 1.7158F, 1.5502F);
        this.tail2.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.336F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 28, 18, -1.5F, -1.65F, -1.625F, 3, 2, 4, -0.001F, false));

        this.backleftfin = new AdvancedModelRenderer(this);
        this.backleftfin.setRotationPoint(1.525F, 0.9908F, 0.5752F);
        this.tail2.addChild(backleftfin);
        this.setRotateAngle(backleftfin, -1.0405F, 0.6711F, -0.8147F);
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 42, 4, -1.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));
        this.backleftfin.cubeList.add(new ModelBox(backleftfin, 12, 18, -0.25F, -1.5F, 0.5F, 0, 3, 4, 0.0F, false));

        this.backrightfin = new AdvancedModelRenderer(this);
        this.backrightfin.setRotationPoint(-1.525F, 0.9908F, 0.5752F);
        this.tail2.addChild(backrightfin);
        this.setRotateAngle(backrightfin, -1.0405F, -0.6711F, 0.8147F);
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 42, 4, 0.0F, -0.5F, 0.0F, 1, 1, 2, 0.0F, true));
        this.backrightfin.cubeList.add(new ModelBox(backrightfin, 12, 18, 0.25F, -1.5F, 0.5F, 0, 3, 4, 0.0F, true));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, 0.1142F, 3.5303F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 38, 29, -1.0F, -0.3984F, 0.0199F, 2, 1, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, -0.8984F, 1.5199F);
        this.tail3.addChild(cube_r19);
        this.setRotateAngle(cube_r19, -0.1309F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 34, 24, -1.0F, -0.275F, -2.4F, 2, 1, 4, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 0.6016F, 1.5199F);
        this.tail3.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.096F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 38, 18, -1.0F, -0.575F, -1.45F, 2, 1, 3, -0.001F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -1.3984F, -1.9801F);
        this.tail3.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2225F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 0, 37, 0.0F, -2.325F, 2.1F, 0, 2, 3, 0.0F, false));

        this.tail4 = new AdvancedModelRenderer(this);
        this.tail4.setRotationPoint(0.0F, -0.0234F, 3.0199F);
        this.tail3.addChild(tail4);
        this.tail4.cubeList.add(new ModelBox(tail4, 39, 39, -0.5F, -0.375F, 0.0F, 1, 1, 3, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 2, 0, 0.0F, -0.875F, 0.0F, 0, 2, 1, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 10, 0.0F, -2.375F, 2.0F, 0, 4, 1, 0.0F, false));
        this.tail4.cubeList.add(new ModelBox(tail4, 0, 0, 0.0F, -1.375F, 1.0F, 0, 3, 1, 0.0F, false));

        this.tail5 = new AdvancedModelRenderer(this);
        this.tail5.setRotationPoint(0.0F, -0.125F, 3.0F);
        this.tail4.addChild(tail5);
        this.tail5.cubeList.add(new ModelBox(tail5, 31, 39, -0.5F, -0.25F, 0.0F, 1, 1, 3, 0.0F, false));
        this.tail5.cubeList.add(new ModelBox(tail5, 12, 32, 0.0F, -3.25F, 0.0F, 0, 6, 3, 0.0F, false));

        this.tail6 = new AdvancedModelRenderer(this);
        this.tail6.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.tail5.addChild(tail6);
        this.tail6.cubeList.add(new ModelBox(tail6, 42, 25, -0.5F, -0.25F, 0.0F, 1, 1, 2, 0.0F, false));
        this.tail6.cubeList.add(new ModelBox(tail6, 26, 29, 0.0F, -3.25F, 0.0F, 0, 6, 4, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.offsetY = -0.25F;
        this.main.offsetX = -0.06F;
        this.main.offsetZ = -0.45F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(tail, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(tail2, 0.0F, 0.06F, 0.0F);
        this.setRotateAngle(tail3, 0.0F, 0.07F, 0.0F);
        this.setRotateAngle(tail4, 0.0F, -0.08F, 0.0F);
        this.setRotateAngle(tail5, 0.0F, -0.09F, 0.0F);
        this.setRotateAngle(tail6, 0.0F, -0.1F, 0.0F);
        this.main.offsetY = -0.0F;
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.head.offsetY = 1.45F;

        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3, this.tail4, this.tail5, this.tail6};
        ((EntityPrehistoricFloraElasmodectes)e).tailBuffer.applyChainSwingBuffer(fishTail);
        float speed = 0.3F;
        if (f3>0) { // if not in water
            speed = 0.15F;
        } else {
            speed=0.1F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {



            //this.walk(backleftfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);

                this.swing(frontleftfin, (float)(speed), (float)Math.toRadians(40.3015), false, -3, 0.6F, f2, 1);
                this.swing(frontrightfin, (float)(speed), (float)Math.toRadians(40.3015), false, -6, -0.6F, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.25F, -3, f2, 1);
                this.swing(backleftfin, (speed), 0.2F, true, 0, 0, f2, 1);
                this.swing(backrightfin, (speed), 0.2F, true, 0, 0, f2, 1);


           // this.walk(backrightfin, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);



            if (!e.isInWater()) {
                this.main.offsetY = 0.15F;
                //this.bob(main, speed*2F, 5F, false, f2, 1);
            }
        }
    }
}
