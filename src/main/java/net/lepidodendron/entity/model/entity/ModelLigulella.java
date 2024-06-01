package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelLigulella extends AdvancedModelBase {
    private final AdvancedModelRenderer Ligulella;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer PelvicL;
    private final AdvancedModelRenderer PelvicR;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer Body5;

    public ModelLigulella() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Ligulella = new AdvancedModelRenderer(this);
        this.Ligulella.setRotationPoint(0.0F, 21.5F, -2.0F);


        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Ligulella.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 15, 19, -1.5F, -2.0F, -4.0F, 3, 4, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 27, 9, -1.0F, 1.4F, -4.0F, 2, 1, 4, 0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 14, -1.0F, -1.4F, -6.0F, 2, 1, 2, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 31, -1.0F, -2.3034F, -4.0259F, 2, 1, 4, 0.001F, false));
        this.head.cubeList.add(new ModelBox(head, 9, 33, 1.0F, -2.3034F, -4.0259F, 1, 0, 4, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 9, 33, -2.0F, -2.3034F, -4.0259F, 1, 0, 4, 0.0F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 1.0F, -4.0F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5672F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 17, 36, -1.0F, -1.0F, -3.0F, 2, 1, 3, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(-1.4F, -1.4F, -6.4F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.3877F, 0.8169F, 0.2894F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 0, -0.0675F, -0.24F, -0.2862F, 1, 0, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 11, 19, -1.0675F, -0.24F, 0.2138F, 1, 0, 1, 0.0F, true));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 22, 12, -2.0675F, -0.24F, 0.7138F, 1, 0, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, -2.2F, -2.0F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 1.0908F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 9, 25, 0.5F, -0.09F, -0.6259F, 1, 0, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 18, 27, -0.5F, -0.09F, -0.1259F, 1, 0, 1, 0.0F, true));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 30, -1.5F, -0.09F, 0.3741F, 1, 0, 1, 0.0F, true));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.5F, -7.0F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.3054F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 21, -1.0F, -0.0031F, -0.9469F, 1, 0, 1, 0.0F, true));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 28, 21, 0.0F, -0.0031F, -0.9469F, 1, 0, 1, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.1F, -1.4F, -7.4F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.2689F, -0.2274F, -0.0621F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 33, 21, -1.0061F, 0.0038F, -0.0435F, 1, 0, 4, 0.0F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(2.0F, -2.2F, -2.0F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -1.0908F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 9, 25, -1.5F, -0.09F, -0.6259F, 1, 0, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 18, 27, -0.5F, -0.09F, -0.1259F, 1, 0, 1, 0.0F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 27, 30, 0.5F, -0.09F, 0.3741F, 1, 0, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.4F, -1.4F, -6.4F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.3877F, -0.8169F, -0.2894F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 12, 0, -0.9325F, -0.24F, -0.2862F, 1, 0, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 19, 0.0675F, -0.24F, 0.2138F, 1, 0, 1, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 22, 12, 1.0675F, -0.24F, 0.7138F, 1, 0, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.1F, -1.4F, -7.4F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2689F, 0.2274F, 0.0621F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 33, 21, 0.0061F, 0.0038F, -0.0435F, 1, 0, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -2.1F, -4.0F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.2618F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 36, 6, -1.0F, -0.2F, -3.0F, 2, 1, 3, 0.002F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, -9.1F, -8.4F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.3229F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 22, 9, -1.5F, 6.1993F, 6.4185F, 3, 1, 1, 0.04F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.2F, -3.7F);
        this.head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.5672F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 18, 30, -1.0F, -0.0075F, -3.3605F, 2, 1, 4, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 15, 0, -2.0F, -2.0F, -1.0F, 4, 4, 4, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 19, -1.5F, 1.4F, -1.0F, 3, 1, 4, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 9, 27, -1.0F, -2.3F, -1.0F, 2, 1, 4, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(2.0F, 1.8F, 0.0F);
        this.Body1.addChild(PectoralL);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PectoralL.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.5236F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 8, 0, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-2.0F, 1.8F, 0.0F);
        this.Body1.addChild(PectoralR);


        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PectoralR.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.0F, -0.5236F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 8, 0, 0.0F, -1.0F, 0.0F, 0, 2, 3, 0.0F, true));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 10, 9, -1.5F, -2.0F, -1.0F, 3, 4, 5, -0.002F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -2.3F, 0.0F);
        this.Body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0698F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 25, 15, -1.0F, 0.0F, 0.0F, 2, 1, 4, -0.002F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.0F, 4.0F);
        this.Body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.2618F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 0, 18, 0.0F, -2.0F, -1.0F, 0, 3, 1, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 2.4F, 0.0F);
        this.Body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.1047F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 0, 25, -1.0F, -1.0F, 0.0F, 2, 1, 4, -0.002F, false));

        this.PelvicL = new AdvancedModelRenderer(this);
        this.PelvicL.setRotationPoint(1.0F, 2.0F, 1.0F);
        this.Body2.addChild(PelvicL);
        this.setRotateAngle(PelvicL, -0.7537F, 0.1603F, -0.1487F);
        this.PelvicL.cubeList.add(new ModelBox(PelvicL, 28, 0, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, false));

        this.PelvicR = new AdvancedModelRenderer(this);
        this.PelvicR.setRotationPoint(-1.0F, 2.0F, 1.0F);
        this.Body2.addChild(PelvicR);
        this.setRotateAngle(PelvicR, -0.7537F, -0.1603F, 0.1487F);
        this.PelvicR.cubeList.add(new ModelBox(PelvicR, 28, 0, 0.0F, -0.5F, 0.0F, 0, 1, 2, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 24, 23, -1.0F, -1.0F, -1.0F, 2, 2, 4, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, -2.0F, 0.0F);
        this.Body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, -0.2618F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 0, 0, 0.0F, -2.0F, 0.0F, 0, 3, 3, 0.0F, false));
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 32, 0, -0.5F, 0.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.5672F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 37, 36, 0.0F, 0.0F, 0.0F, 0, 2, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Body3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.2618F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 31, 30, -0.5F, -1.0F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 37, -0.5F, -1.0F, -1.0F, 1, 2, 3, 0.002F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 28, 36, -0.5F, -1.0F, -1.0F, 1, 2, 3, -0.002F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 0, 0.0F, -3.0F, 0.0F, 0, 6, 7, -0.002F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Ligulella.render(f5);
    }
    public void renderStaticWall(float f) {
        this.Ligulella.rotateAngleY = (float) Math.toRadians(90);
        this.Ligulella.offsetX = -0.05F;
        this.Ligulella.offsetY = -0.23F;
        this.Ligulella.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Ligulella, 0.1F, 0.0F, 0.1F);
        this.setRotateAngle(Body1, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.2F, 0.0F);
        this.Ligulella.offsetZ = 0.0F;
        this.Ligulella.offsetY = 0.0F;
        this.Ligulella.offsetX = 0.002F;
        this.Ligulella.render(0.01F);
        this.resetToDefaultPose();
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
        this.Ligulella.offsetY = 0F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed, 0.2F, -3, f2, 1);
            this.swing(Ligulella, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(PectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(PectoralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(PelvicL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(PelvicL, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.walk(PelvicR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            this.swing(PelvicR, (float) (speed * 0.75), 0.2F, true, 3, 0, f2, 1);
            if (!e.isInWater()) {
                this.Ligulella.rotateAngleZ = (float) Math.toRadians(90);
                //this.Ligulella.offsetY = -0.25F;
                this.bob(Ligulella, -speed, 5F, false, f2, 1);
            }
        }
    }
}
