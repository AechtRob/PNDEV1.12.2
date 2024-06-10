package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelAphnelepis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer aphnelepis;
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer analFinR;
    private final AdvancedModelRenderer analFinL;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer tail3;
    private final AdvancedModelRenderer pectoralR;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer pectoralL;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r13;

    public ModelAphnelepis() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.aphnelepis = new AdvancedModelRenderer(this);
        this.aphnelepis.setRotationPoint(0.5F, 24.0F, -5.0F);


        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.aphnelepis.addChild(main);
        this.main.cubeList.add(new ModelBox(main, 0, 0, -2.5F, -8.0F, -1.0F, 4, 6, 9, 0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 3, -0.5F, -2.0F, 0.0F, 0, 2, 4, 0.01F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 0, -0.5F, -11.0F, -1.0F, 0, 3, 4, 0.01F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(-0.5F, -9.4983F, 3.2619F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3229F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 0, -2.0F, -0.0026F, -4.9902F, 4, 2, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-0.5F, -8.0F, 8.0F);
        this.main.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.3054F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 22, -2.0F, 0.0F, -5.0F, 4, 2, 5, -0.01F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(-0.5F, -6.375F, -1.1193F);
        this.main.addChild(tail);
        this.tail.cubeList.add(new ModelBox(tail, 28, 14, -1.5F, -0.625F, -2.8807F, 3, 4, 4, 0.01F, false));
        this.tail.cubeList.add(new ModelBox(tail, 14, 9, 0.0F, -7.625F, -5.8807F, 0, 7, 6, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 4.375F, 0.1193F);
        this.tail.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.3491F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 30, 22, -1.5F, -1.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.625F, 0.1193F);
        this.tail.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 30, 0, -1.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, false));

        this.analFinR = new AdvancedModelRenderer(this);
        this.analFinR.setRotationPoint(1.5F, 3.375F, -0.3807F);
        this.tail.addChild(analFinR);
        this.setRotateAngle(analFinR, 0.0F, 0.0F, -0.7854F);
        this.analFinR.cubeList.add(new ModelBox(analFinR, 24, 24, 0.0F, 0.0F, -4.5F, 0, 3, 5, 0.0F, false));

        this.analFinL = new AdvancedModelRenderer(this);
        this.analFinL.setRotationPoint(-1.5F, 3.375F, -0.3807F);
        this.tail.addChild(analFinL);
        this.setRotateAngle(analFinL, 0.0F, 0.0F, 0.7854F);
        this.analFinL.cubeList.add(new ModelBox(analFinL, 24, 24, 0.0F, 0.0F, -4.5F, 0, 3, 5, 0.0F, true));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, 1.625F, -2.8807F);
        this.tail.addChild(tail2);
        this.tail2.cubeList.add(new ModelBox(tail2, 16, 29, -1.0F, -1.5F, -4.0F, 2, 3, 4, 0.0F, false));

        this.tail3 = new AdvancedModelRenderer(this);
        this.tail3.setRotationPoint(0.0F, -0.25F, -3.5F);
        this.tail2.addChild(tail3);
        this.tail3.cubeList.add(new ModelBox(tail3, 0, 8, 0.0F, -3.5F, -6.5F, 0, 7, 7, 0.0F, false));

        this.pectoralR = new AdvancedModelRenderer(this);
        this.pectoralR.setRotationPoint(1.5F, -2.5F, 7.75F);
        this.main.addChild(pectoralR);
        this.setRotateAngle(pectoralR, 0.0F, 0.0F, -0.6981F);


        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pectoralR.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.3491F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 20, 0.0F, -1.0F, -2.0F, 0, 5, 2, 0.0F, false));

        this.pectoralL = new AdvancedModelRenderer(this);
        this.pectoralL.setRotationPoint(-2.5F, -2.5F, 7.75F);
        this.main.addChild(pectoralL);
        this.setRotateAngle(pectoralL, 0.0F, 0.0F, 0.6981F);


        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.pectoralL.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3491F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 20, 0.0F, -1.0F, -2.0F, 0, 5, 2, 0.0F, true));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.aphnelepis.addChild(head);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-2.1F, -5.0F, 11.4F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 4, 0, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, true));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 4, 0, 2.7F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(-0.5F, -5.4248F, 13.1314F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 28, 32, -2.0F, -0.0078F, -1.9945F, 4, 2, 2, -0.01F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-0.5F, -2.0F, 8.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.3491F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 18, 22, -2.0F, -3.0F, 0.0F, 4, 3, 4, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(-0.5F, -6.965F, 11.8708F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.8727F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 34, 26, -2.0F, 0.0021F, -0.0068F, 4, 2, 2, 0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(-2.1F, -5.0329F, 11.3461F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, -0.45F, -1.0F, -1.0F, 1, 2, 2, 0.0F, true));
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 0, 2.65F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(-0.5F, -8.0F, 8.0F);
        this.head.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 26, 7, -2.0F, 0.0F, 0.0F, 4, 3, 4, 0.02F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(-0.5F, -2.5666F, 8.128F);
        this.head.addChild(jaw);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.0666F, 2.372F);
        this.jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 29, -1.5F, -0.8F, -2.35F, 3, 1, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.aphnelepis.render(f5);
    }
    public void renderStaticWall(float f) {
        this.aphnelepis.rotateAngleY = (float) Math.toRadians(270);
        this.aphnelepis.offsetX = -0.03F;
        this.aphnelepis.offsetY = -0.18F;
        this.aphnelepis.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(cube_r1, 0.3229F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, -0.3054F, 0.0F, 0.0F);
        this.setRotateAngle(tail, 0.0F, -0.3927F, 0.0F);
        this.setRotateAngle(cube_r3, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r4, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(analFinR, 0.0F, 0.0F, -0.7854F);
        this.setRotateAngle(analFinL, 0.0F, 0.0F, 0.7854F);
        this.setRotateAngle(pectoralR, 0.0F, 0.0F, -0.6981F);
        this.setRotateAngle(cube_r5, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(pectoralL, 0.0F, 0.0F, 0.6981F);
        this.setRotateAngle(cube_r6, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r7, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, 0.0873F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, 0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r10, -0.8727F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r11, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.setRotateAngle(jaw, -0.3491F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r13, 0.0873F, 0.0F, 0.0F);
        this.aphnelepis.rotateAngleY = (float) Math.toRadians(90);
        this.aphnelepis.offsetY = -0.34F;
        this.aphnelepis.offsetX = -0.04F;
        this.aphnelepis.offsetZ = 0.045F;
        this.aphnelepis.render(0.01F);
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
        this.aphnelepis.offsetY = 0F;
        this.aphnelepis.rotateAngleY = (float)Math.toRadians(180);
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2, this.tail3};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            this.swing(aphnelepis, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(pectoralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(pectoralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(analFinL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(analFinL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.walk(analFinR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(analFinR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            if (!e.isInWater()) {
                this.aphnelepis.rotateAngleZ = (float) Math.toRadians(90);
                this.aphnelepis.offsetY = -0.1F;
                this.bob(aphnelepis, -speed, 5F, false, f2, 1);
            }
        }
    }
}
