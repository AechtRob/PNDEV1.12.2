package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraThalattosuchus;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelThalattosuchus extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer Body;
    private final AdvancedModelRenderer Neck;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer Lowerjaw;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer bone3;
    private final AdvancedModelRenderer bone6;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer snout;
    private final AdvancedModelRenderer bone4;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer bone16;
    private final AdvancedModelRenderer Body2;
    private final AdvancedModelRenderer Body3;
    private final AdvancedModelRenderer Body4;
    private final AdvancedModelRenderer rightUpperLegL;
    private final AdvancedModelRenderer rightLowerLegL;
    private final AdvancedModelRenderer rightFootL;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer leftUpperLegL;
    private final AdvancedModelRenderer leftLowerLegL;
    private final AdvancedModelRenderer leftFootL;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;
    private final AdvancedModelRenderer Tail4;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer rightUpperArm;
    private final AdvancedModelRenderer leftUpperArm;


    private final ModelAnimator animator;

    public ModelThalattosuchus() {
        this.textureWidth = 90;
        this.textureHeight = 90;

        this.Body = new AdvancedModelRenderer(this);
        this.Body.setRotationPoint(0.0F, 17.0F, -7.5F);
        this.Body.cubeList.add(new ModelBox(Body, 46, 0, -4.0F, -1.6F, -1.5F, 8, 8, 6, 0.0F, false));

        this.Neck = new AdvancedModelRenderer(this);
        this.Neck.setRotationPoint(0.0F, 1.0F, -2.5F);
        this.Body.addChild(Neck);
        this.Neck.cubeList.add(new ModelBox(Neck, 51, 18, -3.0F, -2.0F, -5.0F, 6, 7, 7, 0.0F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.0F, -4.0F);
        this.Neck.addChild(Head);
        this.setRotateAngle(Head, -0.0436F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 56, 60, -3.0F, 0.0F, -7.0F, 6, 2, 7, -0.001F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.3403F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 27, 0, -3.0F, -0.5F, 0.0F, 6, 2, 4, -0.02F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, -1.95F, -1.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0436F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 64, 50, -3.0F, 0.0F, -2.425F, 6, 2, 3, -0.001F, false));

        this.Lowerjaw = new AdvancedModelRenderer(this);
        this.Lowerjaw.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Head.addChild(Lowerjaw);
        this.Lowerjaw.cubeList.add(new ModelBox(Lowerjaw, 59, 32, -3.0F, 0.0F, -7.0F, 6, 2, 8, -0.001F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(0.0F, 2.0F, -8.0F);
        this.Lowerjaw.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.1222F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 64, 42, -2.0F, -1.0F, 1.0F, 4, 1, 7, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.Lowerjaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.24F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 60, 69, -2.0F, -3.0F, 0.0F, 4, 3, 5, -0.001F, false));

        this.bone3 = new AdvancedModelRenderer(this);
        this.bone3.setRotationPoint(0.0F, 1.0F, -8.0F);
        this.Lowerjaw.addChild(bone3);
        this.setRotateAngle(bone3, -0.0436F, 0.0F, 0.0F);
        this.bone3.cubeList.add(new ModelBox(bone3, 68, 8, -2.0F, -1.0F, -5.0F, 4, 1, 6, -0.001F, false));
        this.bone3.cubeList.add(new ModelBox(bone3, 0, 24, 1.5F, -1.65F, -5.0F, 0, 1, 5, 0.0F, false));

        this.bone6 = new AdvancedModelRenderer(this);
        this.bone6.setRotationPoint(0.0F, -1.0F, -5.1F);
        this.bone3.addChild(bone6);
        this.setRotateAngle(bone6, 0.0873F, 0.0F, 0.0F);
        this.bone6.cubeList.add(new ModelBox(bone6, 38, 71, -1.0F, 0.0F, -6.9F, 2, 1, 7, -0.001F, false));
        this.bone6.cubeList.add(new ModelBox(bone6, 74, 0, -0.5F, -0.65F, -6.9F, 1, 1, 7, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -7.0F);
        this.bone6.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1658F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 5, -1.5F, -0.675F, 12.225F, 3, 1, 1, 0.0F, false));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 72, 71, -1.5F, -0.675F, 7.075F, 3, 1, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, -6.9F);
        this.bone6.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.0742F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 70, 15, -1.0F, 0.0F, 0.0F, 2, 1, 7, 0.0F, false));

        this.snout = new AdvancedModelRenderer(this);
        this.snout.setRotationPoint(0.0F, 2.0F, -8.0F);
        this.Head.addChild(snout);
        this.setRotateAngle(snout, -0.0436F, 0.0F, 0.0F);
        this.snout.cubeList.add(new ModelBox(snout, 14, 68, -2.0F, -1.0F, -5.0F, 4, 1, 6, 0.0F, false));
        this.snout.cubeList.add(new ModelBox(snout, 0, 23, 1.5F, -0.35F, -5.0F, 0, 1, 5, 0.0F, false));

        this.bone4 = new AdvancedModelRenderer(this);
        this.bone4.setRotationPoint(0.0F, 0.0F, -5.0F);
        this.snout.addChild(bone4);
        this.setRotateAngle(bone4, 0.0873F, 0.0F, 0.0F);
        this.bone4.cubeList.add(new ModelBox(bone4, 0, 65, -1.0F, -1.0F, -7.0F, 2, 1, 8, 0.0F, false));
        this.bone4.cubeList.add(new ModelBox(bone4, 27, 68, -1.0F, -1.25F, -6.0F, 2, 1, 7, -0.01F, false));
        this.bone4.cubeList.add(new ModelBox(bone4, 49, 72, -0.5F, -0.35F, -6.9F, 1, 1, 7, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.5F, -1.25F, 0.0F);
        this.bone4.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.1178F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 21, 25, -1.0F, 1.0F, 3.575F, 3, 1, 3, 0.0F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 0, 74, -1.0F, 0.0F, 0.075F, 3, 1, 6, 0.0F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.2522F, -5.9829F);
        this.bone4.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.2618F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 7, -1.0F, 0.0F, -1.0F, 2, 1, 1, -0.01F, false));

        this.bone16 = new AdvancedModelRenderer(this);
        this.bone16.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Neck.addChild(bone16);


        this.Body2 = new AdvancedModelRenderer(this);
        this.Body2.setRotationPoint(0.0F, -0.15F, 1.5F);
        this.Body.addChild(Body2);
        this.Body2.cubeList.add(new ModelBox(Body2, 0, 0, -4.5F, -1.75F, 3.0F, 9, 9, 9, 0.001F, false));

        this.Body3 = new AdvancedModelRenderer(this);
        this.Body3.setRotationPoint(0.0F, 2.75F, 11.0F);
        this.Body2.addChild(Body3);
        this.Body3.cubeList.add(new ModelBox(Body3, 25, 28, -4.0F, -4.5F, 0.0F, 8, 9, 9, 0.0F, false));

        this.Body4 = new AdvancedModelRenderer(this);
        this.Body4.setRotationPoint(0.0F, -1.0F, 9.0F);
        this.Body3.addChild(Body4);
        this.Body4.cubeList.add(new ModelBox(Body4, 0, 37, -3.5F, -3.25F, -1.0F, 7, 8, 9, 0.0F, false));

        this.rightUpperLegL = new AdvancedModelRenderer(this);
        this.rightUpperLegL.setRotationPoint(-3.0F, 1.9F, 5.65F);
        this.Body4.addChild(rightUpperLegL);
        this.setRotateAngle(rightUpperLegL, 0.6771F, -0.2199F, 0.1889F);
        this.rightUpperLegL.cubeList.add(new ModelBox(rightUpperLegL, 48, 46, -0.5F, 0.0F, -2.0F, 2, 7, 3, 0.0F, false));

        this.rightLowerLegL = new AdvancedModelRenderer(this);
        this.rightLowerLegL.setRotationPoint(0.25F, 6.75F, -0.5F);
        this.rightUpperLegL.addChild(rightLowerLegL);
        this.setRotateAngle(rightLowerLegL, 0.5687F, 0.099F, -0.2131F);
        this.rightLowerLegL.cubeList.add(new ModelBox(rightLowerLegL, 75, 55, -0.65F, -0.05F, -1.5F, 2, 5, 3, 0.0F, false));

        this.rightFootL = new AdvancedModelRenderer(this);
        this.rightFootL.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.rightLowerLegL.addChild(rightFootL);
        this.setRotateAngle(rightFootL, 0.2618F, 0.0F, 0.2182F);


        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.rightFootL.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, 0.0F, -0.3098F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 18, -0.25F, -0.3F, -2.25F, 1, 6, 4, 0.0F, false));

        this.leftUpperLegL = new AdvancedModelRenderer(this);
        this.leftUpperLegL.setRotationPoint(3.0F, 1.9F, 5.65F);
        this.Body4.addChild(leftUpperLegL);
        this.setRotateAngle(leftUpperLegL, 0.6906F, 0.3461F, 0.0135F);
        this.leftUpperLegL.cubeList.add(new ModelBox(leftUpperLegL, 48, 46, -1.5F, 0.0F, -2.0F, 2, 7, 3, 0.0F, true));

        this.leftLowerLegL = new AdvancedModelRenderer(this);
        this.leftLowerLegL.setRotationPoint(-0.25F, 6.75F, -0.5F);
        this.leftUpperLegL.addChild(leftLowerLegL);
        this.setRotateAngle(leftLowerLegL, 0.5795F, -0.259F, 0.1135F);
        this.leftLowerLegL.cubeList.add(new ModelBox(leftLowerLegL, 75, 55, -1.35F, -0.05F, -1.5F, 2, 5, 3, 0.0F, true));

        this.leftFootL = new AdvancedModelRenderer(this);
        this.leftFootL.setRotationPoint(0.0F, 4.0F, 0.0F);
        this.leftLowerLegL.addChild(leftFootL);
        this.setRotateAngle(leftFootL, 0.2618F, 0.0F, -0.2182F);


        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.0F, 0.0F, 0.5F);
        this.leftFootL.addChild(cube_r10);
        this.setRotateAngle(cube_r10, 0.0F, 0.0F, 0.3491F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 0, 18, -0.75F, -0.3F, -2.25F, 1, 6, 4, 0.0F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Body4.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 24, 6, -2.5F, -3.0F, -1.0F, 5, 7, 12, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -1.0F, 10.0F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 18, -2.0F, -1.75F, -1.0F, 4, 6, 13, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.5F, 11.0F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 48, 46, -1.5F, -1.25F, -1.0F, 3, 4, 10, 0.0F, false));

        this.Tail4 = new AdvancedModelRenderer(this);
        this.Tail4.setRotationPoint(0.0F, 0.5F, 7.5F);
        this.Tail3.addChild(Tail4);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 32, 38, 0.0F, -8.1F, 0.25F, 0, 18, 8, 0.0F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -1.75F, 0.0F);
        this.Tail4.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.829F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 12, 75, -0.5F, 1.775F, 8.225F, 1, 2, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, -0.75F, 0.0F);
        this.Tail4.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -1.0472F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 20, 57, -1.0F, -1.6F, 0.0F, 2, 3, 8, 0.0F, false));

        this.rightUpperArm = new AdvancedModelRenderer(this);
        this.rightUpperArm.setRotationPoint(-4.0F, 4.75F, 3.45F);
        this.Body.addChild(rightUpperArm);
        this.setRotateAngle(rightUpperArm, -0.5236F, -0.5672F, 0.0F);
        this.rightUpperArm.cubeList.add(new ModelBox(rightUpperArm, 0, 0, 0.0F, -1.0F, 0.0F, 1, 2, 3, 0.0F, false));

        this.leftUpperArm = new AdvancedModelRenderer(this);
        this.leftUpperArm.setRotationPoint(4.0F, 4.75F, 3.45F);
        this.Body.addChild(leftUpperArm);
        this.setRotateAngle(leftUpperArm, -0.5236F, 0.5672F, 0.0F);
        this.leftUpperArm.cubeList.add(new ModelBox(leftUpperArm, 0, 0, -1.0F, -1.0F, 0.0F, 1, 2, 3, 0.0F, true));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Body.render(f5);
    }

    public void renderStaticWall(float f) {
        this.setRotateAngle(Neck, 0.2F, -0.2F, 0.0F);
        this.setRotateAngle(Head, -0.25F, 0.3F, 0.1F);
        this.setRotateAngle(Lowerjaw, 0.3F, 0.0F, 0.0F);
        this.Neck.offsetZ = -0.35F;
        this.Neck.offsetY = -0.03F;
        this.Neck.offsetX = -0.0F;
        this.Neck.render(0.01F);
        this.resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.setRotateAngle(Body, 0.2F, -0.2F, 0.3F);
        this.setRotateAngle(Neck, -0.0F, -0.4F, -0.2F);
        this.setRotateAngle(Head, -0.1F, -0.3F, -0.2F);
        this.setRotateAngle(Lowerjaw, 0.0F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, -0.2F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, -0.2F, 0.1F);
        this.setRotateAngle(Tail2, 0.0F, -0.3F, 0.1F);
        this.setRotateAngle(Tail3, 0.0F, -0.4F, 0.1F);
        this.setRotateAngle(Tail4, 0.0F, -0.4F, 0.2F);
        this.Body.offsetZ = -0.0F;
        this.Body.offsetY = -0.3F;
        this.Body.offsetX = 0.005F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticSuspended(float f) {
        this.setRotateAngle(Body, -0.1F, 0.0F, 0.0F);
        this.setRotateAngle(Neck, 0.2F, 0.2F, 0.0F);
        this.setRotateAngle(Head, 0.1F, 0.1F, 0.0F);
        this.setRotateAngle(Lowerjaw, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tail, 0.0F, 0.1F, 0.0F);
        this.setRotateAngle(Tail2, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tail3, 0.0F, 0.2F, 0.0F);
        this.setRotateAngle(Tail4, 0.0F, 0.2F, 0.0F);
        this.Body.offsetZ = -0.0F;
        this.Body.offsetY = -0.1F;
        this.Body.offsetX = 0.005F;
        this.Body.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Body.offsetY = -0.4F;
        this.Body.offsetX = 1.25F;
        this.Body.rotateAngleY = (float)Math.toRadians(200);
        this.Body.rotateAngleX = (float)Math.toRadians(8);
        this.Body.rotateAngleZ = (float)Math.toRadians(-8);
        this.Body.scaleChildren = true;
        float scaler = 1.1F;
        this.Body.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Body, 0.4F, -3.0F, 0.1F);
        this.setRotateAngle(Neck, -0.3F, -0.2F, -0.0F);
        this.setRotateAngle(Head, -0.3F, -0.4F, -0.0F);
        this.setRotateAngle(Lowerjaw, 0.3F, 0.0F, 0.0F);
        this.setRotateAngle(Body2, -0.0F, 0.3F, 0.0F);
        this.setRotateAngle(Body3, 0.0F, 0.7F, 0.0F);
        this.setRotateAngle(Body4, 0.0F, 0.4F, 0.0F);
        this.setRotateAngle(Tail, 0.2F, 0.4F, 0.1F);
        this.setRotateAngle(Tail2, 0.3F, 0.4F, 0.1F);
        this.setRotateAngle(Tail3, 0.4F, 0.7F, 0.1F);
        this.setRotateAngle(Tail4, 0.5F, 0.9F, 0.2F);
        //End of pose, now render the model:
        this.Body.render(f);
        //Reset rotations, positions and sizing:
        this.Body.setScale(1.0F, 1.0F, 1.0F);
        this.Body.scaleChildren = false;
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
        //this.resetToDefaultPose();
        this.Body.offsetY = 0.25F;
        this.Body.offsetZ = -0.4F;

        EntityPrehistoricFloraThalattosuchus Dako = (EntityPrehistoricFloraThalattosuchus) e;

        this.faceTarget(f3, f4, 5, Neck);
        this.faceTarget(f3, f4, 5, Head);
        AdvancedModelRenderer[] Tail = {this.Body3, this.Body4, this.Tail, this.Tail2, this.Tail3, this.Tail4};
        //AdvancedModelRenderer[] Torso = {this.Neckfront, this.Neckmiddlefront, this.Neckmiddlebase, this.Neckbase, this.Bodyfront};
        Dako.tailBuffer.applyChainSwingBuffer(Tail);

        //AdvancedModelRenderer[] FL = {this.Rightupperarm, this.Rightlowerarm, this.Rightfrontfoot};
        //AdvancedModelRenderer[] FR = {this.Leftupperarm, this.Leftlowerarm, this.Leftfrontfoot};
        //AdvancedModelRenderer[] BL = {this.Rightthigh, this.Rightshin, this.Righthindfoot};
        //AdvancedModelRenderer[] BR = {this.Leftthigh, this.Leftshin, this.Lefthindfoot};

        AdvancedModelRenderer[] fishTail = {this.Body4, this.Tail, this.Tail2, this.Tail3, this.Tail4};
        AdvancedModelRenderer[] finPectoralLeft = {this.leftUpperArm};
        AdvancedModelRenderer[] finPectoralRight = {this.rightUpperArm};
        AdvancedModelRenderer[] finPelvicLeft = {this.leftUpperLegL, this.leftLowerLegL, this.leftFootL};
        AdvancedModelRenderer[] finPelvicRight = {this.rightUpperLegL, this.rightLowerLegL, this.rightFootL};

        if (!Dako.isReallyInWater()) { //will never happen as it should not be on land
            float speed = 0.3F;
            float outOfWater = 1.45f;

            this.Body.bob(speed, 0.35F, false, f2, 1F);

            this.chainWave(fishTail, speed * outOfWater, 0.05F * outOfWater, -3, f2, 1);
            this.chainSwing(fishTail, speed * outOfWater, 0.15F * outOfWater, -2.5, f2, 1);
            this.swing(Body, speed * outOfWater, 0.21F * outOfWater, true, 0, 0, f2, 1);

            this.chainWave(finPectoralLeft, speed * outOfWater, 0.25F * outOfWater, 0.5F, f2, 1);
            this.chainSwingExtended(finPectoralLeft, speed * outOfWater, 0.8F * outOfWater, 0.5F, 3, f2, 1);
            this.chainFlap(finPectoralLeft, speed * outOfWater, 0.15F * outOfWater, -0.8, f2, 1);

            this.chainWave(finPectoralRight, speed * outOfWater, 0.25F * outOfWater, 0.5F, f2, 1);
            this.chainSwing(finPectoralRight, speed * outOfWater, -0.8F * outOfWater, 0.5F, f2, 1);
            this.chainFlap(finPectoralRight, speed * outOfWater, -0.15F * outOfWater, 0.8, f2, 1);

            this.chainWave(finPelvicLeft, speed * outOfWater, 0.20F * outOfWater, 0.3F, f2, 1);
            this.chainSwing(finPelvicLeft, speed * outOfWater, 0.20F * outOfWater, 0.3F, f2, 1);
            this.chainFlap(finPelvicLeft, speed * outOfWater, 0.10F * outOfWater, -0.5, f2, 1);

            this.chainWave(finPelvicRight, speed * outOfWater, 0.20F * outOfWater, 0.3F, f2, 1);
            this.chainSwingExtended(finPelvicRight, speed * outOfWater, -0.20F * outOfWater, 0.3F, 3, f2, 1);
            this.chainFlap(finPelvicRight, speed * outOfWater, -0.10F * outOfWater, 0.5, f2, 1);

        }
    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraThalattosuchus ee = (EntityPrehistoricFloraThalattosuchus) entitylivingbaseIn;

        if (ee.isReallyInWater()) {
                if (ee.getIsFast()) { //Running
                    animRunning(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                } else { //Walking
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
        }
        else {
            //Do the LL one defined above
        }
        if (ee.getAnimation() == ee.ATTACK_ANIMATION) {
            animAttack(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }

    }

    public void animAttack(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraThalattosuchus entity = (EntityPrehistoricFloraThalattosuchus) entitylivingbaseIn;
        int animCycle = 20;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66+60))*30-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*-10)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66+60))*30 + (((tickAnim - 10) / 4) * (14.3314+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*20.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66+60))*30)));
            yy = 0 + (((tickAnim - 10) / 4) * (2.44894-(0)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2 + (((tickAnim - 10) / 4) * (-7.8805+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = 14.3314+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*20.5 + (((tickAnim - 14) / 6) * (0-(14.3314+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1+60))*20.5)));
            yy = 2.44894 + (((tickAnim - 14) / 6) * (0-(2.44894)));
            zz = -7.8805+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2 + (((tickAnim - 14) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2-(-7.8805+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5 + (((tickAnim - 0) / 10) * (2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66))*15.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = 2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66))*15.5 + (((tickAnim - 10) / 4) * (-38.1534+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10-(2+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66))*15.5)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2 + (((tickAnim - 10) / 4) * (1.5606+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2 + (((tickAnim - 10) / 4) * (9.9348+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2)));
        }
        else if (tickAnim >= 14 && tickAnim < 20) {
            xx = -38.1534+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10 + (((tickAnim - 14) / 6) * (0-(-38.1534+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1))*10)));
            yy = 1.5606+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2 + (((tickAnim - 14) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2-(1.5606+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/0.5))*2)));
            zz = 9.9348+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2 + (((tickAnim - 14) / 6) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2-(9.9348+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*2)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0 + (((tickAnim - 0) / 10) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66-60))*5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.5))*0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 14) {
            xx = Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66-60))*5 + (((tickAnim - 10) / 4) * (-9.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*40-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/0.66-60))*5)));
            yy = 0 + (((tickAnim - 10) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 4) * (0-(0)));
        }
        else if (tickAnim >= 14 && tickAnim < 17) {
            xx = -9.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*40 + (((tickAnim - 14) / 3) * (0-(-9.25+Math.sin((Math.PI/180)*(((double)tickAnim/20)*180/1-60))*40)));
            yy = 0 + (((tickAnim - 14) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 14) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Lowerjaw, Lowerjaw.rotateAngleX + (float) Math.toRadians(xx), Lowerjaw.rotateAngleY + (float) Math.toRadians(yy), Lowerjaw.rotateAngleZ + (float) Math.toRadians(zz));

    }

    public void animRunning(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraThalattosuchus entity = (EntityPrehistoricFloraThalattosuchus) entitylivingbaseIn;
        int animCycle = 180;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-1), Body.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*5), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-90))*0.5);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-90))*0.5);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-90))*0.5);
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*1), Neck.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-2), Neck.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-1));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-2), Head.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-1));
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(0), Body2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*2), Body2.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*2));
        this.setRotateAngle(Body3, Body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*-1), Body3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*2), Body3.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*2));
        this.setRotateAngle(Body4, Body4.rotateAngleX + (float) Math.toRadians(0), Body4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*10), Body4.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1))*2));
        this.setRotateAngle(rightUpperLegL, rightUpperLegL.rotateAngleX + (float) Math.toRadians(-1.08783), rightUpperLegL.rotateAngleY + (float) Math.toRadians(11.21357), rightUpperLegL.rotateAngleZ + (float) Math.toRadians(8.8737+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-60))*-20));
        this.setRotateAngle(rightLowerLegL, rightLowerLegL.rotateAngleX + (float) Math.toRadians(0), rightLowerLegL.rotateAngleY + (float) Math.toRadians(0), rightLowerLegL.rotateAngleZ + (float) Math.toRadians(12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-100))*-5));
        this.setRotateAngle(rightFootL, rightFootL.rotateAngleX + (float) Math.toRadians(0), rightFootL.rotateAngleY + (float) Math.toRadians(0), rightFootL.rotateAngleZ + (float) Math.toRadians(25));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-60))*2), Tail.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-60))*20), Tail.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-60))*2));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-100))*20), Tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-180))*25), Tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-250))*25), Tail4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(leftUpperLegL, leftUpperLegL.rotateAngleX + (float) Math.toRadians(-1.08783), leftUpperLegL.rotateAngleY + (float) Math.toRadians(11.21357), leftUpperLegL.rotateAngleZ + (float) Math.toRadians(8.8737+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-60))*-20));
        this.setRotateAngle(leftLowerLegL, leftLowerLegL.rotateAngleX + (float) Math.toRadians(0), leftLowerLegL.rotateAngleY + (float) Math.toRadians(0), leftLowerLegL.rotateAngleZ + (float) Math.toRadians(12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/1-100))*-5));

    }

    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraThalattosuchus entity = (EntityPrehistoricFloraThalattosuchus) entitylivingbaseIn;
        int animCycle = 100;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/2.5))*-1), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5))*-4), Body.rotateAngleZ + (float) Math.toRadians(0));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-90))*0.5);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/2.5-90))*0.5);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-180))*0.5);
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/2.5+180))*1), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+30))*-1), Neck.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/2.5+270))*1), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+120))*-1), Head.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/2.5+120))*-0.5), Body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+120))*1), Body2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body3, Body3.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/2.5+90))*-0.5), Body3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5+90))*5), Body3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Body4, Body4.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180/2.5))*-0.5), Body4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5))*5), Body4.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightUpperLegL, rightUpperLegL.rotateAngleX + (float) Math.toRadians(0), rightUpperLegL.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-0))*-10), rightUpperLegL.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(rightLowerLegL, rightLowerLegL.rotateAngleX + (float) Math.toRadians(0), rightLowerLegL.rotateAngleY + (float) Math.toRadians(0), rightLowerLegL.rotateAngleZ + (float) Math.toRadians(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-20))*-5));
        this.setRotateAngle(rightFootL, rightFootL.rotateAngleX + (float) Math.toRadians(0), rightFootL.rotateAngleY + (float) Math.toRadians(0), rightFootL.rotateAngleZ + (float) Math.toRadians(12.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*10));
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(0), Tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-0))*10), Tail.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(0), Tail2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-50))*10), Tail2.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(0), Tail3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-70))*10), Tail3.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(0), Tail4.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360/2.5-150))*20), Tail4.rotateAngleZ + (float) Math.toRadians(0));

        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -3.87198 + (((tickAnim - 0) / 18) * (-6.17527-(-3.87198)));
            yy = -12.7465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-0))*-10 + (((tickAnim - 0) / 18) * (-1.1428+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-0))*-10-(-12.7465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-0))*-10)));
            zz = -6.7079+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5 + (((tickAnim - 0) / 18) * (-4.5726+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5-(-6.7079+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5)));
        }
        else if (tickAnim >= 18 && tickAnim < 42) {
            xx = -6.17527 + (((tickAnim - 18) / 24) * (-3.87198-(-6.17527)));
            yy = -1.1428+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-0))*-10 + (((tickAnim - 18) / 24) * (-12.7465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-0))*-10-(-1.1428+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-0))*-10)));
            zz = -4.5726+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5 + (((tickAnim - 18) / 24) * (-6.7079+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5-(-4.5726+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5)));
        }
        else if (tickAnim >= 42 && tickAnim < 69) {
            xx = -3.87198 + (((tickAnim - 42) / 27) * (-6.17527-(-3.87198)));
            yy = -12.7465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-0))*-10 + (((tickAnim - 42) / 27) * (-1.1428+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-0))*-10-(-12.7465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-0))*-10)));
            zz = -6.7079+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5 + (((tickAnim - 42) / 27) * (-12.1226+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5-(-6.7079+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5)));
        }
        else if (tickAnim >= 69 && tickAnim < 100) {
            xx = -6.17527 + (((tickAnim - 69) / 31) * (-3.87198-(-6.17527)));
            yy = -1.1428+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-0))*-10 + (((tickAnim - 69) / 31) * (-12.7465+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-0))*-10-(-1.1428+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-0))*-10)));
            zz = -12.1226+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5 + (((tickAnim - 69) / 31) * (-6.7079+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5-(-12.1226+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftUpperLegL, leftUpperLegL.rotateAngleX + (float) Math.toRadians(xx), leftUpperLegL.rotateAngleY + (float) Math.toRadians(yy), leftUpperLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = -1.21332 + (((tickAnim - 0) / 18) * (0-(-1.21332)));
            yy = 17.11291 + (((tickAnim - 0) / 18) * (0-(17.11291)));
            zz = 2.9343+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5 + (((tickAnim - 0) / 18) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5-(2.9343+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5)));
        }
        else if (tickAnim >= 18 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 18) / 24) * (-1.21332-(0)));
            yy = 0 + (((tickAnim - 18) / 24) * (17.11291-(0)));
            zz = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5 + (((tickAnim - 18) / 24) * (2.9343+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5)));
        }
        else if (tickAnim >= 42 && tickAnim < 69) {
            xx = -1.21332 + (((tickAnim - 42) / 27) * (0-(-1.21332)));
            yy = 17.11291 + (((tickAnim - 42) / 27) * (0-(17.11291)));
            zz = 2.9343+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5 + (((tickAnim - 42) / 27) * (2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5-(2.9343+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5)));
        }
        else if (tickAnim >= 69 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 69) / 31) * (-1.21332-(0)));
            yy = 0 + (((tickAnim - 69) / 31) * (17.11291-(0)));
            zz = 2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5 + (((tickAnim - 69) / 31) * (2.9343+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5-(2.5+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftLowerLegL, leftLowerLegL.rotateAngleX + (float) Math.toRadians(xx), leftLowerLegL.rotateAngleY + (float) Math.toRadians(yy), leftLowerLegL.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 18) {
            xx = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 18) * (0-(0)));
            zz = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5 + (((tickAnim - 0) / 18) * (-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5)));
        }
        else if (tickAnim >= 18 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 18) / 24) * (0-(0)));
            yy = 0 + (((tickAnim - 18) / 24) * (0-(0)));
            zz = -3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5 + (((tickAnim - 18) / 24) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5-(-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5)));
        }
        else if (tickAnim >= 42 && tickAnim < 69) {
            xx = 0 + (((tickAnim - 42) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 42) / 27) * (0-(0)));
            zz = -20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5 + (((tickAnim - 42) / 27) * (-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5-(-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5)));
        }
        else if (tickAnim >= 69 && tickAnim < 100) {
            xx = 0 + (((tickAnim - 69) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 69) / 31) * (0-(0)));
            zz = -3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5 + (((tickAnim - 69) / 31) * (-20+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5-(-3.75+Math.sin((Math.PI/180)*(((double)tickAnim/20)*360/2.5-50))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(leftFootL, leftFootL.rotateAngleX + (float) Math.toRadians(xx), leftFootL.rotateAngleY + (float) Math.toRadians(yy), leftFootL.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animator.update(entity);

    }
}
