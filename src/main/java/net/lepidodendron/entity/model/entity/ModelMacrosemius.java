package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelMacrosemius extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer Macrosemius;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer PectoralL;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer PectoralR;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer Body1;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer AnalL;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer AnalR;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer cube_r20;
    private final AdvancedModelRenderer cube_r21;
    private final AdvancedModelRenderer Body5;
    private final AdvancedModelRenderer cube_r22;
    private final AdvancedModelRenderer cube_r23;

    public ModelMacrosemius() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Macrosemius = new AdvancedModelRenderer(this);
        this.Macrosemius.setRotationPoint(0.5F, 28.0F, 0.0F);


        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, -8.0F, -5.0F);
        this.Macrosemius.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 36, 10, -1.5F, 1.1F, -2.0F, 2, 1, 2, 0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 34, 34, -1.5F, -1.5F, -2.3F, 2, 2, 2, -0.002F, false));
        this.Head.cubeList.add(new ModelBox(Head, 33, 25, -1.5F, -1.5F, -2.0F, 2, 2, 2, -0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 36, 30, -1.0F, -0.1494F, -3.9266F, 1, 1, 2, -0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 24, 8, -1.5F, -2.0F, 0.0F, 2, 5, 2, 0.01F, false));
        this.Head.cubeList.add(new ModelBox(Head, 15, 29, -1.0F, -2.4183F, 0.4525F, 1, 2, 1, 0.001F, false));
        this.Head.cubeList.add(new ModelBox(Head, 12, 39, -1.5F, -2.4183F, 1.0525F, 2, 2, 1, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 7, 41, -0.5F, -6.0F, 1.0F, 0, 4, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.5F, -2.5F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.2967F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 31, 4, -1.0F, -0.0018F, 0.0845F, 1, 2, 3, 0.0001F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.5323F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 12, 34, -1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.63F, -3.76F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1833F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 6, 10, -1.5F, -4.3224F, 1.2959F, 2, 1, 1, 0.04F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.1396F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 10, -0.8F, -0.4F, -4.9F, 0, 1, 2, 0.001F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 10, -0.2F, -0.4F, -4.9F, 0, 1, 2, 0.001F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 38, 39, -1.0F, -0.7F, -5.0F, 1, 1, 2, 0.001F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 2.3F, -2.0F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.2618F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 39, -1.0F, -1.0F, 0.1F, 1, 1, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3491F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 26, -1.5F, 0.7F, -2.7F, 2, 1, 3, -0.001F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 22, -1.5F, -0.6F, -0.6F, 2, 2, 1, -0.001F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 23, 1, -1.5F, -0.6F, -2.7F, 2, 2, 3, 0.0F, false));

        this.PectoralL = new AdvancedModelRenderer(this);
        this.PectoralL.setRotationPoint(0.5F, 2.8F, 1.2F);
        this.Head.addChild(PectoralL);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PectoralL.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, 0.0F, 0.6545F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 11, 0, 0.0F, 0.0F, -1.4F, 4, 0, 3, 0.0F, false));

        this.PectoralR = new AdvancedModelRenderer(this);
        this.PectoralR.setRotationPoint(-1.5F, 2.8F, 1.2F);
        this.Head.addChild(PectoralR);


        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.PectoralR.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.0F, -0.6545F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 11, 0, -4.0F, 0.0F, -1.4F, 4, 0, 3, 0.0F, true));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, -1.9F);
        this.Head.addChild(Jaw);
        this.setRotateAngle(Jaw, -0.192F, 0.0F, 0.0F);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 31, 39, -1.0F, 0.0F, -2.0F, 1, 1, 2, 0.0001F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 0, -0.1F, -0.3F, -1.8F, 0, 1, 1, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 0, 0, -0.9F, -0.3F, -1.8F, 0, 1, 1, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, -1.8F);
        this.Jaw.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.1396F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 39, 21, -1.0F, -0.0163F, 0.3029F, 1, 1, 2, -0.001F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 1.2F, -2.0F);
        this.Jaw.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0349F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 11, 0, -0.9F, -1.5F, -0.8F, 0, 1, 1, 0.0F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 11, 0, -0.1F, -1.5F, -0.8F, 0, 1, 1, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.Jaw.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0349F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 39, 14, -1.0F, -1.0F, -0.9F, 1, 1, 1, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.0F, -0.4F);
        this.Jaw.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.0349F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 24, 41, -1.5F, 0.0326F, -0.9058F, 2, 1, 1, -0.003F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.0F, 0.1F, 0.1F);
        this.Jaw.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.0698F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 41, -1.5F, -0.0323F, -0.8116F, 2, 1, 1, -0.002F, false));

        this.Body1 = new AdvancedModelRenderer(this);
        this.Body1.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Head.addChild(Body1);
        this.Body1.cubeList.add(new ModelBox(Body1, 0, 0, -2.0F, -2.0F, 0.0F, 3, 5, 4, 0.0F, false));
        this.Body1.cubeList.add(new ModelBox(Body1, 29, 28, -0.5F, -6.0F, 1.0F, 0, 4, 3, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, -2.4F, 1.0F);
        this.Body1.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0698F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 22, 22, -1.5F, -0.0183F, 0.0525F, 2, 2, 3, 0.0F, false));

        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, 0.0F, 3.8F);
        this.Body1.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 11, 10, -2.0F, -2.0F, 0.0F, 3, 5, 3, -0.01F, false));
        this.Body2.cubeList.add(new ModelBox(Body2, 8, 29, -0.51F, -6.0F, 0.0F, 0, 4, 3, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, -2.2F, 0.0F);
        this.Body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0698F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 21, 16, -1.5F, -0.0085F, 0.0458F, 2, 2, 3, -0.0001F, false));

        this.AnalL = new AdvancedModelRenderer(this);
        this.AnalL.setRotationPoint(1.0F, 2.7F, 2.5F);
        this.Body2.addChild(AnalL);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AnalL.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.0F, 0.0F, 0.6981F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 31, 0, 0.0F, 0.0F, -0.7F, 3, 0, 2, 0.0F, false));

        this.AnalR = new AdvancedModelRenderer(this);
        this.AnalR.setRotationPoint(-2.0F, 2.7F, 2.5F);
        this.Body2.addChild(AnalR);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.AnalR.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.0F, 0.0F, -0.6981F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 31, 0, -3.0F, 0.0F, -0.7F, 3, 0, 2, 0.0F, true));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 0.0F, 3.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 20, 28, -1.5F, -1.0F, 0.0F, 2, 4, 2, 0.0F, false));
        this.Body3.cubeList.add(new ModelBox(Body3, 21, 35, -0.5F, -6.0F, 0.0F, 0, 5, 2, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.0F, -1.7F, 0.0F);
        this.Body3.addChild(cube_r18);
        this.setRotateAngle(cube_r18, -0.2443F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 5, 37, -1.0F, -0.2331F, 0.3046F, 1, 1, 2, 0.0F, false));
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 37, 17, -1.0F, -0.2331F, -0.0954F, 1, 1, 2, 0.001F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, 0.0F, 2.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 15, 4, -1.5F, -0.3F, 0.0F, 2, 2, 3, 0.0F, false));
        this.Body4.cubeList.add(new ModelBox(Body4, 15, 19, -0.5F, -6.0F, 0.0F, 0, 6, 3, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(0.0F, 2.5F, 0.0F);
        this.Body4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.6458F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 31, -0.5F, 0.3F, -0.4F, 0, 3, 3, 0.0F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.0F, 3.0F, 0.0F);
        this.Body4.addChild(cube_r20);
        this.setRotateAngle(cube_r20, 0.4363F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 30, 13, -1.0F, -2.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.cube_r21 = new AdvancedModelRenderer(this);
        this.cube_r21.setRotationPoint(0.0F, -1.5F, -0.1F);
        this.Body4.addChild(cube_r21);
        this.setRotateAngle(cube_r21, -0.2967F, 0.0F, 0.0F);
        this.cube_r21.cubeList.add(new ModelBox(cube_r21, 30, 19, -1.0F, 0.0325F, 0.4126F, 1, 2, 3, -0.001F, false));

        this.Body5 = new AdvancedModelRenderer(this);
        this.Body5.setRotationPoint(0.0F, 0.7F, 3.0F);
        this.Body4.addChild(Body5);
        this.Body5.cubeList.add(new ModelBox(Body5, 26, 36, -1.0F, -1.0F, 0.0F, 1, 2, 2, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 0, 10, -0.49F, -3.0F, 1.8F, 0, 6, 5, 0.0F, false));
        this.Body5.cubeList.add(new ModelBox(Body5, 8, 19, -0.5F, -6.7F, 0.0F, 0, 6, 3, 0.0F, false));

        this.cube_r22 = new AdvancedModelRenderer(this);
        this.cube_r22.setRotationPoint(0.0F, -1.2F, 0.1F);
        this.Body5.addChild(cube_r22);
        this.setRotateAngle(cube_r22, -0.1047F, 0.0F, 0.0F);
        this.cube_r22.cubeList.add(new ModelBox(cube_r22, 37, 3, -1.0F, 0.0118F, -0.0399F, 1, 1, 2, -0.002F, false));

        this.cube_r23 = new AdvancedModelRenderer(this);
        this.cube_r23.setRotationPoint(0.0F, -1.0F, 2.0F);
        this.Body5.addChild(cube_r23);
        this.setRotateAngle(cube_r23, 0.3142F, 0.0F, 0.0F);
        this.cube_r23.cubeList.add(new ModelBox(cube_r23, 12, 19, -1.0F, -0.1F, -0.3F, 1, 1, 1, -0.001F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Macrosemius.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Macrosemius.offsetY = -0.4F;
        this.Macrosemius.offsetX = -0.2F;
        this.Macrosemius.offsetZ = 2.0F;
        this.Macrosemius.rotateAngleY = (float)Math.toRadians(120);
        this.Macrosemius.rotateAngleX = (float)Math.toRadians(1);
        this.Macrosemius.rotateAngleZ = (float)Math.toRadians(0);
        this.Macrosemius.scaleChildren = true;
        float scaler = 3.2F;
        this.Macrosemius.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Macrosemius, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Body1, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.45F, 0.0F);
        //End of pose, now render the model:
        this.Macrosemius.render(f);
        //Reset rotations, positions and sizing:
        this.Macrosemius.setScale(1.0F, 1.0F, 1.0F);
        this.Macrosemius.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.Macrosemius.rotateAngleY = (float) Math.toRadians(90);
        this.Macrosemius.offsetZ = -0.0F;
        this.Macrosemius.offsetY = -0.2F;
        this.Macrosemius.offsetX = -0.02F;
        this.Macrosemius.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body1, 0.0F, 0.05F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, -0.3F, 0.0F);
        this.setRotateAngle(Body5, 0.0F, -0.45F, 0.0F);
        this.Macrosemius.offsetY = -0.14F;
        this.Macrosemius.render(0.01F);
        resetToDefaultPose();
    }
    public void setRotateAngle(AdvancedModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.Macrosemius.offsetX = -0.5F;
        this.Macrosemius.offsetY = -0.12F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.Body3, this.Body4, this.Body5};
        float speed = 0.3F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainSwing(fishTail, speed*0.75F, 0.15F, 0, f2, 1);
            this.walk(Jaw, (float) (speed * 0.75), 0.3F, true, 0, 0, f2, 1);

            this.walk(PectoralL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(PectoralR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(PectoralR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(AnalL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(AnalL, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.walk(AnalR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);
            this.swing(AnalR, (float) (speed * 0.75), 0.15F, true, 0, 0, f2, 1);


            this.swing(Macrosemius, speed*0.75F, 0.2F, true, 0, 0, f2, 1);
             if (!e.isInWater()) {
                this.Macrosemius.rotateAngleZ = (float) Math.toRadians(90);
                this.Macrosemius.offsetY = -0.3F;
                this.bob(Macrosemius, speed*1.75F, 5F, false, f2, 1);
            }
        }
    }
}
