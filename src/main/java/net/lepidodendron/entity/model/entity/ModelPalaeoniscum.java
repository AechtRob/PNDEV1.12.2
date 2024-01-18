package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelBase;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelPalaeoniscum extends AdvancedModelBase {
    private final AdvancedModelRenderer Palaeoniscum;
    private final AdvancedModelRenderer Cephalon;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer AnalR;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer AnalL;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;
    private final AdvancedModelRenderer cube_r24;

    public ModelPalaeoniscum() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.Palaeoniscum = new AdvancedModelRenderer(this);
        this.Palaeoniscum.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Cephalon = new AdvancedModelRenderer(this);
        this.Cephalon.setRotationPoint(0.0F, -14.0F, 8.0F);
        this.Palaeoniscum.addChild(Cephalon);
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 20, 69, -3.0F, -4.0F, -10.4F, 5, 6, 7, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 16, 83, -2.5F, -3.0F, -15.4F, 4, 5, 5, 0.0F, false));
        this.Cephalon.cubeList.add(new ModelBox(Cephalon, 46, 60, -3.5F, -5.0F, -5.0F, 6, 10, 6, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -2.5F, -16.0F);
        this.Cephalon.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.4451F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 52, 89, -2.0F, -0.7F, -1.3F, 3, 5, 4, -0.001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -5.5F, -4.0F);
        this.Cephalon.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1571F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 79, 9, -2.5F, -0.4067F, -0.3116F, 4, 6, 5, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 5.0F, -5.0F);
        this.Cephalon.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1047F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 82, 52, -3.0F, -1.9F, 0.0F, 5, 2, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -2.5F, -16.0F);
        this.Cephalon.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1658F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 19, 52, -2.0F, -1.4F, 2.4F, 3, 6, 10, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 4.9F, -14.8F);
        this.Cephalon.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1833F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 48, 77, -2.5F, -7.8578F, -0.3516F, 4, 3, 3, 0.03F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 86, 71, -2.5F, -7.3578F, 0.1484F, 4, 2, 2, 0.04F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 2.0F, -4.0F);
        this.Cephalon.addChild(Jaw);
        this.setRotateAngle(Jaw, 0.3927F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 67, 89, -2.0F, 0.0F, -11.0F, 3, 1, 5, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 72, 0, -3.0F, 0.0F, -6.0F, 5, 2, 6, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 17, -3.0F, -2.0F, -2.0F, 5, 2, 2, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 1.0F, -10.8F);
        this.Jaw.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.192F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 59, -1.5F, -0.9224F, -0.1145F, 2, 1, 11, 0.0F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, -14.0F, 8.0F);
        this.Palaeoniscum.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 29, 24, -4.0F, -6.0F, 0.0F, 7, 11, 16, 0.01F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 6.0F, 10.0F);
        this.Body1.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0349F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 60, 29, -3.0F, -2.0F, 0.0F, 5, 2, 7, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 5.5F, 0.0F);
        this.Body1.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.0436F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 51, 0, -3.0F, -1.9F, 0.0F, 5, 2, 10, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.Body1.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0873F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 23, 0, -3.0F, 0.4F, 0.0F, 5, 3, 17, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(3.0F, 3.0F, -0.2F);
        this.Body1.addChild(PectoralL);
        this.setRotateAngle(PectoralL, 0.9559F, -0.1071F, 0.0754F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.PectoralL.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.9163F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 36, 52, 0.0F, 0.0F, 0.0F, 10, 0, 7, 0.0F, true));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-3.0F, 3.0F, -0.2F);
        this.Body1.addChild(PectoralR);
        this.setRotateAngle(PectoralR, 0.9559F, 0.1071F, -0.0754F);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.PectoralR.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0F, 0.0F, -0.9163F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 36, 52, -10.0F, 0.0F, 0.0F, 10, 0, 7, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 17.0F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 40, -3.5F, -6.0F, -2.0F, 6, 10, 8, -0.001F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 0, -0.5F, -13.0F, 1.0F, 0, 7, 9, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 6.0F, 0.0F);
        this.Body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.1396F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 56, 78, -2.0F, -3.3F, 0.0F, 3, 3, 7, 0.0F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, -8.0F, 0.2F);
        this.Body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0873F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 77, 78, -2.0F, -0.038F, -0.2345F, 3, 3, 7, 0.0F, false));

        this.AnalR = new AdvancedModelRenderer(this);
        this.AnalR.setRotationPoint(-2.0F, 4.0F, 1.0F);
        this.Body2.addChild(AnalR);


        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AnalR.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.0F, 0.0F, -0.9599F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 65, 71, -7.0F, 0.0F, -1.0F, 7, 0, 6, 0.0F, false));

        this.AnalL = new AdvancedModelRenderer(this);
        this.AnalL.setRotationPoint(1.0F, 4.0F, 1.0F);
        this.Body2.addChild(AnalL);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AnalL.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.0F, 0.0F, 0.9599F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 65, 71, 0.0F, 0.0F, -1.0F, 7, 0, 6, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 60, 13, -3.0F, -5.0F, -1.0F, 5, 7, 8, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3142F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 23, 0, -0.5F, 4.6F, -0.2F, 0, 6, 8, 0.0F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 4.8F, 0.0F);
        this.Body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.2269F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 0, 75, -1.5F, -4.0F, 0.0F, 2, 4, 8, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -7.5F, 0.0F);
        this.Body3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.1745F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 76, 39, -1.5F, 0.0F, 0.0F, 2, 4, 8, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, -1.0F, 7.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 65, 52, -2.5F, -3.0F, -1.0F, 4, 5, 8, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.Body4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.1396F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 83, 60, -1.0F, -3.0F, 0.2F, 1, 3, 7, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, -5.2F, 0.0F);
        this.Body4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.192F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 37, 77, -1.0F, 0.0F, 0.0F, 1, 4, 8, 0.0F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 89, -2.0F, -3.0F, 0.0F, 3, 5, 5, -0.001F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 0, -0.5F, -8.0F, 1.8F, 0, 17, 22, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -5.4F, 10.5F);
        this.Body5.addChild(cube_r21);
        this.setRotateAngle(cube_r21, 0.2443F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 89, 33, -1.0F, -0.0888F, 0.0716F, 1, 2, 7, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -3.0F, 4.0F);
        this.Body5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, 0.3665F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 80, 22, -1.5F, 0.0F, 0.0F, 2, 3, 7, 0.0F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Body5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.2269F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 70, 78, -1.0F, -1.0F, 0.0F, 1, 1, 5, 0.0F, false));

        this.cube_r24 = new AdvancedModelRenderer(this);
        this.cube_r24.setRotationPoint(0.0F, -3.8F, 0.0F);
        this.Body5.addChild(cube_r24);
        this.setRotateAngle(cube_r24, -0.0873F, 0.0F, 0.0F);
        this.cube_r24.cubeList.add(new ModelBox(cube_r24, 84, 89, -1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Palaeoniscum.render(f5 * 0.15F);
    }
    public void renderStaticWall(float f) {
        this.Palaeoniscum.rotateAngleY = (float) Math.toRadians(90);
        this.Palaeoniscum.offsetY = -0.1F;
        this.Palaeoniscum.offsetX = -0.27F;
        this.Palaeoniscum.offsetZ = -0.55F;
        this.Palaeoniscum.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Palaeoniscum, 0.0F, -0.1F, 0.1F);
        this.setRotateAngle(Jaw, 0.2F, 0.0F, 0.0F);
        this.setRotateAngle(Body1, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.1F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.1F, 0.0F);
        this.Palaeoniscum.offsetY = -0.0F;
        this.Palaeoniscum.offsetZ = -0.2F;
        this.Palaeoniscum.render(0.01F);
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
        this.Palaeoniscum.offsetY = 1.3F;
        this.Palaeoniscum.offsetZ = -0.2F;
        //this.Gills.rotateAngleY = f3 / (180F / (float) Math.PI);
        //this.Gills.rotateAngleX = f4 / (180F / (float) Math.PI);

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body2, this.Body3, this.Body4, this.Body5};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            this.swing(Palaeoniscum, speed, 0.3F, true, 0, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), (float)Math.toRadians(22.5), true, 0, 0, f2, 1);
            this.walk(PectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(PectoralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(AnalL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(AnalL, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.walk(AnalR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(AnalR, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if (!e.isInWater()) {
                this.Palaeoniscum.rotateAngleZ = (float) Math.toRadians(90);
                this.Palaeoniscum.offsetY = 1.22F;
                this.bob(Palaeoniscum, -speed, 5F, false, f2, 1);
            }
        }
    }
}
