package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraDrepanosaurus;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDrepanosaurus extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended Drepanosaurus;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended Body;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended Neck;
    private final AdvancedModelRendererExtended Neck2;
    private final AdvancedModelRendererExtended Neck3;
    private final AdvancedModelRendererExtended Head;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended Jaw;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended bone;
    private final AdvancedModelRendererExtended LArm;
    private final AdvancedModelRendererExtended bone2;
    private final AdvancedModelRendererExtended LArm2;
    private final AdvancedModelRendererExtended LHand;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended LClaw;
    private final AdvancedModelRendererExtended bone3;
    private final AdvancedModelRendererExtended RArm;
    private final AdvancedModelRendererExtended RArm2;
    private final AdvancedModelRendererExtended RHand;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended RClaw;
    private final AdvancedModelRendererExtended Body2;
    private final AdvancedModelRendererExtended Tail;
    private final AdvancedModelRendererExtended Tail2;
    private final AdvancedModelRendererExtended Tail3;
    private final AdvancedModelRendererExtended Tail4;
    private final AdvancedModelRendererExtended TailClaw;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended LLeg;
    private final AdvancedModelRendererExtended LLeg3;
    private final AdvancedModelRendererExtended LFoot;
    private final AdvancedModelRendererExtended RLeg;
    private final AdvancedModelRendererExtended RLeg2;
    private final AdvancedModelRendererExtended RFoot;
    private final AdvancedModelRendererExtended grub;
    private final AdvancedModelRendererExtended grub2;
    private final AdvancedModelRendererExtended grub3;

    private ModelAnimator animator;

    public ModelDrepanosaurus() {
        this.textureWidth = 78;
        this.textureHeight = 78;

        this.Drepanosaurus = new AdvancedModelRendererExtended(this);
        this.Drepanosaurus.setRotationPoint(0.0F, 16.0F, -1.0F);
        this.setRotateAngle(Drepanosaurus, -0.0436F, 0.0F, 0.0F);
        this.Drepanosaurus.cubeList.add(new ModelBox(Drepanosaurus, 0, 0, -3.4597F, -3.0446F, -4.9576F, 7, 8, 12, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0403F, -3.0446F, 6.0424F);
        this.Drepanosaurus.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1745F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 21, 21, -1.5F, 0.0F, -11.0F, 3, 2, 11, 0.0F, false));

        this.Body = new AdvancedModelRendererExtended(this);
        this.Body.setRotationPoint(0.0403F, 0.4554F, -3.9576F);
        this.Drepanosaurus.addChild(Body);
        this.setRotateAngle(Body, 0.0436F, 0.0F, 0.0F);
        this.Body.cubeList.add(new ModelBox(Body, 39, 14, -3.0F, -3.5F, -5.0F, 6, 7, 5, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -5.5F, 0.0F);
        this.Body.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.1745F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 57, 9, -1.0F, -0.8F, -5.3F, 2, 3, 5, 0.0F, false));

        this.Neck = new AdvancedModelRendererExtended(this);
        this.Neck.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.Body.addChild(Neck);
        this.setRotateAngle(Neck, -0.0175F, 0.0F, 0.0F);
        this.Neck.cubeList.add(new ModelBox(Neck, 17, 53, -2.0F, -2.5F, -4.0F, 4, 6, 4, 0.0F, false));

        this.Neck2 = new AdvancedModelRendererExtended(this);
        this.Neck2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Neck.addChild(Neck2);
        this.setRotateAngle(Neck2, -0.0436F, 0.0F, 0.0F);
        this.Neck2.cubeList.add(new ModelBox(Neck2, 49, 57, -1.5F, -2.5F, -4.0F, 3, 5, 4, -0.01F, false));

        this.Neck3 = new AdvancedModelRendererExtended(this);
        this.Neck3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.Neck2.addChild(Neck3);
        this.setRotateAngle(Neck3, -0.0436F, 0.0F, 0.0F);
        this.Neck3.cubeList.add(new ModelBox(Neck3, 60, 35, -1.0F, -2.5F, -4.0F, 2, 5, 4, -0.02F, false));

        this.Head = new AdvancedModelRendererExtended(this);
        this.Head.setRotationPoint(0.0F, -1.0F, -4.0F);
        this.Neck3.addChild(Head);
        this.setRotateAngle(Head, 0.1309F, 0.0F, 0.0F);
        this.Head.cubeList.add(new ModelBox(Head, 13, 42, -1.0F, 0.5F, -7.0F, 2, 1, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 55, 0, -1.5F, -1.5F, -2.0F, 3, 3, 3, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 0.5F, -7.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.3395F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 7, -1.0F, 0.97F, 2.6F, 2, 1, 3, -0.01F, false));
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 50, 27, -1.0F, -0.01F, -0.01F, 2, 1, 6, -0.01F, false));

        this.Jaw = new AdvancedModelRendererExtended(this);
        this.Jaw.setRotationPoint(0.0F, 1.5F, 1.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 39, 27, -1.5F, -0.01F, -3.0F, 3, 1, 3, -0.01F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 27, 0, -1.0F, -0.01F, -7.98F, 2, 1, 5, -0.01F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.Jaw.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1676F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 52, 49, -1.0F, -1.0F, -6.0F, 2, 1, 6, -0.03F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, -0.0872F, -0.0019F);
        this.Jaw.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0436F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 37, 0, -1.0F, -1.9028F, -1.9981F, 2, 2, 2, -0.01F, false));

        this.bone = new AdvancedModelRendererExtended(this);
        this.bone.setRotationPoint(2.5F, 2.0F, -2.0F);
        this.Body.addChild(bone);


        this.LArm = new AdvancedModelRendererExtended(this);
        this.LArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(LArm);
        this.setRotateAngle(LArm, 1.428F, 0.8282F, -0.0168F);
        this.LArm.cubeList.add(new ModelBox(LArm, 0, 21, -1.0F, -1.0F, -1.5F, 3, 6, 3, -0.01F, false));

        this.bone2 = new AdvancedModelRendererExtended(this);
        this.bone2.setRotationPoint(1.5F, 2.0F, 0.0F);
        this.LArm.addChild(bone2);


        this.LArm2 = new AdvancedModelRendererExtended(this);
        this.LArm2.setRotationPoint(0.0F, 1.0F, 0.0F);
        this.bone2.addChild(LArm2);
        this.setRotateAngle(LArm2, -1.4399F, 0.0F, 0.0F);
        this.LArm2.cubeList.add(new ModelBox(LArm2, 0, 56, -2.5F, 0.3F, -2.0F, 3, 5, 4, 0.0F, false));

        this.LHand = new AdvancedModelRendererExtended(this);
        this.LHand.setRotationPoint(0.5F, 5.0F, 0.0F);
        this.LArm2.addChild(LHand);
        this.setRotateAngle(LHand, 0.0F, 0.0F, -1.5708F);


        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LHand.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -3.1416F, 0.0F, 3.1416F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 61, 23, 0.1F, 0.0F, -2.0F, 0, 2, 4, 0.0F, false));

        this.LClaw = new AdvancedModelRendererExtended(this);
        this.LClaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.LHand.addChild(LClaw);
        this.LClaw.cubeList.add(new ModelBox(LClaw, 63, 45, -0.25F, 0.05F, -1.0F, 2, 4, 1, 0.0F, false));

        this.bone3 = new AdvancedModelRendererExtended(this);
        this.bone3.setRotationPoint(-2.5F, 2.0F, -2.0F);
        this.Body.addChild(bone3);


        this.RArm = new AdvancedModelRendererExtended(this);
        this.RArm.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone3.addChild(RArm);
        this.setRotateAngle(RArm, 1.4399F, -0.7418F, 0.0F);
        this.RArm.cubeList.add(new ModelBox(RArm, 0, 21, -2.0F, -1.0F, -1.5F, 3, 6, 3, -0.01F, true));

        this.RArm2 = new AdvancedModelRendererExtended(this);
        this.RArm2.setRotationPoint(-1.5F, 3.0F, 0.0F);
        this.RArm.addChild(RArm2);
        this.setRotateAngle(RArm2, -1.4399F, 0.0F, 0.0F);
        this.RArm2.cubeList.add(new ModelBox(RArm2, 0, 56, -0.5F, 0.3F, -2.0F, 3, 5, 4, 0.0F, true));

        this.RHand = new AdvancedModelRendererExtended(this);
        this.RHand.setRotationPoint(-0.5F, 5.0F, 0.0F);
        this.RArm2.addChild(RHand);
        this.setRotateAngle(RHand, 0.0F, 0.0F, 1.5708F);


        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RHand.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -3.1416F, 0.0F, -3.1416F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 61, 23, -0.1F, 0.0F, -2.0F, 0, 2, 4, 0.0F, true));

        this.RClaw = new AdvancedModelRendererExtended(this);
        this.RClaw.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.RHand.addChild(RClaw);
        this.RClaw.cubeList.add(new ModelBox(RClaw, 63, 45, -1.75F, 0.05F, -1.0F, 2, 4, 1, 0.0F, true));

        this.Body2 = new AdvancedModelRendererExtended(this);
        this.Body2.setRotationPoint(0.0403F, 0.9554F, 6.0424F);
        this.Drepanosaurus.addChild(Body2);
        this.setRotateAngle(Body2, -0.0436F, 0.0F, 0.0F);
        this.Body2.cubeList.add(new ModelBox(Body2, 35, 35, -3.0F, -3.5F, 0.0F, 6, 7, 6, 0.0F, false));

        this.Tail = new AdvancedModelRendererExtended(this);
        this.Tail.setRotationPoint(0.0F, -0.5F, 5.0F);
        this.Body2.addChild(Tail);
        this.setRotateAngle(Tail, 0.2618F, 0.0F, 0.0F);
        this.Tail.cubeList.add(new ModelBox(Tail, 39, 0, -2.0F, -3.0F, 0.0F, 4, 6, 7, -0.01F, false));

        this.Tail2 = new AdvancedModelRendererExtended(this);
        this.Tail2.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Tail.addChild(Tail2);
        this.setRotateAngle(Tail2, -0.0436F, 0.0F, 0.0F);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 0, 21, -1.5F, -3.0F, 0.0F, 3, 6, 14, -0.02F, false));

        this.Tail3 = new AdvancedModelRendererExtended(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 13.0F);
        this.Tail2.addChild(Tail3);
        this.setRotateAngle(Tail3, -0.0436F, 0.0F, 0.0F);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 42, -1.0F, -2.5F, 0.0F, 2, 5, 8, -0.01F, false));

        this.Tail4 = new AdvancedModelRendererExtended(this);
        this.Tail4.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.Tail3.addChild(Tail4);
        this.setRotateAngle(Tail4, -0.1309F, 0.0F, 0.0F);
        this.Tail4.cubeList.add(new ModelBox(Tail4, 21, 42, -1.0F, -1.5F, 0.0F, 2, 3, 7, -0.02F, false));

        this.TailClaw = new AdvancedModelRendererExtended(this);
        this.TailClaw.setRotationPoint(0.0F, -1.5F, 6.98F);
        this.Tail4.addChild(TailClaw);
        this.setRotateAngle(TailClaw, -0.9163F, 0.0F, 0.0F);
        this.TailClaw.cubeList.add(new ModelBox(TailClaw, 21, 21, -0.5F, 0.0F, 0.0F, 1, 2, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 4.0F);
        this.TailClaw.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.5672F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 42, 0.0F, 0.5F, 0.5F, 0, 3, 3, 0.0F, false));

        this.LLeg = new AdvancedModelRendererExtended(this);
        this.LLeg.setRotationPoint(2.0F, 1.0F, 2.5F);
        this.Body2.addChild(LLeg);
        this.setRotateAngle(LLeg, -1.1476F, -0.9976F, -0.136F);
        this.LLeg.cubeList.add(new ModelBox(LLeg, 34, 55, -1.0F, -1.0F, -2.0F, 3, 5, 4, 0.0F, false));

        this.LLeg3 = new AdvancedModelRendererExtended(this);
        this.LLeg3.setRotationPoint(0.5F, 3.0F, 0.0F);
        this.LLeg.addChild(LLeg3);
        this.setRotateAngle(LLeg3, 1.309F, 0.0F, 0.0F);
        this.LLeg3.cubeList.add(new ModelBox(LLeg3, 0, 0, -1.0F, -0.4F, -1.5F, 2, 5, 3, 0.0F, false));

        this.LFoot = new AdvancedModelRendererExtended(this);
        this.LFoot.setRotationPoint(0.0F, 5.0F, -1.5F);
        this.LLeg3.addChild(LFoot);
        this.LFoot.cubeList.add(new ModelBox(LFoot, 35, 49, -4.0F, -0.5F, -4.5F, 6, 0, 5, 0.0F, false));

        this.RLeg = new AdvancedModelRendererExtended(this);
        this.RLeg.setRotationPoint(-2.0F, 1.0F, 2.5F);
        this.Body2.addChild(RLeg);
        this.setRotateAngle(RLeg, -1.1476F, 0.9976F, 0.136F);
        this.RLeg.cubeList.add(new ModelBox(RLeg, 34, 55, -2.0F, -1.0F, -2.0F, 3, 5, 4, 0.0F, true));

        this.RLeg2 = new AdvancedModelRendererExtended(this);
        this.RLeg2.setRotationPoint(-0.5F, 3.0F, 0.0F);
        this.RLeg.addChild(RLeg2);
        this.setRotateAngle(RLeg2, 1.309F, 0.0F, 0.0F);
        this.RLeg2.cubeList.add(new ModelBox(RLeg2, 0, 0, -1.0F, -0.4F, -1.5F, 2, 5, 3, 0.0F, true));

        this.RFoot = new AdvancedModelRendererExtended(this);
        this.RFoot.setRotationPoint(0.0F, 5.0F, -1.5F);
        this.RLeg2.addChild(RFoot);
        this.RFoot.cubeList.add(new ModelBox(RFoot, 35, 49, -2.0F, -0.5F, -4.5F, 6, 0, 5, 0.0F, true));

        this.grub = new AdvancedModelRendererExtended(this);
        this.grub.setRotationPoint(0.5F, -1.0F, -5.75F);
        this.Drepanosaurus.addChild(grub);
        this.setRotateAngle(grub, 0.0436F, 0.0F, 0.0F);
        this.grub.cubeList.add(new ModelBox(grub, 17, 70, -0.5F, -0.5F, 0.0F, 1, 1, 2, 0.0F, false));

        this.grub2 = new AdvancedModelRendererExtended(this);
        this.grub2.setRotationPoint(0.0F, 0.0F, 1.5F);
        this.grub.addChild(grub2);
        this.grub2.cubeList.add(new ModelBox(grub2, 17, 70, -0.5F, -0.5F, 0.0F, 1, 1, 2, -0.001F, false));

        this.grub3 = new AdvancedModelRendererExtended(this);
        this.grub3.setRotationPoint(0.0F, -0.25F, 0.25F);
        this.grub.addChild(grub3);
        this.grub3.cubeList.add(new ModelBox(grub3, 18, 73, -0.5F, -0.25F, -0.75F, 1, 1, 1, -0.001F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Drepanosaurus.render(f5);
    }
    public void renderStaticWall(float f) {

        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {

        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Drepanosaurus.offsetY = -1.7F;
        this.Drepanosaurus.offsetX = 1.0F;
        this.Drepanosaurus.rotateAngleY = (float)Math.toRadians(230);
        this.Drepanosaurus.rotateAngleX = (float)Math.toRadians(8);
        this.Drepanosaurus.rotateAngleZ = (float)Math.toRadians(-8);
        this.Drepanosaurus.scaleChildren = true;
        float scaler = 2.4F;
        this.Drepanosaurus.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.Drepanosaurus.render(f);
        //Reset rotations, positions and sizing:
        this.Drepanosaurus.setScale(1.0F, 1.0F, 1.0F);
        this.Drepanosaurus.scaleChildren = false;
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
        //this.resetToDefaultPose();
        //this.root.offsetY = 1.28F;

        EntityPrehistoricFloraDrepanosaurus Drepanosaurus = (EntityPrehistoricFloraDrepanosaurus) e;
        float masterSpeed = Drepanosaurus.getTravelSpeed();

        this.faceTarget(f3, f4, 8, Neck);
        this.faceTarget(f3, f4, 8, Neck2);
        this.faceTarget(f3, f4, 8, Neck3);
        this.faceTarget(f3, f4, 8, Head);

        AdvancedModelRendererExtended[] Tail = {this.Tail, this.Tail2, this.Tail3, this.Tail4};

        if (Drepanosaurus.getAnimation() == Drepanosaurus.MAKE_NEST_ANIMATION) {
            //this.swing(Neck, 0.5F, 0.10F, false, 0.5F,-0.05F, f2, 0.8F);
            //this.walk(Neck, 0.5F * 2, -0.02F, false, 0.5F,0.01F, f2, 0.8F);
            return;
        }


        if (Drepanosaurus.getIsClimbing()) {
            //Pose for climbing:
            //this.root.offsetY = 1.40F;
        }

    }

    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraDrepanosaurus ee = (EntityPrehistoricFloraDrepanosaurus) entitylivingbaseIn;


        if(ee.getIsMoving()) {
            if (ee.getIsFast()) {
                if (ee.getIsClimbing()) {
                    if(!ee.getHeadCollided()) {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                    } else {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    }
                } else {
                    animRun(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            } else {
                if (ee.getIsClimbing()) {
                    if(!ee.getHeadCollided()) {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, false);
                    } else {
                        animClimb(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, true);
                    }
                } else {
                    animWalk(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            }
        }

        if (ee.getAnimation() == ee.EAT_ANIMATION) {
            animEat(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }
        else if (ee.getAnimation() == ee.LAY_ANIMATION) {
            animLay(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        } else if (ee.getAnimation() == ee.STAND_ANIMATION) {
            animIdle(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime, ee.getAnimationTick());
        }


    }

    public void animLay(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDrepanosaurus entity = (EntityPrehistoricFloraDrepanosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -2.75 + (((tickAnim - 15) / 20) * (-2.75-(-2.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -2.75 + (((tickAnim - 35) / 15) * (0-(-2.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Drepanosaurus, Drepanosaurus.rotateAngleX + (float) Math.toRadians(xx), Drepanosaurus.rotateAngleY + (float) Math.toRadians(yy), Drepanosaurus.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 2.5 + (((tickAnim - 15) / 20) * (2.5-(2.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2.5 + (((tickAnim - 35) / 15) * (0-(2.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.25 + (((tickAnim - 15) / 20) * (5.25-(5.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.25 + (((tickAnim - 35) / 15) * (0-(5.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (2.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 2.75 + (((tickAnim - 15) / 20) * (2.75-(2.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 2.75 + (((tickAnim - 35) / 15) * (0-(2.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0), Head.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (8.75-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.5 + (((tickAnim - 15) / 20) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 8.75 + (((tickAnim - 15) / 20) * (8.75-(8.75)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.5 + (((tickAnim - 35) / 15) * (0-(5.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 8.75 + (((tickAnim - 35) / 15) * (0-(8.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LArm, LArm.rotateAngleX + (float) Math.toRadians(xx), LArm.rotateAngleY + (float) Math.toRadians(yy), LArm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(LArm2, LArm2.rotateAngleX + (float) Math.toRadians(0), LArm2.rotateAngleY + (float) Math.toRadians(0), LArm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-8.75-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 5.5 + (((tickAnim - 15) / 20) * (5.5-(5.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = -8.75 + (((tickAnim - 15) / 20) * (-8.75-(-8.75)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 5.5 + (((tickAnim - 35) / 15) * (0-(5.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = -8.75 + (((tickAnim - 35) / 15) * (0-(-8.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RArm, RArm.rotateAngleX + (float) Math.toRadians(xx), RArm.rotateAngleY + (float) Math.toRadians(yy), RArm.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(RArm2, RArm2.rotateAngleX + (float) Math.toRadians(0), RArm2.rotateAngleY + (float) Math.toRadians(0), RArm2.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-11.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -11.75 + (((tickAnim - 15) / 20) * (-11.75-(-11.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -11.75 + (((tickAnim - 35) / 15) * (0-(-11.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(xx), Body2.rotateAngleY + (float) Math.toRadians(yy), Body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 4 + (((tickAnim - 15) / 20) * (4-(4)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 4 + (((tickAnim - 35) / 15) * (0-(4)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 9.75 + (((tickAnim - 15) / 20) * (9.75-(9.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 9.75 + (((tickAnim - 35) / 15) * (0-(9.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9.25-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 9.25 + (((tickAnim - 15) / 20) * (9.25-(9.25)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 9.25 + (((tickAnim - 35) / 15) * (0-(9.25)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-13.75-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -13.75 + (((tickAnim - 15) / 20) * (-13.75-(-13.75)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -13.75 + (((tickAnim - 35) / 15) * (0-(-13.75)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (-3-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = -3 + (((tickAnim - 15) / 20) * (-3-(-3)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = -3 + (((tickAnim - 35) / 15) * (0-(-3)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(TailClaw, TailClaw.rotateAngleX + (float) Math.toRadians(xx), TailClaw.rotateAngleY + (float) Math.toRadians(yy), TailClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9.87734-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (5.7032-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (-19.188-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 9.87734 + (((tickAnim - 15) / 20) * (9.87734-(9.87734)));
            yy = 5.7032 + (((tickAnim - 15) / 20) * (5.7032-(5.7032)));
            zz = -19.188 + (((tickAnim - 15) / 20) * (-19.188-(-19.188)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 9.87734 + (((tickAnim - 35) / 15) * (0-(9.87734)));
            yy = 5.7032 + (((tickAnim - 35) / 15) * (0-(5.7032)));
            zz = -19.188 + (((tickAnim - 35) / 15) * (0-(-19.188)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LLeg, LLeg.rotateAngleX + (float) Math.toRadians(xx), LLeg.rotateAngleY + (float) Math.toRadians(yy), LLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 13.5 + (((tickAnim - 15) / 20) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 35) / 15) * (0-(13.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LLeg3, LLeg3.rotateAngleX + (float) Math.toRadians(xx), LLeg3.rotateAngleY + (float) Math.toRadians(yy), LLeg3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (9.87734-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (-5.70317-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (19.18802-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 9.87734 + (((tickAnim - 15) / 20) * (9.87734-(9.87734)));
            yy = -5.70317 + (((tickAnim - 15) / 20) * (-5.70317-(-5.70317)));
            zz = 19.18802 + (((tickAnim - 15) / 20) * (19.18802-(19.18802)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 9.87734 + (((tickAnim - 35) / 15) * (0-(9.87734)));
            yy = -5.70317 + (((tickAnim - 35) / 15) * (0-(-5.70317)));
            zz = 19.18802 + (((tickAnim - 35) / 15) * (0-(19.18802)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RLeg, RLeg.rotateAngleX + (float) Math.toRadians(xx), RLeg.rotateAngleY + (float) Math.toRadians(yy), RLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 0) / 15) * (13.5-(0)));
            yy = 0 + (((tickAnim - 0) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 15) * (0-(0)));
        }
        else if (tickAnim >= 15 && tickAnim < 35) {
            xx = 13.5 + (((tickAnim - 15) / 20) * (13.5-(13.5)));
            yy = 0 + (((tickAnim - 15) / 20) * (0-(0)));
            zz = 0 + (((tickAnim - 15) / 20) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 50) {
            xx = 13.5 + (((tickAnim - 35) / 15) * (0-(13.5)));
            yy = 0 + (((tickAnim - 35) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 15) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RLeg2, RLeg2.rotateAngleX + (float) Math.toRadians(xx), RLeg2.rotateAngleY + (float) Math.toRadians(yy), RLeg2.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animEat(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDrepanosaurus entity = (EntityPrehistoricFloraDrepanosaurus) entitylivingbaseIn;
        int animCycle = 15;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (3.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 3.5 + (((tickAnim - 6) / 4) * (-8.25-(3.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -8.25 + (((tickAnim - 10) / 5) * (0-(-8.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (4-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 4 + (((tickAnim - 6) / 4) * (-2.5-(4)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -2.5 + (((tickAnim - 10) / 5) * (0-(-2.5)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-1.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -1.5 + (((tickAnim - 6) / 4) * (5.75-(-1.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = 5.75 + (((tickAnim - 10) / 5) * (0-(5.75)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (-6.5-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = -6.5 + (((tickAnim - 6) / 4) * (-0.25-(-6.5)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 15) {
            xx = -0.25 + (((tickAnim - 10) / 5) * (0-(-0.25)));
            yy = 0 + (((tickAnim - 10) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 6) * (0-(0)));
        }
        else if (tickAnim >= 6 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 6) / 4) * (22.5-(0)));
            yy = 0 + (((tickAnim - 6) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 6) / 4) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 12) {
            xx = 22.5 + (((tickAnim - 10) / 2) * (0-(22.5)));
            yy = 0 + (((tickAnim - 10) / 2) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 2) * (0-(0)));
        }
        else if (tickAnim >= 12 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 12) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 12) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animIdle(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, double animTick) {
        EntityPrehistoricFloraDrepanosaurus entity = (EntityPrehistoricFloraDrepanosaurus) entitylivingbaseIn;
        int animCycle = 265;
        double tickAnim = animTick + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
         if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-4.75-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 47) {
            xx = -4.75 + (((tickAnim - 25) / 22) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 25) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 22) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 255) {
            xx = -4.75 + (((tickAnim - 47) / 208) * (-4.75-(-4.75)));
            yy = 0 + (((tickAnim - 47) / 208) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 208) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = -4.75 + (((tickAnim - 255) / 10) * (0-(-4.75)));
            yy = 0 + (((tickAnim - 255) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Drepanosaurus, Drepanosaurus.rotateAngleX + (float) Math.toRadians(xx), Drepanosaurus.rotateAngleY + (float) Math.toRadians(yy), Drepanosaurus.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (3.99258-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.31119-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-2.73235-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 47) {
            xx = 3.99258 + (((tickAnim - 25) / 22) * (3.99258-(3.99258)));
            yy = 0.31119 + (((tickAnim - 25) / 22) * (0.31119-(0.31119)));
            zz = -2.73235 + (((tickAnim - 25) / 22) * (-2.73235-(-2.73235)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 3.99258 + (((tickAnim - 47) / 13) * (3.93728-(3.99258)));
            yy = 0.31119 + (((tickAnim - 47) / 13) * (0.90272-(0.31119)));
            zz = -2.73235 + (((tickAnim - 47) / 13) * (-7.94923-(-2.73235)));
        }
        else if (tickAnim >= 60 && tickAnim < 255) {
            xx = 3.93728 + (((tickAnim - 60) / 195) * (3.93728-(3.93728)));
            yy = 0.90272 + (((tickAnim - 60) / 195) * (0.90272-(0.90272)));
            zz = -7.94923 + (((tickAnim - 60) / 195) * (-7.94923-(-7.94923)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 3.93728 + (((tickAnim - 255) / 10) * (0-(3.93728)));
            yy = 0.90272 + (((tickAnim - 255) / 10) * (0-(0.90272)));
            zz = -7.94923 + (((tickAnim - 255) / 10) * (0-(-7.94923)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(xx), Body.rotateAngleY + (float) Math.toRadians(yy), Body.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-0.6081+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (4.47924-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.43219-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -0.6081+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1 + (((tickAnim - 25) / 15) * (7.0169-(-0.6081+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-1)));
            yy = 4.47924 + (((tickAnim - 25) / 15) * (4.47924-(4.47924)));
            zz = 0.43219 + (((tickAnim - 25) / 15) * (0.43219-(0.43219)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 7.0169 + (((tickAnim - 40) / 7) * (9.6919+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5-(7.0169)));
            yy = 4.47924 + (((tickAnim - 40) / 7) * (4.47924-(4.47924)));
            zz = 0.43219 + (((tickAnim - 40) / 7) * (0.43219-(0.43219)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 9.6919+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5 + (((tickAnim - 47) / 13) * (-1.4831-(9.6919+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90))*5)));
            yy = 4.47924 + (((tickAnim - 47) / 13) * (4.47924-(4.47924)));
            zz = 0.43219 + (((tickAnim - 47) / 13) * (0.43219-(0.43219)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = -1.4831 + (((tickAnim - 60) / 25) * (-2.2331-(-1.4831)));
            yy = 4.47924 + (((tickAnim - 60) / 25) * (4.47924-(4.47924)));
            zz = 0.43219 + (((tickAnim - 60) / 25) * (0.43219-(0.43219)));
        }
        else if (tickAnim >= 85 && tickAnim < 125) {
            xx = -2.2331 + (((tickAnim - 85) / 40) * (-2.2331-(-2.2331)));
            yy = 4.47924 + (((tickAnim - 85) / 40) * (4.47924-(4.47924)));
            zz = 0.43219 + (((tickAnim - 85) / 40) * (0.43219-(0.43219)));
        }
        else if (tickAnim >= 125 && tickAnim < 151) {
            xx = -2.2331 + (((tickAnim - 125) / 26) * (5.2669-(-2.2331)));
            yy = 4.47924 + (((tickAnim - 125) / 26) * (4.47924-(4.47924)));
            zz = 0.43219 + (((tickAnim - 125) / 26) * (0.43219-(0.43219)));
        }
        else if (tickAnim >= 151 && tickAnim < 162) {
            xx = 5.2669 + (((tickAnim - 151) / 11) * (13.0169-(5.2669)));
            yy = 4.47924 + (((tickAnim - 151) / 11) * (4.47924-(4.47924)));
            zz = 0.43219 + (((tickAnim - 151) / 11) * (0.43219-(0.43219)));
        }
        else if (tickAnim >= 162 && tickAnim < 180) {
            xx = 13.0169 + (((tickAnim - 162) / 18) * (-9.75-(13.0169)));
            yy = 4.47924 + (((tickAnim - 162) / 18) * (0-(4.47924)));
            zz = 0.43219 + (((tickAnim - 162) / 18) * (0-(0.43219)));
        }
        else if (tickAnim >= 180 && tickAnim < 190) {
            xx = -9.75 + (((tickAnim - 180) / 10) * (-10.2877-(-9.75)));
            yy = 0 + (((tickAnim - 180) / 10) * (-0.03198-(0)));
            zz = 0 + (((tickAnim - 180) / 10) * (2.33504-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 200) {
            xx = -10.2877 + (((tickAnim - 190) / 10) * (2.02046-(-10.2877)));
            yy = -0.03198 + (((tickAnim - 190) / 10) * (0.49595-(-0.03198)));
            zz = 2.33504 + (((tickAnim - 190) / 10) * (4.7241-(2.33504)));
        }
        else if (tickAnim >= 200 && tickAnim < 215) {
            xx = 2.02046 + (((tickAnim - 200) / 15) * (-10.72954-(2.02046)));
            yy = 0.49595 + (((tickAnim - 200) / 15) * (0.49595-(0.49595)));
            zz = 4.7241 + (((tickAnim - 200) / 15) * (4.7241-(4.7241)));
        }
        else if (tickAnim >= 215 && tickAnim < 231) {
            xx = -10.72954 + (((tickAnim - 215) / 16) * (-8.72954-(-10.72954)));
            yy = 0.49595 + (((tickAnim - 215) / 16) * (0.49595-(0.49595)));
            zz = 4.7241 + (((tickAnim - 215) / 16) * (4.7241-(4.7241)));
        }
        else if (tickAnim >= 231 && tickAnim < 236) {
            xx = -8.72954 + (((tickAnim - 231) / 5) * (-3.98146-(-8.72954)));
            yy = 0.49595 + (((tickAnim - 231) / 5) * (1.23516-(0.49595)));
            zz = 4.7241 + (((tickAnim - 231) / 5) * (4.59732-(4.7241)));
        }
        else if (tickAnim >= 236 && tickAnim < 240) {
            xx = -3.98146 + (((tickAnim - 236) / 4) * (-5.48146-(-3.98146)));
            yy = 1.23516 + (((tickAnim - 236) / 4) * (1.23516-(1.23516)));
            zz = 4.59732 + (((tickAnim - 236) / 4) * (4.59732-(4.59732)));
        }
        else if (tickAnim >= 240 && tickAnim < 243) {
            xx = -5.48146 + (((tickAnim - 240) / 3) * (-5.48146-(-5.48146)));
            yy = 1.23516 + (((tickAnim - 240) / 3) * (1.23516-(1.23516)));
            zz = 4.59732 + (((tickAnim - 240) / 3) * (4.59732-(4.59732)));
        }
        else if (tickAnim >= 243 && tickAnim < 248) {
            xx = -5.48146 + (((tickAnim - 243) / 5) * (-3.98146-(-5.48146)));
            yy = 1.23516 + (((tickAnim - 243) / 5) * (1.23516-(1.23516)));
            zz = 4.59732 + (((tickAnim - 243) / 5) * (4.59732-(4.59732)));
        }
        else if (tickAnim >= 248 && tickAnim < 251) {
            xx = -3.98146 + (((tickAnim - 248) / 3) * (-5.48146-(-3.98146)));
            yy = 1.23516 + (((tickAnim - 248) / 3) * (1.23516-(1.23516)));
            zz = 4.59732 + (((tickAnim - 248) / 3) * (4.59732-(4.59732)));
        }
        else if (tickAnim >= 251 && tickAnim < 265) {
            xx = -5.48146 + (((tickAnim - 251) / 14) * (0-(-5.48146)));
            yy = 1.23516 + (((tickAnim - 251) / 14) * (0-(1.23516)));
            zz = 4.59732 + (((tickAnim - 251) / 14) * (0-(4.59732)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(xx), Neck.rotateAngleY + (float) Math.toRadians(yy), Neck.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-6.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (6-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = -6.25 + (((tickAnim - 25) / 15) * (3.5-(-6.25)));
            yy = 6 + (((tickAnim - 25) / 15) * (6-(6)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 3.5 + (((tickAnim - 40) / 7) * (3.5-(3.5)));
            yy = 6 + (((tickAnim - 40) / 7) * (6-(6)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 3.5 + (((tickAnim - 47) / 13) * (-10-(3.5)));
            yy = 6 + (((tickAnim - 47) / 13) * (6-(6)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = -10 + (((tickAnim - 60) / 25) * (-7.5-(-10)));
            yy = 6 + (((tickAnim - 60) / 25) * (6-(6)));
            zz = 0 + (((tickAnim - 60) / 25) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 125) {
            xx = -7.5 + (((tickAnim - 85) / 40) * (-7.5-(-7.5)));
            yy = 6 + (((tickAnim - 85) / 40) * (6-(6)));
            zz = 0 + (((tickAnim - 85) / 40) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 151) {
            xx = -7.5 + (((tickAnim - 125) / 26) * (20-(-7.5)));
            yy = 6 + (((tickAnim - 125) / 26) * (6-(6)));
            zz = 0 + (((tickAnim - 125) / 26) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 162) {
            xx = 20 + (((tickAnim - 151) / 11) * (16.75-(20)));
            yy = 6 + (((tickAnim - 151) / 11) * (6-(6)));
            zz = 0 + (((tickAnim - 151) / 11) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 180) {
            xx = 16.75 + (((tickAnim - 162) / 18) * (-5.25-(16.75)));
            yy = 6 + (((tickAnim - 162) / 18) * (6-(6)));
            zz = 0 + (((tickAnim - 162) / 18) * (0-(0)));
        }
        else if (tickAnim >= 180 && tickAnim < 190) {
            xx = -5.25 + (((tickAnim - 180) / 10) * (0.25-(-5.25)));
            yy = 6 + (((tickAnim - 180) / 10) * (6-(6)));
            zz = 0 + (((tickAnim - 180) / 10) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 200) {
            xx = 0.25 + (((tickAnim - 190) / 10) * (9.67923-(0.25)));
            yy = 6 + (((tickAnim - 190) / 10) * (5.784-(6)));
            zz = 0 + (((tickAnim - 190) / 10) * (1.74584-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 215) {
            xx = 9.67923 + (((tickAnim - 200) / 15) * (-5.07077-(9.67923)));
            yy = 5.784 + (((tickAnim - 200) / 15) * (5.784-(5.784)));
            zz = 1.74584 + (((tickAnim - 200) / 15) * (1.74584-(1.74584)));
        }
        else if (tickAnim >= 215 && tickAnim < 231) {
            xx = -5.07077 + (((tickAnim - 215) / 16) * (-7.32077-(-5.07077)));
            yy = 5.784 + (((tickAnim - 215) / 16) * (5.784-(5.784)));
            zz = 1.74584 + (((tickAnim - 215) / 16) * (1.74584-(1.74584)));
        }
        else if (tickAnim >= 231 && tickAnim < 236) {
            xx = -7.32077 + (((tickAnim - 231) / 5) * (-9.29217-(-7.32077)));
            yy = 5.784 + (((tickAnim - 231) / 5) * (3.81321-(5.784)));
            zz = 1.74584 + (((tickAnim - 231) / 5) * (2.08767-(1.74584)));
        }
        else if (tickAnim >= 236 && tickAnim < 240) {
            xx = -9.29217 + (((tickAnim - 236) / 4) * (-11.29217-(-9.29217)));
            yy = 3.81321 + (((tickAnim - 236) / 4) * (3.81321-(3.81321)));
            zz = 2.08767 + (((tickAnim - 236) / 4) * (2.08767-(2.08767)));
        }
        else if (tickAnim >= 240 && tickAnim < 243) {
            xx = -11.29217 + (((tickAnim - 240) / 3) * (-11.29217-(-11.29217)));
            yy = 3.81321 + (((tickAnim - 240) / 3) * (3.81321-(3.81321)));
            zz = 2.08767 + (((tickAnim - 240) / 3) * (2.08767-(2.08767)));
        }
        else if (tickAnim >= 243 && tickAnim < 248) {
            xx = -11.29217 + (((tickAnim - 243) / 5) * (-9.29217-(-11.29217)));
            yy = 3.81321 + (((tickAnim - 243) / 5) * (3.81321-(3.81321)));
            zz = 2.08767 + (((tickAnim - 243) / 5) * (2.08767-(2.08767)));
        }
        else if (tickAnim >= 248 && tickAnim < 251) {
            xx = -9.29217 + (((tickAnim - 248) / 3) * (-11.29217-(-9.29217)));
            yy = 3.81321 + (((tickAnim - 248) / 3) * (3.81321-(3.81321)));
            zz = 2.08767 + (((tickAnim - 248) / 3) * (2.08767-(2.08767)));
        }
        else if (tickAnim >= 251 && tickAnim < 265) {
            xx = -11.29217 + (((tickAnim - 251) / 14) * (0-(-11.29217)));
            yy = 3.81321 + (((tickAnim - 251) / 14) * (0-(3.81321)));
            zz = 2.08767 + (((tickAnim - 251) / 14) * (0-(2.08767)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(xx), Neck2.rotateAngleY + (float) Math.toRadians(yy), Neck2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (28.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-9.25-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 40) {
            xx = 28.5 + (((tickAnim - 25) / 15) * (23.25-(28.5)));
            yy = -9.25 + (((tickAnim - 25) / 15) * (-9.25-(-9.25)));
            zz = 0 + (((tickAnim - 25) / 15) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 47) {
            xx = 23.25 + (((tickAnim - 40) / 7) * (23.25-(23.25)));
            yy = -9.25 + (((tickAnim - 40) / 7) * (-9.25-(-9.25)));
            zz = 0 + (((tickAnim - 40) / 7) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 85) {
            xx = 23.25 + (((tickAnim - 47) / 38) * (29.5-(23.25)));
            yy = -9.25 + (((tickAnim - 47) / 38) * (-9.25-(-9.25)));
            zz = 0 + (((tickAnim - 47) / 38) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 125) {
            xx = 29.5 + (((tickAnim - 85) / 40) * (29.5-(29.5)));
            yy = -9.25 + (((tickAnim - 85) / 40) * (-9.25-(-9.25)));
            zz = 0 + (((tickAnim - 85) / 40) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 143) {
            xx = 29.5 + (((tickAnim - 125) / 18) * (16.36858-(29.5)));
            yy = -9.25 + (((tickAnim - 125) / 18) * (-9.25-(-9.25)));
            zz = 0 + (((tickAnim - 125) / 18) * (0-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 151) {
            xx = 16.36858 + (((tickAnim - 143) / 8) * (16.75-(16.36858)));
            yy = -9.25 + (((tickAnim - 143) / 8) * (-9.25-(-9.25)));
            zz = 0 + (((tickAnim - 143) / 8) * (0-(0)));
        }
        else if (tickAnim >= 151 && tickAnim < 162) {
            xx = 16.75 + (((tickAnim - 151) / 11) * (22.75-(16.75)));
            yy = -9.25 + (((tickAnim - 151) / 11) * (-9.25-(-9.25)));
            zz = 0 + (((tickAnim - 151) / 11) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 182) {
            xx = 22.75 + (((tickAnim - 162) / 20) * (29.75-(22.75)));
            yy = -9.25 + (((tickAnim - 162) / 20) * (-9.25-(-9.25)));
            zz = 0 + (((tickAnim - 162) / 20) * (0-(0)));
        }
        else if (tickAnim >= 182 && tickAnim < 190) {
            xx = 29.75 + (((tickAnim - 182) / 8) * (24.75-(29.75)));
            yy = -9.25 + (((tickAnim - 182) / 8) * (-9.25-(-9.25)));
            zz = 0 + (((tickAnim - 182) / 8) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 200) {
            xx = 24.75 + (((tickAnim - 190) / 10) * (34.75-(24.75)));
            yy = -9.25 + (((tickAnim - 190) / 10) * (-9.25-(-9.25)));
            zz = 0 + (((tickAnim - 190) / 10) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 215) {
            xx = 34.75 + (((tickAnim - 200) / 15) * (-1.75-(34.75)));
            yy = -9.25 + (((tickAnim - 200) / 15) * (-9.25-(-9.25)));
            zz = 0 + (((tickAnim - 200) / 15) * (0-(0)));
        }
        else if (tickAnim >= 215 && tickAnim < 231) {
            xx = -1.75 + (((tickAnim - 215) / 16) * (1.33624-(-1.75)));
            yy = -9.25 + (((tickAnim - 215) / 16) * (-9.25-(-9.25)));
            zz = 0 + (((tickAnim - 215) / 16) * (0-(0)));
        }
        else if (tickAnim >= 231 && tickAnim < 236) {
            xx = 1.33624 + (((tickAnim - 231) / 5) * (-3.75-(1.33624)));
            yy = -9.25 + (((tickAnim - 231) / 5) * (-9.25-(-9.25)));
            zz = 0 + (((tickAnim - 231) / 5) * (0-(0)));
        }
        else if (tickAnim >= 236 && tickAnim < 240) {
            xx = -3.75 + (((tickAnim - 236) / 4) * (0.5-(-3.75)));
            yy = -9.25 + (((tickAnim - 236) / 4) * (-9.25-(-9.25)));
            zz = 0 + (((tickAnim - 236) / 4) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 243) {
            xx = 0.5 + (((tickAnim - 240) / 3) * (0.5-(0.5)));
            yy = -9.25 + (((tickAnim - 240) / 3) * (-9.25-(-9.25)));
            zz = 0 + (((tickAnim - 240) / 3) * (0-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 248) {
            xx = 0.5 + (((tickAnim - 243) / 5) * (-3.75-(0.5)));
            yy = -9.25 + (((tickAnim - 243) / 5) * (-9.25-(-9.25)));
            zz = 0 + (((tickAnim - 243) / 5) * (0-(0)));
        }
        else if (tickAnim >= 248 && tickAnim < 251) {
            xx = -3.75 + (((tickAnim - 248) / 3) * (0.5-(-3.75)));
            yy = -9.25 + (((tickAnim - 248) / 3) * (-9.25-(-9.25)));
            zz = 0 + (((tickAnim - 248) / 3) * (0-(0)));
        }
        else if (tickAnim >= 251 && tickAnim < 265) {
            xx = 0.5 + (((tickAnim - 251) / 14) * (0-(0.5)));
            yy = -9.25 + (((tickAnim - 251) / 14) * (0-(-9.25)));
            zz = 0 + (((tickAnim - 251) / 14) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(xx), Neck3.rotateAngleY + (float) Math.toRadians(yy), Neck3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-14.25-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 25) / 8) * (12.25-(0)));
            yy = -14.25 + (((tickAnim - 25) / 8) * (-15.14063-(-14.25)));
            zz = 0 + (((tickAnim - 25) / 8) * (0-(0)));
        }
        else if (tickAnim >= 33 && tickAnim < 40) {
            xx = 12.25 + (((tickAnim - 33) / 7) * (1.25-(12.25)));
            yy = -15.14063 + (((tickAnim - 33) / 7) * (-14.25-(-15.14063)));
            zz = 0 + (((tickAnim - 33) / 7) * (0-(0)));
        }
        else if (tickAnim >= 40 && tickAnim < 42) {
            xx = 1.25 + (((tickAnim - 40) / 2) * (2.5-(1.25)));
            yy = -14.25 + (((tickAnim - 40) / 2) * (-14.25-(-14.25)));
            zz = 0 + (((tickAnim - 40) / 2) * (0-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 43) {
            xx = 2.5 + (((tickAnim - 42) / 1) * (1.25-(2.5)));
            yy = -14.25 + (((tickAnim - 42) / 1) * (-14.25-(-14.25)));
            zz = 0 + (((tickAnim - 42) / 1) * (0-(0)));
        }
        else if (tickAnim >= 43 && tickAnim < 45) {
            xx = 1.25 + (((tickAnim - 43) / 2) * (2.5-(1.25)));
            yy = -14.25 + (((tickAnim - 43) / 2) * (-14.25-(-14.25)));
            zz = 0 + (((tickAnim - 43) / 2) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 47) {
            xx = 2.5 + (((tickAnim - 45) / 2) * (1.25-(2.5)));
            yy = -14.25 + (((tickAnim - 45) / 2) * (-14.25-(-14.25)));
            zz = 0 + (((tickAnim - 45) / 2) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 1.25 + (((tickAnim - 47) / 13) * (26-(1.25)));
            yy = -14.25 + (((tickAnim - 47) / 13) * (-14.25-(-14.25)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 85) {
            xx = 26 + (((tickAnim - 60) / 25) * (43.75-(26)));
            yy = -14.25 + (((tickAnim - 60) / 25) * (-14.25-(-14.25)));
            zz = 0 + (((tickAnim - 60) / 25) * (0-(0)));
        }
        else if (tickAnim >= 85 && tickAnim < 125) {
            xx = 43.75 + (((tickAnim - 85) / 40) * (43.75-(43.75)));
            yy = -14.25 + (((tickAnim - 85) / 40) * (-14.25-(-14.25)));
            zz = 0 + (((tickAnim - 85) / 40) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 143) {
            xx = 43.75 + (((tickAnim - 125) / 18) * (45.55484-(43.75)));
            yy = -14.25 + (((tickAnim - 125) / 18) * (-12.01392-(-14.25)));
            zz = 0 + (((tickAnim - 125) / 18) * (3.09148-(0)));
        }
        else if (tickAnim >= 143 && tickAnim < 146) {
            xx = 45.55484 + (((tickAnim - 143) / 3) * (38.85947-(45.55484)));
            yy = -12.01392 + (((tickAnim - 143) / 3) * (-17.67852-(-12.01392)));
            zz = 3.09148 + (((tickAnim - 143) / 3) * (11.82862-(3.09148)));
        }
        else if (tickAnim >= 146 && tickAnim < 150) {
            xx = 38.85947 + (((tickAnim - 146) / 4) * (36.76394-(38.85947)));
            yy = -17.67852 + (((tickAnim - 146) / 4) * (-0.18822-(-17.67852)));
            zz = 11.82862 + (((tickAnim - 146) / 4) * (-9.83674-(11.82862)));
        }
        else if (tickAnim >= 150 && tickAnim < 156) {
            xx = 36.76394 + (((tickAnim - 150) / 6) * (38.85947-(36.76394)));
            yy = -0.18822 + (((tickAnim - 150) / 6) * (-17.67852-(-0.18822)));
            zz = -9.83674 + (((tickAnim - 150) / 6) * (11.82862-(-9.83674)));
        }
        else if (tickAnim >= 156 && tickAnim < 162) {
            xx = 38.85947 + (((tickAnim - 156) / 6) * (32.30202-(38.85947)));
            yy = -17.67852 + (((tickAnim - 156) / 6) * (1.15985-(-17.67852)));
            zz = 11.82862 + (((tickAnim - 156) / 6) * (-7.3332-(11.82862)));
        }
        else if (tickAnim >= 162 && tickAnim < 182) {
            xx = 32.30202 + (((tickAnim - 162) / 20) * (56.19378-(32.30202)));
            yy = 1.15985 + (((tickAnim - 162) / 20) * (4.47974-(1.15985)));
            zz = -7.3332 + (((tickAnim - 162) / 20) * (3.18708-(-7.3332)));
        }
        else if (tickAnim >= 182 && tickAnim < 190) {
            xx = 56.19378 + (((tickAnim - 182) / 8) * (57.94378-(56.19378)));
            yy = 4.47974 + (((tickAnim - 182) / 8) * (4.47974-(4.47974)));
            zz = 3.18708 + (((tickAnim - 182) / 8) * (3.18708-(3.18708)));
        }
        else if (tickAnim >= 190 && tickAnim < 200) {
            xx = 57.94378 + (((tickAnim - 190) / 10) * (42.94378-(57.94378)));
            yy = 4.47974 + (((tickAnim - 190) / 10) * (4.47974-(4.47974)));
            zz = 3.18708 + (((tickAnim - 190) / 10) * (3.18708-(3.18708)));
        }
        else if (tickAnim >= 200 && tickAnim < 215) {
            xx = 42.94378 + (((tickAnim - 200) / 15) * (22.69378-(42.94378)));
            yy = 4.47974 + (((tickAnim - 200) / 15) * (4.47974-(4.47974)));
            zz = 3.18708 + (((tickAnim - 200) / 15) * (3.18708-(3.18708)));
        }
        else if (tickAnim >= 215 && tickAnim < 231) {
            xx = 22.69378 + (((tickAnim - 215) / 16) * (22.69378-(22.69378)));
            yy = 4.47974 + (((tickAnim - 215) / 16) * (4.47974-(4.47974)));
            zz = 3.18708 + (((tickAnim - 215) / 16) * (3.18708-(3.18708)));
        }
        else if (tickAnim >= 231 && tickAnim < 236) {
            xx = 22.69378 + (((tickAnim - 231) / 5) * (7.19378-(22.69378)));
            yy = 4.47974 + (((tickAnim - 231) / 5) * (4.47974-(4.47974)));
            zz = 3.18708 + (((tickAnim - 231) / 5) * (3.18708-(3.18708)));
        }
        else if (tickAnim >= 236 && tickAnim < 240) {
            xx = 7.19378 + (((tickAnim - 236) / 4) * (13.19378-(7.19378)));
            yy = 4.47974 + (((tickAnim - 236) / 4) * (4.47974-(4.47974)));
            zz = 3.18708 + (((tickAnim - 236) / 4) * (3.18708-(3.18708)));
        }
        else if (tickAnim >= 240 && tickAnim < 243) {
            xx = 13.19378 + (((tickAnim - 240) / 3) * (13.19378-(13.19378)));
            yy = 4.47974 + (((tickAnim - 240) / 3) * (4.47974-(4.47974)));
            zz = 3.18708 + (((tickAnim - 240) / 3) * (3.18708-(3.18708)));
        }
        else if (tickAnim >= 243 && tickAnim < 248) {
            xx = 13.19378 + (((tickAnim - 243) / 5) * (7.19378-(13.19378)));
            yy = 4.47974 + (((tickAnim - 243) / 5) * (4.47974-(4.47974)));
            zz = 3.18708 + (((tickAnim - 243) / 5) * (3.18708-(3.18708)));
        }
        else if (tickAnim >= 248 && tickAnim < 251) {
            xx = 7.19378 + (((tickAnim - 248) / 3) * (13.19378-(7.19378)));
            yy = 4.47974 + (((tickAnim - 248) / 3) * (4.47974-(4.47974)));
            zz = 3.18708 + (((tickAnim - 248) / 3) * (3.18708-(3.18708)));
        }
        else if (tickAnim >= 251 && tickAnim < 265) {
            xx = 13.19378 + (((tickAnim - 251) / 14) * (0-(13.19378)));
            yy = 4.47974 + (((tickAnim - 251) / 14) * (0-(4.47974)));
            zz = 3.18708 + (((tickAnim - 251) / 14) * (0-(3.18708)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(xx), Head.rotateAngleY + (float) Math.toRadians(yy), Head.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 76 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 76) / 49) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 49) * (0-(0)));
            zz = 0 + (((tickAnim - 76) / 49) * (0-(0)));
        }
        else if (tickAnim >= 125 && tickAnim < 140) {
            xx = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 15) * (0-(0)));
            zz = 0 + (((tickAnim - 125) / 15) * (0-(0)));
        }
        else if (tickAnim >= 140 && tickAnim < 190) {
            xx = 0 + (((tickAnim - 140) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 140) / 50) * (0-(0)));
            zz = 0 + (((tickAnim - 140) / 50) * (0-(0)));
        }
        else if (tickAnim >= 190 && tickAnim < 197) {
            xx = 0 + (((tickAnim - 190) / 7) * (3.75-(0)));
            yy = 0 + (((tickAnim - 190) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 190) / 7) * (0-(0)));
        }
        else if (tickAnim >= 197 && tickAnim < 200) {
            xx = 3.75 + (((tickAnim - 197) / 3) * (0-(3.75)));
            yy = 0 + (((tickAnim - 197) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 197) / 3) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 231) {
            xx = 0 + (((tickAnim - 200) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 200) / 31) * (0-(0)));
            zz = 0 + (((tickAnim - 200) / 31) * (0-(0)));
        }
        else if (tickAnim >= 231 && tickAnim < 236) {
            xx = 0 + (((tickAnim - 231) / 5) * (8.5-(0)));
            yy = 0 + (((tickAnim - 231) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 231) / 5) * (0-(0)));
        }
        else if (tickAnim >= 236 && tickAnim < 240) {
            xx = 8.5 + (((tickAnim - 236) / 4) * (0-(8.5)));
            yy = 0 + (((tickAnim - 236) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 236) / 4) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 243) {
            xx = 0 + (((tickAnim - 240) / 3) * (0-(0)));
            yy = 0 + (((tickAnim - 240) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 3) * (0-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 248) {
            xx = 0 + (((tickAnim - 243) / 5) * (8.5-(0)));
            yy = 0 + (((tickAnim - 243) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 243) / 5) * (0-(0)));
        }
        else if (tickAnim >= 248 && tickAnim < 251) {
            xx = 8.5 + (((tickAnim - 248) / 3) * (0-(8.5)));
            yy = 0 + (((tickAnim - 248) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 248) / 3) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Jaw, Jaw.rotateAngleX + (float) Math.toRadians(xx), Jaw.rotateAngleY + (float) Math.toRadians(yy), Jaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-16.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 47) {
            xx = -16.25 + (((tickAnim - 25) / 22) * (-16.25-(-16.25)));
            yy = 0 + (((tickAnim - 25) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 22) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -16.25 + (((tickAnim - 47) / 13) * (-148.96553-(-16.25)));
            yy = 0 + (((tickAnim - 47) / 13) * (7.74376-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (-100.14943-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = -148.96553 + (((tickAnim - 60) / 8) * (-157.98215-(-148.96553)));
            yy = 7.74376 + (((tickAnim - 60) / 8) * (8.20519-(7.74376)));
            zz = -100.14943 + (((tickAnim - 60) / 8) * (-99.84686-(-100.14943)));
        }
        else if (tickAnim >= 68 && tickAnim < 77) {
            xx = -157.98215 + (((tickAnim - 68) / 9) * (-106.27998-(-157.98215)));
            yy = 8.20519 + (((tickAnim - 68) / 9) * (17.17006-(8.20519)));
            zz = -99.84686 + (((tickAnim - 68) / 9) * (-80.23477-(-99.84686)));
        }
        else if (tickAnim >= 77 && tickAnim < 85) {
            xx = -106.27998 + (((tickAnim - 77) / 8) * (-70.8917-(-106.27998)));
            yy = 17.17006 + (((tickAnim - 77) / 8) * (18.95839-(17.17006)));
            zz = -80.23477 + (((tickAnim - 77) / 8) * (-61.17491-(-80.23477)));
        }
        else if (tickAnim >= 85 && tickAnim < 94) {
            xx = -70.8917 + (((tickAnim - 85) / 9) * (-124.61432-(-70.8917)));
            yy = 18.95839 + (((tickAnim - 85) / 9) * (14.14543-(18.95839)));
            zz = -61.17491 + (((tickAnim - 85) / 9) * (-73.65348-(-61.17491)));
        }
        else if (tickAnim >= 94 && tickAnim < 105) {
            xx = -124.61432 + (((tickAnim - 94) / 11) * (-149.73215-(-124.61432)));
            yy = 14.14543 + (((tickAnim - 94) / 11) * (8.20519-(14.14543)));
            zz = -73.65348 + (((tickAnim - 94) / 11) * (-99.84686-(-73.65348)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = -149.73215 + (((tickAnim - 105) / 20) * (-70.8917-(-149.73215)));
            yy = 8.20519 + (((tickAnim - 105) / 20) * (18.95839-(8.20519)));
            zz = -99.84686 + (((tickAnim - 105) / 20) * (-61.17491-(-99.84686)));
        }
        else if (tickAnim >= 125 && tickAnim < 255) {
            xx = -70.8917 + (((tickAnim - 125) / 130) * (-70.8917-(-70.8917)));
            yy = 18.95839 + (((tickAnim - 125) / 130) * (18.95839-(18.95839)));
            zz = -61.17491 + (((tickAnim - 125) / 130) * (-61.17491-(-61.17491)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = -70.8917 + (((tickAnim - 255) / 10) * (0-(-70.8917)));
            yy = 18.95839 + (((tickAnim - 255) / 10) * (0-(18.95839)));
            zz = -61.17491 + (((tickAnim - 255) / 10) * (0-(-61.17491)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LArm, LArm.rotateAngleX + (float) Math.toRadians(xx), LArm.rotateAngleY + (float) Math.toRadians(yy), LArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (16-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 47) {
            xx = 16 + (((tickAnim - 25) / 22) * (16-(16)));
            yy = 0 + (((tickAnim - 25) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 22) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 16 + (((tickAnim - 47) / 13) * (28.5-(16)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 68) {
            xx = 28.5 + (((tickAnim - 60) / 8) * (36.68465-(28.5)));
            yy = 0 + (((tickAnim - 60) / 8) * (-4.67086-(0)));
            zz = 0 + (((tickAnim - 60) / 8) * (-4.52532-(0)));
        }
        else if (tickAnim >= 68 && tickAnim < 77) {
            xx = 36.68465 + (((tickAnim - 68) / 9) * (7.26447-(36.68465)));
            yy = -4.67086 + (((tickAnim - 68) / 9) * (-10.14016-(-4.67086)));
            zz = -4.52532 + (((tickAnim - 68) / 9) * (-4.18214-(-4.52532)));
        }
        else if (tickAnim >= 77 && tickAnim < 94) {
            xx = 7.26447 + (((tickAnim - 77) / 17) * (36.70911-(7.26447)));
            yy = -10.14016 + (((tickAnim - 77) / 17) * (-19.54484-(-10.14016)));
            zz = -4.18214 + (((tickAnim - 77) / 17) * (-41.79169-(-4.18214)));
        }
        else if (tickAnim >= 94 && tickAnim < 105) {
            xx = 36.70911 + (((tickAnim - 94) / 11) * (36.53926-(36.70911)));
            yy = -19.54484 + (((tickAnim - 94) / 11) * (-2.15754-(-19.54484)));
            zz = -41.79169 + (((tickAnim - 94) / 11) * (-2.08496-(-41.79169)));
        }
        else if (tickAnim >= 105 && tickAnim < 125) {
            xx = 36.53926 + (((tickAnim - 105) / 20) * (7.26447-(36.53926)));
            yy = -2.15754 + (((tickAnim - 105) / 20) * (-10.14016-(-2.15754)));
            zz = -2.08496 + (((tickAnim - 105) / 20) * (-4.18214-(-2.08496)));
        }
        else if (tickAnim >= 125 && tickAnim < 255) {
            xx = 7.26447 + (((tickAnim - 125) / 130) * (7.26447-(7.26447)));
            yy = -10.14016 + (((tickAnim - 125) / 130) * (-10.14016-(-10.14016)));
            zz = -4.18214 + (((tickAnim - 125) / 130) * (-4.18214-(-4.18214)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 7.26447 + (((tickAnim - 255) / 10) * (0-(7.26447)));
            yy = -10.14016 + (((tickAnim - 255) / 10) * (0-(-10.14016)));
            zz = -4.18214 + (((tickAnim - 255) / 10) * (0-(-4.18214)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LArm2, LArm2.rotateAngleX + (float) Math.toRadians(xx), LArm2.rotateAngleY + (float) Math.toRadians(yy), LArm2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (71.5-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 76) {
            xx = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 16) * (0-(0)));
            zz = 71.5 + (((tickAnim - 60) / 16) * (99.5-(71.5)));
        }
        else if (tickAnim >= 76 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 76) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 76) / 9) * (0-(0)));
            zz = 99.5 + (((tickAnim - 76) / 9) * (99.5-(99.5)));
        }
        else if (tickAnim >= 85 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 85) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 9) * (0-(0)));
            zz = 99.5 + (((tickAnim - 85) / 9) * (68-(99.5)));
        }
        else if (tickAnim >= 94 && tickAnim < 125) {
            xx = 0 + (((tickAnim - 94) / 31) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 31) * (0-(0)));
            zz = 68 + (((tickAnim - 94) / 31) * (99.5-(68)));
        }
        else if (tickAnim >= 125 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 125) / 130) * (0-(0)));
            yy = 0 + (((tickAnim - 125) / 130) * (0-(0)));
            zz = 99.5 + (((tickAnim - 125) / 130) * (99.5-(99.5)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 255) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 255) / 10) * (0-(0)));
            zz = 99.5 + (((tickAnim - 255) / 10) * (0-(99.5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LHand, LHand.rotateAngleX + (float) Math.toRadians(xx), LHand.rotateAngleY + (float) Math.toRadians(yy), LHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 47 && tickAnim < 52) {
            xx = 0 + (((tickAnim - 47) / 5) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 5) * (29-(0)));
        }
        else if (tickAnim >= 52 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 52) / 8) * (0-(0)));
            zz = 29 + (((tickAnim - 52) / 8) * (-27-(29)));
        }
        else if (tickAnim >= 60 && tickAnim < 77) {
            xx = 0 + (((tickAnim - 60) / 17) * (0-(0)));
            yy = 0 + (((tickAnim - 60) / 17) * (0-(0)));
            zz = -27 + (((tickAnim - 60) / 17) * (12.75-(-27)));
        }
        else if (tickAnim >= 77 && tickAnim < 85) {
            xx = 0 + (((tickAnim - 77) / 8) * (0-(0)));
            yy = 0 + (((tickAnim - 77) / 8) * (0-(0)));
            zz = 12.75 + (((tickAnim - 77) / 8) * (53.12-(12.75)));
        }
        else if (tickAnim >= 85 && tickAnim < 94) {
            xx = 0 + (((tickAnim - 85) / 9) * (0-(0)));
            yy = 0 + (((tickAnim - 85) / 9) * (0-(0)));
            zz = 53.12 + (((tickAnim - 85) / 9) * (79.5-(53.12)));
        }
        else if (tickAnim >= 94 && tickAnim < 101) {
            xx = 0 + (((tickAnim - 94) / 7) * (0-(0)));
            yy = 0 + (((tickAnim - 94) / 7) * (0-(0)));
            zz = 79.5 + (((tickAnim - 94) / 7) * (16.85-(79.5)));
        }
        else if (tickAnim >= 101 && tickAnim < 105) {
            xx = 0 + (((tickAnim - 101) / 4) * (0-(0)));
            yy = 0 + (((tickAnim - 101) / 4) * (0-(0)));
            zz = 16.85 + (((tickAnim - 101) / 4) * (20.75-(16.85)));
        }
        else if (tickAnim >= 105 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 105) / 150) * (0-(0)));
            yy = 0 + (((tickAnim - 105) / 150) * (0-(0)));
            zz = 20.75 + (((tickAnim - 105) / 150) * (20.75-(20.75)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 255) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 255) / 10) * (0-(0)));
            zz = 20.75 + (((tickAnim - 255) / 10) * (0-(20.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LClaw, LClaw.rotateAngleX + (float) Math.toRadians(xx), LClaw.rotateAngleY + (float) Math.toRadians(yy), LClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-3.62684-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-0.21908-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-10.87323-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 47) {
            xx = -3.62684 + (((tickAnim - 25) / 22) * (-3.62684-(-3.62684)));
            yy = -0.21908 + (((tickAnim - 25) / 22) * (-0.21908-(-0.21908)));
            zz = -10.87323 + (((tickAnim - 25) / 22) * (-10.87323-(-10.87323)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = -3.62684 + (((tickAnim - 47) / 13) * (9.12316-(-3.62684)));
            yy = -0.21908 + (((tickAnim - 47) / 13) * (-0.21908-(-0.21908)));
            zz = -10.87323 + (((tickAnim - 47) / 13) * (-10.87323-(-10.87323)));
        }
        else if (tickAnim >= 60 && tickAnim < 255) {
            xx = 9.12316 + (((tickAnim - 60) / 195) * (9.12316-(9.12316)));
            yy = -0.21908 + (((tickAnim - 60) / 195) * (-0.21908-(-0.21908)));
            zz = -10.87323 + (((tickAnim - 60) / 195) * (-10.87323-(-10.87323)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 9.12316 + (((tickAnim - 255) / 10) * (0-(9.12316)));
            yy = -0.21908 + (((tickAnim - 255) / 10) * (0-(-0.21908)));
            zz = -10.87323 + (((tickAnim - 255) / 10) * (0-(-10.87323)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RArm, RArm.rotateAngleX + (float) Math.toRadians(xx), RArm.rotateAngleY + (float) Math.toRadians(yy), RArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (13.55418-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (6.4283-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.96481-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 47) {
            xx = 13.55418 + (((tickAnim - 25) / 22) * (13.55418-(13.55418)));
            yy = 6.4283 + (((tickAnim - 25) / 22) * (6.4283-(6.4283)));
            zz = 0.96481 + (((tickAnim - 25) / 22) * (0.96481-(0.96481)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 13.55418 + (((tickAnim - 47) / 13) * (26.80418-(13.55418)));
            yy = 6.4283 + (((tickAnim - 47) / 13) * (6.4283-(6.4283)));
            zz = 0.96481 + (((tickAnim - 47) / 13) * (0.96481-(0.96481)));
        }
        else if (tickAnim >= 60 && tickAnim < 255) {
            xx = 26.80418 + (((tickAnim - 60) / 195) * (26.80418-(26.80418)));
            yy = 6.4283 + (((tickAnim - 60) / 195) * (6.4283-(6.4283)));
            zz = 0.96481 + (((tickAnim - 60) / 195) * (0.96481-(0.96481)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 26.80418 + (((tickAnim - 255) / 10) * (0-(26.80418)));
            yy = 6.4283 + (((tickAnim - 255) / 10) * (0-(6.4283)));
            zz = 0.96481 + (((tickAnim - 255) / 10) * (0-(0.96481)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RArm2, RArm2.rotateAngleX + (float) Math.toRadians(xx), RArm2.rotateAngleY + (float) Math.toRadians(yy), RArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0.65-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 25) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 25) / 22) * (0-(0)));
            zz = 0.65 + (((tickAnim - 25) / 22) * (0.65-(0.65)));
        }
        else if (tickAnim >= 47 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 47) / 208) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 208) * (0-(0)));
            zz = 0.65 + (((tickAnim - 47) / 208) * (0.65-(0.65)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 255) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 255) / 10) * (0-(0)));
            zz = 0.65 + (((tickAnim - 255) / 10) * (0-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RArm2.rotationPointX = this.RArm2.rotationPointX + (float)(xx);
        this.RArm2.rotationPointY = this.RArm2.rotationPointY - (float)(yy);
        this.RArm2.rotationPointZ = this.RArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 47) {
            xx = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 47) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 47) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 60) {
            xx = 0 + (((tickAnim - 47) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 47) / 13) * (13.5-(0)));
            zz = 0 + (((tickAnim - 47) / 13) * (0-(0)));
        }
        else if (tickAnim >= 60 && tickAnim < 255) {
            xx = 0 + (((tickAnim - 60) / 195) * (0-(0)));
            yy = 13.5 + (((tickAnim - 60) / 195) * (13.5-(13.5)));
            zz = 0 + (((tickAnim - 60) / 195) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 0 + (((tickAnim - 255) / 10) * (0-(0)));
            yy = 13.5 + (((tickAnim - 255) / 10) * (0-(13.5)));
            zz = 0 + (((tickAnim - 255) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RHand, RHand.rotateAngleX + (float) Math.toRadians(xx), RHand.rotateAngleY + (float) Math.toRadians(yy), RHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-5.5-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 47) {
            xx = -5.5 + (((tickAnim - 25) / 22) * (-5.5-(-5.5)));
            yy = 0 + (((tickAnim - 25) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 22) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 265) {
            xx = -5.5 + (((tickAnim - 47) / 218) * (0-(-5.5)));
            yy = 0 + (((tickAnim - 47) / 218) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 218) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(xx), Body2.rotateAngleY + (float) Math.toRadians(yy), Body2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-14.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 47) {
            xx = -14.25 + (((tickAnim - 25) / 22) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 25) / 22) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 22) * (0-(0)));
        }
        else if (tickAnim >= 47 && tickAnim < 255) {
            xx = -14.25 + (((tickAnim - 47) / 208) * (-14.25-(-14.25)));
            yy = 0 + (((tickAnim - 47) / 208) * (0-(0)));
            zz = 0 + (((tickAnim - 47) / 208) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = -14.25 + (((tickAnim - 255) / 10) * (0-(-14.25)));
            yy = 0 + (((tickAnim - 255) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(xx), Tail.rotateAngleY + (float) Math.toRadians(yy), Tail.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (12.22459-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (14.78914-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-3.17178-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 47) {
            xx = 12.22459 + (((tickAnim - 25) / 22) * (12.22459-(12.22459)));
            yy = 14.78914 + (((tickAnim - 25) / 22) * (14.78914-(14.78914)));
            zz = -3.17178 + (((tickAnim - 25) / 22) * (-3.17178-(-3.17178)));
        }
        else if (tickAnim >= 47 && tickAnim < 255) {
            xx = 12.22459 + (((tickAnim - 47) / 208) * (12.22459-(12.22459)));
            yy = 14.78914 + (((tickAnim - 47) / 208) * (14.78914-(14.78914)));
            zz = -3.17178 + (((tickAnim - 47) / 208) * (-3.17178-(-3.17178)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 12.22459 + (((tickAnim - 255) / 10) * (0-(12.22459)));
            yy = 14.78914 + (((tickAnim - 255) / 10) * (0-(14.78914)));
            zz = -3.17178 + (((tickAnim - 255) / 10) * (0-(-3.17178)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(xx), Tail2.rotateAngleY + (float) Math.toRadians(yy), Tail2.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (2.33052-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (11.23692-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-11.97145-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 47) {
            xx = 2.33052 + (((tickAnim - 25) / 22) * (2.33052-(2.33052)));
            yy = 11.23692 + (((tickAnim - 25) / 22) * (11.23692-(11.23692)));
            zz = -11.97145 + (((tickAnim - 25) / 22) * (-11.97145-(-11.97145)));
        }
        else if (tickAnim >= 47 && tickAnim < 255) {
            xx = 2.33052 + (((tickAnim - 47) / 208) * (2.33052-(2.33052)));
            yy = 11.23692 + (((tickAnim - 47) / 208) * (11.23692-(11.23692)));
            zz = -11.97145 + (((tickAnim - 47) / 208) * (-11.97145-(-11.97145)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 2.33052 + (((tickAnim - 255) / 10) * (0-(2.33052)));
            yy = 11.23692 + (((tickAnim - 255) / 10) * (0-(11.23692)));
            zz = -11.97145 + (((tickAnim - 255) / 10) * (0-(-11.97145)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(xx), Tail3.rotateAngleY + (float) Math.toRadians(yy), Tail3.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (-0.03123-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (5.20496-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-13.43715-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 47) {
            xx = -0.03123 + (((tickAnim - 25) / 22) * (-0.03123-(-0.03123)));
            yy = 5.20496 + (((tickAnim - 25) / 22) * (5.20496-(5.20496)));
            zz = -13.43715 + (((tickAnim - 25) / 22) * (-13.43715-(-13.43715)));
        }
        else if (tickAnim >= 47 && tickAnim < 255) {
            xx = -0.03123 + (((tickAnim - 47) / 208) * (-0.03123-(-0.03123)));
            yy = 5.20496 + (((tickAnim - 47) / 208) * (5.20496-(5.20496)));
            zz = -13.43715 + (((tickAnim - 47) / 208) * (-13.43715-(-13.43715)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = -0.03123 + (((tickAnim - 255) / 10) * (0-(-0.03123)));
            yy = 5.20496 + (((tickAnim - 255) / 10) * (0-(5.20496)));
            zz = -13.43715 + (((tickAnim - 255) / 10) * (0-(-13.43715)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(xx), Tail4.rotateAngleY + (float) Math.toRadians(yy), Tail4.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (55.54237-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-1.6424-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-20.18607-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 47) {
            xx = 55.54237 + (((tickAnim - 25) / 22) * (55.54237-(55.54237)));
            yy = -1.6424 + (((tickAnim - 25) / 22) * (-1.6424-(-1.6424)));
            zz = -20.18607 + (((tickAnim - 25) / 22) * (-20.18607-(-20.18607)));
        }
        else if (tickAnim >= 47 && tickAnim < 255) {
            xx = 55.54237 + (((tickAnim - 47) / 208) * (55.54237-(55.54237)));
            yy = -1.6424 + (((tickAnim - 47) / 208) * (-1.6424-(-1.6424)));
            zz = -20.18607 + (((tickAnim - 47) / 208) * (-20.18607-(-20.18607)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 55.54237 + (((tickAnim - 255) / 10) * (0-(55.54237)));
            yy = -1.6424 + (((tickAnim - 255) / 10) * (0-(-1.6424)));
            zz = -20.18607 + (((tickAnim - 255) / 10) * (0-(-20.18607)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(TailClaw, TailClaw.rotateAngleX + (float) Math.toRadians(xx), TailClaw.rotateAngleY + (float) Math.toRadians(yy), TailClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (11.46773-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-4.0907-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-20.10959-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 255) {
            xx = 11.46773 + (((tickAnim - 25) / 230) * (11.46773-(11.46773)));
            yy = -4.0907 + (((tickAnim - 25) / 230) * (-4.0907-(-4.0907)));
            zz = -20.10959 + (((tickAnim - 25) / 230) * (-20.10959-(-20.10959)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 11.46773 + (((tickAnim - 255) / 10) * (0-(11.46773)));
            yy = -4.0907 + (((tickAnim - 255) / 10) * (0-(-4.0907)));
            zz = -20.10959 + (((tickAnim - 255) / 10) * (0-(-20.10959)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LLeg, LLeg.rotateAngleX + (float) Math.toRadians(xx), LLeg.rotateAngleY + (float) Math.toRadians(yy), LLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (15.25-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (0-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 255) {
            xx = 15.25 + (((tickAnim - 25) / 230) * (15.25-(15.25)));
            yy = 0 + (((tickAnim - 25) / 230) * (0-(0)));
            zz = 0 + (((tickAnim - 25) / 230) * (0-(0)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 15.25 + (((tickAnim - 255) / 10) * (0-(15.25)));
            yy = 0 + (((tickAnim - 255) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 255) / 10) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LFoot, LFoot.rotateAngleX + (float) Math.toRadians(xx), LFoot.rotateAngleY + (float) Math.toRadians(yy), LFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (14.73758-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (-3.5292-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (23.63529-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 255) {
            xx = 14.73758 + (((tickAnim - 25) / 230) * (14.73758-(14.73758)));
            yy = -3.5292 + (((tickAnim - 25) / 230) * (-3.5292-(-3.5292)));
            zz = 23.63529 + (((tickAnim - 25) / 230) * (23.63529-(23.63529)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 14.73758 + (((tickAnim - 255) / 10) * (0-(14.73758)));
            yy = -3.5292 + (((tickAnim - 255) / 10) * (0-(-3.5292)));
            zz = 23.63529 + (((tickAnim - 255) / 10) * (0-(23.63529)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RLeg, RLeg.rotateAngleX + (float) Math.toRadians(xx), RLeg.rotateAngleY + (float) Math.toRadians(yy), RLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 25) {
            xx = 0 + (((tickAnim - 0) / 25) * (13.48502-(0)));
            yy = 0 + (((tickAnim - 0) / 25) * (0.64174-(0)));
            zz = 0 + (((tickAnim - 0) / 25) * (-2.67413-(0)));
        }
        else if (tickAnim >= 25 && tickAnim < 255) {
            xx = 13.48502 + (((tickAnim - 25) / 230) * (13.48502-(13.48502)));
            yy = 0.64174 + (((tickAnim - 25) / 230) * (0.64174-(0.64174)));
            zz = -2.67413 + (((tickAnim - 25) / 230) * (-2.67413-(-2.67413)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 13.48502 + (((tickAnim - 255) / 10) * (0-(13.48502)));
            yy = 0.64174 + (((tickAnim - 255) / 10) * (0-(0.64174)));
            zz = -2.67413 + (((tickAnim - 255) / 10) * (0-(-2.67413)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RFoot, RFoot.rotateAngleX + (float) Math.toRadians(xx), RFoot.rotateAngleY + (float) Math.toRadians(yy), RFoot.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 162) {
            xx = 0 + (((tickAnim - 0) / 162) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 162) * (84.5-(0)));
            zz = 0 + (((tickAnim - 0) / 162) * (0-(0)));
        }
        else if (tickAnim >= 162 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 162) / 14) * (-45.5-(0)));
            yy = 84.5 + (((tickAnim - 162) / 14) * (84.5-(84.5)));
            zz = 0 + (((tickAnim - 162) / 14) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 187) {
            xx = -45.5 + (((tickAnim - 176) / 11) * (-37.95255-(-45.5)));
            yy = 84.5 + (((tickAnim - 176) / 11) * (84.5-(84.5)));
            zz = 0 + (((tickAnim - 176) / 11) * (0-(0)));
        }
        else if (tickAnim >= 187 && tickAnim < 200) {
            xx = -37.95255 + (((tickAnim - 187) / 13) * (-37.95255-(-37.95255)));
            yy = 84.5 + (((tickAnim - 187) / 13) * (84.5-(84.5)));
            zz = 0 + (((tickAnim - 187) / 13) * (0-(0)));
        }
        else if (tickAnim >= 200 && tickAnim < 231) {
            xx = -37.95255 + (((tickAnim - 200) / 31) * (-37.95255-(-37.95255)));
            yy = 84.5 + (((tickAnim - 200) / 31) * (84.5-(84.5)));
            zz = 0 + (((tickAnim - 200) / 31) * (0-(0)));
        }
        else if (tickAnim >= 231 && tickAnim < 236) {
            xx = -37.95255 + (((tickAnim - 231) / 5) * (-143.30232-(-37.95255)));
            yy = 84.5 + (((tickAnim - 231) / 5) * (70.72944-(84.5)));
            zz = 0 + (((tickAnim - 231) / 5) * (-135.50846-(0)));
        }
        else if (tickAnim >= 236 && tickAnim < 240) {
            xx = -143.30232 + (((tickAnim - 236) / 4) * (-134.80232-(-143.30232)));
            yy = 70.72944 + (((tickAnim - 236) / 4) * (70.72944-(70.72944)));
            zz = -135.50846 + (((tickAnim - 236) / 4) * (-135.50846-(-135.50846)));
        }
        else if (tickAnim >= 240 && tickAnim < 243) {
            xx = -134.80232 + (((tickAnim - 240) / 3) * (-134.80232-(-134.80232)));
            yy = 70.72944 + (((tickAnim - 240) / 3) * (70.72944-(70.72944)));
            zz = -135.50846 + (((tickAnim - 240) / 3) * (-135.50846-(-135.50846)));
        }
        else if (tickAnim >= 243 && tickAnim < 248) {
            xx = -134.80232 + (((tickAnim - 243) / 5) * (-181.61549-(-134.80232)));
            yy = 70.72944 + (((tickAnim - 243) / 5) * (1.70552-(70.72944)));
            zz = -135.50846 + (((tickAnim - 243) / 5) * (-181.12864-(-135.50846)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(grub, grub.rotateAngleX + (float) Math.toRadians(xx), grub.rotateAngleY + (float) Math.toRadians(yy), grub.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 33) {
            xx = 0 + (((tickAnim - 0) / 33) * (0-(0)));
            yy = -12 + (((tickAnim - 0) / 33) * (-14.925-(-12)));
            zz = -12 + (((tickAnim - 0) / 33) * (-12-(-12)));
        }
        else if (tickAnim >= 33 && tickAnim < 162) {
            xx = 0 + (((tickAnim - 33) / 129) * (-1.375-(0)));
            yy = -14.925 + (((tickAnim - 33) / 129) * (-11.88-(-14.925)));
            zz = -12 + (((tickAnim - 33) / 129) * (-9.6-(-12)));
        }
        else if (tickAnim >= 162 && tickAnim < 176) {
            xx = -1.375 + (((tickAnim - 162) / 14) * (-1.37-(-1.375)));
            yy = -11.88 + (((tickAnim - 162) / 14) * (-11.255-(-11.88)));
            zz = -9.6 + (((tickAnim - 162) / 14) * (-9.6-(-9.6)));
        }
        else if (tickAnim >= 176 && tickAnim < 187) {
            xx = -1.37 + (((tickAnim - 176) / 11) * (-1.37-(-1.37)));
            yy = -11.255 + (((tickAnim - 176) / 11) * (-10.65-(-11.255)));
            zz = -9.6 + (((tickAnim - 176) / 11) * (-9.6-(-9.6)));
        }
        else if (tickAnim >= 187 && tickAnim < 200) {
            xx = -1.37 + (((tickAnim - 187) / 13) * (-1.37-(-1.37)));
            yy = -10.65 + (((tickAnim - 187) / 13) * (-10.65-(-10.65)));
            zz = -9.6 + (((tickAnim - 187) / 13) * (-9.6-(-9.6)));
        }
        else if (tickAnim >= 200 && tickAnim < 203) {
            xx = -1.37 + (((tickAnim - 200) / 3) * (-1.27-(-1.37)));
            yy = -10.65 + (((tickAnim - 200) / 3) * (-8.65-(-10.65)));
            zz = -9.6 + (((tickAnim - 200) / 3) * (-11.975-(-9.6)));
        }
        else if (tickAnim >= 203 && tickAnim < 206) {
            xx = -1.27 + (((tickAnim - 203) / 3) * (-1.2-(-1.27)));
            yy = -8.65 + (((tickAnim - 203) / 3) * (-7.28-(-8.65)));
            zz = -11.975 + (((tickAnim - 203) / 3) * (-13.455-(-11.975)));
        }
        else if (tickAnim >= 206 && tickAnim < 211) {
            xx = -1.2 + (((tickAnim - 206) / 5) * (-1.06-(-1.2)));
            yy = -7.28 + (((tickAnim - 206) / 5) * (-3.27-(-7.28)));
            zz = -13.455 + (((tickAnim - 206) / 5) * (-16.165-(-13.455)));
        }
        else if (tickAnim >= 211 && tickAnim < 215) {
            xx = -1.06 + (((tickAnim - 211) / 4) * (-0.945-(-1.06)));
            yy = -3.27 + (((tickAnim - 211) / 4) * (0-(-3.27)));
            zz = -16.165 + (((tickAnim - 211) / 4) * (-16.725-(-16.165)));
        }
        else if (tickAnim >= 215 && tickAnim < 219) {
            xx = -0.945 + (((tickAnim - 215) / 4) * (-0.95-(-0.945)));
            yy = 0 + (((tickAnim - 215) / 4) * (0.105-(0)));
            zz = -16.725 + (((tickAnim - 215) / 4) * (-16.72-(-16.725)));
        }
        else if (tickAnim >= 219 && tickAnim < 231) {
            xx = -0.95 + (((tickAnim - 219) / 12) * (-0.95-(-0.95)));
            yy = 0.105 + (((tickAnim - 219) / 12) * (-0.52-(0.105)));
            zz = -16.72 + (((tickAnim - 219) / 12) * (-16.72-(-16.72)));
        }
        else if (tickAnim >= 231 && tickAnim < 236) {
            xx = -0.95 + (((tickAnim - 231) / 5) * (-1.8-(-0.95)));
            yy = -0.52 + (((tickAnim - 231) / 5) * (-0.145-(-0.52)));
            zz = -16.72 + (((tickAnim - 231) / 5) * (-16.72-(-16.72)));
        }
        else if (tickAnim >= 236 && tickAnim < 240) {
            xx = -1.8 + (((tickAnim - 236) / 4) * (-2.3-(-1.8)));
            yy = -0.145 + (((tickAnim - 236) / 4) * (-0.175-(-0.145)));
            zz = -16.72 + (((tickAnim - 236) / 4) * (-16.72-(-16.72)));
        }
        else if (tickAnim >= 240 && tickAnim < 243) {
            xx = -2.3 + (((tickAnim - 240) / 3) * (-2.3-(-2.3)));
            yy = -0.175 + (((tickAnim - 240) / 3) * (-0.175-(-0.175)));
            zz = -16.72 + (((tickAnim - 240) / 3) * (-16.72-(-16.72)));
        }
        else if (tickAnim >= 243 && tickAnim < 248) {
            xx = -2.3 + (((tickAnim - 243) / 5) * (-1-(-2.3)));
            yy = -0.175 + (((tickAnim - 243) / 5) * (-0.17-(-0.175)));
            zz = -16.72 + (((tickAnim - 243) / 5) * (-14.045-(-16.72)));
        }
        else if (tickAnim >= 248 && tickAnim < 251) {
            xx = -1 + (((tickAnim - 248) / 3) * (-1.01-(-1)));
            yy = -0.17 + (((tickAnim - 248) / 3) * (-0.305-(-0.17)));
            zz = -14.045 + (((tickAnim - 248) / 3) * (-12.3-(-14.045)));
        }
        else if (tickAnim >= 251 && tickAnim < 253) {
            xx = -1.01 + (((tickAnim - 251) / 2) * (-0.585-(-1.01)));
            yy = -0.305 + (((tickAnim - 251) / 2) * (-0.66-(-0.305)));
            zz = -12.3 + (((tickAnim - 251) / 2) * (-5.8-(-12.3)));
        }
        else if (tickAnim >= 253 && tickAnim < 255) {
            xx = -0.585 + (((tickAnim - 253) / 2) * (0.075-(-0.585)));
            yy = -0.66 + (((tickAnim - 253) / 2) * (-0.895-(-0.66)));
            zz = -5.8 + (((tickAnim - 253) / 2) * (-1.465-(-5.8)));
        }
        else if (tickAnim >= 255 && tickAnim < 265) {
            xx = 0.075 + (((tickAnim - 255) / 10) * (0.07-(0.075)));
            yy = -0.895 + (((tickAnim - 255) / 10) * (-1.84-(-0.895)));
            zz = -1.465 + (((tickAnim - 255) / 10) * (5.365-(-1.465)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.grub.rotationPointX = this.grub.rotationPointX + (float)(xx);
        this.grub.rotationPointY = this.grub.rotationPointY - (float)(yy);
        this.grub.rotationPointZ = this.grub.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 187) {
            xx = 0 + (((tickAnim - 0) / 187) * (-17.75-(0)));
            yy = 0 + (((tickAnim - 0) / 187) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 187) * (0-(0)));
        }
        else if (tickAnim >= 187 && tickAnim < 203) {
            xx = -17.75 + (((tickAnim - 187) / 16) * (-34.25-(-17.75)));
            yy = 0 + (((tickAnim - 187) / 16) * (0-(0)));
            zz = 0 + (((tickAnim - 187) / 16) * (0-(0)));
        }
        else if (tickAnim >= 203 && tickAnim < 209) {
            xx = -34.25 + (((tickAnim - 203) / 6) * (18.25-(-34.25)));
            yy = 0 + (((tickAnim - 203) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 203) / 6) * (0-(0)));
        }
        else if (tickAnim >= 209 && tickAnim < 214) {
            xx = 18.25 + (((tickAnim - 209) / 5) * (-22-(18.25)));
            yy = 0 + (((tickAnim - 209) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 209) / 5) * (0-(0)));
        }
        else if (tickAnim >= 214 && tickAnim < 219) {
            xx = -22 + (((tickAnim - 214) / 5) * (18.25-(-22)));
            yy = 0 + (((tickAnim - 214) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 214) / 5) * (0-(0)));
        }
        else if (tickAnim >= 219 && tickAnim < 224) {
            xx = 18.25 + (((tickAnim - 219) / 5) * (-22-(18.25)));
            yy = 0 + (((tickAnim - 219) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 219) / 5) * (0-(0)));
        }
        else if (tickAnim >= 224 && tickAnim < 229) {
            xx = -22 + (((tickAnim - 224) / 5) * (18.25-(-22)));
            yy = 0 + (((tickAnim - 224) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 224) / 5) * (0-(0)));
        }
        else if (tickAnim >= 229 && tickAnim < 236) {
            xx = 18.25 + (((tickAnim - 229) / 7) * (-22.25-(18.25)));
            yy = 0 + (((tickAnim - 229) / 7) * (0-(0)));
            zz = 0 + (((tickAnim - 229) / 7) * (0-(0)));
        }
        else if (tickAnim >= 236 && tickAnim < 240) {
            xx = -22.25 + (((tickAnim - 236) / 4) * (-40.75-(-22.25)));
            yy = 0 + (((tickAnim - 236) / 4) * (0-(0)));
            zz = 0 + (((tickAnim - 236) / 4) * (0-(0)));
        }
        else if (tickAnim >= 240 && tickAnim < 243) {
            xx = -40.75 + (((tickAnim - 240) / 3) * (-40.75-(-40.75)));
            yy = 0 + (((tickAnim - 240) / 3) * (0-(0)));
            zz = 0 + (((tickAnim - 240) / 3) * (0-(0)));
        }
        else if (tickAnim >= 243 && tickAnim < 248) {
            xx = -40.75 + (((tickAnim - 243) / 5) * (-10.75-(-40.75)));
            yy = 0 + (((tickAnim - 243) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 243) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(grub2, grub2.rotateAngleX + (float) Math.toRadians(xx), grub2.rotateAngleY + (float) Math.toRadians(yy), grub2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 187) {
            xx = 0 + (((tickAnim - 0) / 187) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 187) * (0.025-(0)));
            zz = 0 + (((tickAnim - 0) / 187) * (0.3-(0)));
        }
        else if (tickAnim >= 187 && tickAnim < 203) {
            xx = 0 + (((tickAnim - 187) / 16) * (0-(0)));
            yy = 0.025 + (((tickAnim - 187) / 16) * (0.155-(0.025)));
            zz = 0.3 + (((tickAnim - 187) / 16) * (0.25-(0.3)));
        }
        else if (tickAnim >= 203 && tickAnim < 209) {
            xx = 0 + (((tickAnim - 203) / 6) * (0-(0)));
            yy = 0.155 + (((tickAnim - 203) / 6) * (-0.09-(0.155)));
            zz = 0.25 + (((tickAnim - 203) / 6) * (0.25-(0.25)));
        }
        else if (tickAnim >= 209 && tickAnim < 214) {
            xx = 0 + (((tickAnim - 209) / 5) * (0-(0)));
            yy = -0.09 + (((tickAnim - 209) / 5) * (0.06-(-0.09)));
            zz = 0.25 + (((tickAnim - 209) / 5) * (0.25-(0.25)));
        }
        else if (tickAnim >= 214 && tickAnim < 219) {
            xx = 0 + (((tickAnim - 214) / 5) * (0-(0)));
            yy = 0.06 + (((tickAnim - 214) / 5) * (-0.09-(0.06)));
            zz = 0.25 + (((tickAnim - 214) / 5) * (0.25-(0.25)));
        }
        else if (tickAnim >= 219 && tickAnim < 224) {
            xx = 0 + (((tickAnim - 219) / 5) * (0-(0)));
            yy = -0.09 + (((tickAnim - 219) / 5) * (0.06-(-0.09)));
            zz = 0.25 + (((tickAnim - 219) / 5) * (0.25-(0.25)));
        }
        else if (tickAnim >= 224 && tickAnim < 229) {
            xx = 0 + (((tickAnim - 224) / 5) * (0-(0)));
            yy = 0.06 + (((tickAnim - 224) / 5) * (-0.09-(0.06)));
            zz = 0.25 + (((tickAnim - 224) / 5) * (0.25-(0.25)));
        }
        else if (tickAnim >= 229 && tickAnim < 236) {
            xx = 0 + (((tickAnim - 229) / 7) * (0-(0)));
            yy = -0.09 + (((tickAnim - 229) / 7) * (0.06-(-0.09)));
            zz = 0.25 + (((tickAnim - 229) / 7) * (0.25-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.grub2.rotationPointX = this.grub2.rotationPointX + (float)(xx);
        this.grub2.rotationPointY = this.grub2.rotationPointY - (float)(yy);
        this.grub2.rotationPointZ = this.grub2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 176) {
            xx = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 176) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 176) * (0-(0)));
        }
        else if (tickAnim >= 176 && tickAnim < 187) {
            xx = 0 + (((tickAnim - 176) / 11) * (19.25-(0)));
            yy = 0 + (((tickAnim - 176) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 176) / 11) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(grub3, grub3.rotateAngleX + (float) Math.toRadians(xx), grub3.rotateAngleY + (float) Math.toRadians(yy), grub3.rotateAngleZ + (float) Math.toRadians(zz));


    }
    public void animClimb(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime, boolean isStatic) {
        EntityPrehistoricFloraDrepanosaurus entity = (EntityPrehistoricFloraDrepanosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = 0;
        if (!isStatic) {
            tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Drepanosaurus, Drepanosaurus.rotateAngleX + (float) Math.toRadians(-86.75), Drepanosaurus.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*2), Drepanosaurus.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+20))));
        this.Drepanosaurus.rotationPointX = this.Drepanosaurus.rotationPointX + (float)(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*0.1);
        this.Drepanosaurus.rotationPointY = this.Drepanosaurus.rotationPointY - (float)(11.125+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5-10))*0.4);
        this.Drepanosaurus.rotationPointZ = this.Drepanosaurus.rotationPointZ + (float)(-1.05);

        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-2.5), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+70))*1.5));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(0);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0);

        if (isStatic) {
            this.setRotateAngle(Drepanosaurus, (float)Math.toRadians(-90), Drepanosaurus.rotateAngleY, Drepanosaurus.rotateAngleZ);
        }

        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*-2.5), Neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+130))*1.5));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0), Neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*2.5), Neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+170))*1.5));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(0), Neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*2.5), Neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+220))*1.5));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-250))*-2.5), Head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+270))*1.5));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -149.83972 + (((tickAnim - 0) / 10) * (-69.23292-(-149.83972)));
            yy = 23.67146 + (((tickAnim - 0) / 10) * (19.59382-(23.67146)));
            zz = -182.64086 + (((tickAnim - 0) / 10) * (-104.69871-(-182.64086)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -69.23292 + (((tickAnim - 10) / 13) * (35.99281-(-69.23292)));
            yy = 19.59382 + (((tickAnim - 10) / 13) * (18.4871+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(19.59382)));
            zz = -104.69871 + (((tickAnim - 10) / 13) * (-0.77585-(-104.69871)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 35.99281 + (((tickAnim - 23) / 15) * (-63.61611-(35.99281)));
            yy = 18.4871+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 23) / 15) * (15.70485-(18.4871+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            zz = -0.77585 + (((tickAnim - 23) / 15) * (-103.07492-(-0.77585)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -63.61611 + (((tickAnim - 38) / 12) * (-149.83972-(-63.61611)));
            yy = 15.70485 + (((tickAnim - 38) / 12) * (23.67146-(15.70485)));
            zz = -103.07492 + (((tickAnim - 38) / 12) * (-182.64086-(-103.07492)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LArm, LArm.rotateAngleX + (float) Math.toRadians(xx), LArm.rotateAngleY + (float) Math.toRadians(yy), LArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -27.36758 + (((tickAnim - 0) / 10) * (-36.9344-(-27.36758)));
            yy = -5.96045 + (((tickAnim - 0) / 10) * (19.10418-(-5.96045)));
            zz = 28.77217 + (((tickAnim - 0) / 10) * (-12.63189-(28.77217)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -36.9344 + (((tickAnim - 10) / 13) * (33.88805-(-36.9344)));
            yy = 19.10418 + (((tickAnim - 10) / 13) * (10.8756-(19.10418)));
            zz = -12.63189 + (((tickAnim - 10) / 13) * (6.6951-(-12.63189)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 33.88805 + (((tickAnim - 23) / 27) * (-27.36758-(33.88805)));
            yy = 10.8756 + (((tickAnim - 23) / 27) * (-5.96045-(10.8756)));
            zz = 6.6951 + (((tickAnim - 23) / 27) * (28.77217-(6.6951)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LArm2, LArm2.rotateAngleX + (float) Math.toRadians(xx), LArm2.rotateAngleY + (float) Math.toRadians(yy), LArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -0.025 + (((tickAnim - 0) / 10) * (0-(-0.025)));
            yy = -1 + (((tickAnim - 0) / 10) * (-0.6-(-1)));
            zz = 0.3 + (((tickAnim - 0) / 10) * (0-(0.3)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0.05-(0)));
            yy = -0.6 + (((tickAnim - 10) / 13) * (0.325-(-0.6)));
            zz = 0 + (((tickAnim - 10) / 13) * (0.575-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0.05 + (((tickAnim - 23) / 27) * (-0.025-(0.05)));
            yy = 0.325 + (((tickAnim - 23) / 27) * (-1-(0.325)));
            zz = 0.575 + (((tickAnim - 23) / 27) * (0.3-(0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LArm2.rotationPointX = this.LArm2.rotationPointX + (float)(xx);
        this.LArm2.rotationPointY = this.LArm2.rotationPointY - (float)(yy);
        this.LArm2.rotationPointZ = this.LArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 13.75 + (((tickAnim - 0) / 10) * (6.14-(13.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 6.14 + (((tickAnim - 10) / 13) * (97.5-(6.14)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            zz = 97.5 + (((tickAnim - 23) / 15) * (89.77-(97.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 89.77 + (((tickAnim - 38) / 12) * (13.75-(89.77)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LHand, LHand.rotateAngleX + (float) Math.toRadians(xx), LHand.rotateAngleY + (float) Math.toRadians(yy), LHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 9) {
            xx = 36.24281 + (((tickAnim - 0) / 9) * (-40.32827-(36.24281)));
            yy = 5.46207 + (((tickAnim - 0) / 9) * (-7.02374-(5.46207)));
            zz = -0.77585 + (((tickAnim - 0) / 9) * (77.83133-(-0.77585)));
        }
        else if (tickAnim >= 9 && tickAnim < 23) {
            xx = -40.32827 + (((tickAnim - 9) / 14) * (-159.08972-(-40.32827)));
            yy = -7.02374 + (((tickAnim - 9) / 14) * (-23.6715-(-7.02374)));
            zz = 77.83133 + (((tickAnim - 9) / 14) * (182.6409-(77.83133)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = -159.08972 + (((tickAnim - 23) / 27) * (36.24281-(-159.08972)));
            yy = -23.6715 + (((tickAnim - 23) / 27) * (5.46207-(-23.6715)));
            zz = 182.6409 + (((tickAnim - 23) / 27) * (-0.77585-(182.6409)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RArm, RArm.rotateAngleX + (float) Math.toRadians(xx), RArm.rotateAngleY + (float) Math.toRadians(yy), RArm.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 24.38805 + (((tickAnim - 0) / 23) * (-22.11758-(24.38805)));
            yy = -10.87558 + (((tickAnim - 0) / 23) * (5.9604-(-10.87558)));
            zz = -6.69511 + (((tickAnim - 0) / 23) * (-28.7722-(-6.69511)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = -22.11758 + (((tickAnim - 23) / 14) * (2.89824-(-22.11758)));
            yy = 5.9604 + (((tickAnim - 23) / 14) * (-48.97743-(5.9604)));
            zz = -28.7722 + (((tickAnim - 23) / 14) * (-23.4624-(-28.7722)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 2.89824 + (((tickAnim - 37) / 13) * (24.38805-(2.89824)));
            yy = -48.97743 + (((tickAnim - 37) / 13) * (-10.87558-(-48.97743)));
            zz = -23.4624 + (((tickAnim - 37) / 13) * (-6.69511-(-23.4624)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RArm2, RArm2.rotateAngleX + (float) Math.toRadians(xx), RArm2.rotateAngleY + (float) Math.toRadians(yy), RArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0.05 + (((tickAnim - 0) / 6) * (0.03-(0.05)));
            yy = 0.325 + (((tickAnim - 0) / 6) * (-0.02-(0.325)));
            zz = 0.575 + (((tickAnim - 0) / 6) * (1.125-(0.575)));
        }
        else if (tickAnim >= 6 && tickAnim < 23) {
            xx = 0.03 + (((tickAnim - 6) / 17) * (-0.025-(0.03)));
            yy = -0.02 + (((tickAnim - 6) / 17) * (-1-(-0.02)));
            zz = 1.125 + (((tickAnim - 6) / 17) * (0.925-(1.125)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -0.025 + (((tickAnim - 23) / 8) * (0.15-(-0.025)));
            yy = -1 + (((tickAnim - 23) / 8) * (-0.69-(-1)));
            zz = 0.925 + (((tickAnim - 23) / 8) * (0.645-(0.925)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 0.15 + (((tickAnim - 31) / 6) * (-0.585-(0.15)));
            yy = -0.69 + (((tickAnim - 31) / 6) * (-0.48-(-0.69)));
            zz = 0.645 + (((tickAnim - 31) / 6) * (0.605-(0.645)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = -0.585 + (((tickAnim - 37) / 13) * (0.05-(-0.585)));
            yy = -0.48 + (((tickAnim - 37) / 13) * (0.325-(-0.48)));
            zz = 0.605 + (((tickAnim - 37) / 13) * (0.575-(0.605)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RArm2.rotationPointX = this.RArm2.rotationPointX + (float)(xx);
        this.RArm2.rotationPointY = this.RArm2.rotationPointY - (float)(yy);
        this.RArm2.rotationPointZ = this.RArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = -97.5 + (((tickAnim - 0) / 23) * (-0.25-(-97.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = -0.25 + (((tickAnim - 23) / 14) * (6.57-(-0.25)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 6.57 + (((tickAnim - 37) / 13) * (-97.5-(6.57)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RHand, RHand.rotateAngleX + (float) Math.toRadians(xx), RHand.rotateAngleY + (float) Math.toRadians(yy), RHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = -39.75 + (((tickAnim - 0) / 23) * (0-(-39.75)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (-39.75-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RClaw, RClaw.rotateAngleX + (float) Math.toRadians(xx), RClaw.rotateAngleY + (float) Math.toRadians(yy), RClaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(0), Body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+50))*-2.5), Body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*1.5));


        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*2), Tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*-3), Tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*2), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*2), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*2), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(TailClaw, TailClaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-250))*2), TailClaw.rotateAngleY + (float) Math.toRadians(0), TailClaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 109.20633 + (((tickAnim - 0) / 10) * (46.45423-(109.20633)));
            yy = 16.70701 + (((tickAnim - 0) / 10) * (19.38629-(16.70701)));
            zz = -105.41265 + (((tickAnim - 0) / 10) * (-79.40493-(-105.41265)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = 46.45423 + (((tickAnim - 10) / 12) * (-29.03915-(46.45423)));
            yy = 19.38629 + (((tickAnim - 10) / 12) * (27.62827-(19.38629)));
            zz = -79.40493 + (((tickAnim - 10) / 12) * (14.9605-(-79.40493)));
        }
        else if (tickAnim >= 22 && tickAnim < 50) {
            xx = -29.03915 + (((tickAnim - 22) / 28) * (109.20633-(-29.03915)));
            yy = 27.62827 + (((tickAnim - 22) / 28) * (16.70701-(27.62827)));
            zz = 14.9605 + (((tickAnim - 22) / 28) * (-105.41265-(14.9605)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LLeg, LLeg.rotateAngleX + (float) Math.toRadians(xx), LLeg.rotateAngleY + (float) Math.toRadians(yy), LLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -21.34406 + (((tickAnim - 0) / 10) * (-43.57087-(-21.34406)));
            yy = 18.77494 + (((tickAnim - 0) / 10) * (1.06714-(18.77494)));
            zz = -5.51936 + (((tickAnim - 0) / 10) * (26.00683-(-5.51936)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -43.57087 + (((tickAnim - 10) / 6) * (-30.75892-(-43.57087)));
            yy = 1.06714 + (((tickAnim - 10) / 6) * (-13.26753-(1.06714)));
            zz = 26.00683 + (((tickAnim - 10) / 6) * (37.14767-(26.00683)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -30.75892 + (((tickAnim - 16) / 6) * (-7.73788-(-30.75892)));
            yy = -13.26753 + (((tickAnim - 16) / 6) * (9.6294-(-13.26753)));
            zz = 37.14767 + (((tickAnim - 16) / 6) * (12.1351-(37.14767)));
        }
        else if (tickAnim >= 22 && tickAnim < 50) {
            xx = -7.73788 + (((tickAnim - 22) / 28) * (-21.34406-(-7.73788)));
            yy = 9.6294 + (((tickAnim - 22) / 28) * (18.77494-(9.6294)));
            zz = 12.1351 + (((tickAnim - 22) / 28) * (-5.51936-(12.1351)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LLeg3, LLeg3.rotateAngleX + (float) Math.toRadians(xx), LLeg3.rotateAngleY + (float) Math.toRadians(yy), LLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.LLeg3.rotationPointX = this.LLeg3.rotationPointX + (float)(0);
        this.LLeg3.rotationPointY = this.LLeg3.rotationPointY - (float)(0);
        this.LLeg3.rotationPointZ = this.LLeg3.rotationPointZ + (float)(-0.05);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 53 + (((tickAnim - 0) / 8) * (77.31-(53)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 77.31 + (((tickAnim - 8) / 8) * (5.25786-(77.31)));
            yy = 0 + (((tickAnim - 8) / 8) * (-0.66792-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (7.21933-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = 5.25786 + (((tickAnim - 16) / 6) * (34.5-(5.25786)));
            yy = -0.66792 + (((tickAnim - 16) / 6) * (0-(-0.66792)));
            zz = 7.21933 + (((tickAnim - 16) / 6) * (0-(7.21933)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 34.5 + (((tickAnim - 22) / 4) * (16.23755-(34.5)));
            yy = 0 + (((tickAnim - 22) / 4) * (-4.7685-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (20.21451-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 16.23755 + (((tickAnim - 26) / 5) * (-1.33529-(16.23755)));
            yy = -4.7685 + (((tickAnim - 26) / 5) * (-5.03553-(-4.7685)));
            zz = 20.21451 + (((tickAnim - 26) / 5) * (26.04224-(20.21451)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -1.33529 + (((tickAnim - 31) / 7) * (12.33157-(-1.33529)));
            yy = -5.03553 + (((tickAnim - 31) / 7) * (-12.51331-(-5.03553)));
            zz = 26.04224 + (((tickAnim - 31) / 7) * (22.0377-(26.04224)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 12.33157 + (((tickAnim - 38) / 12) * (53-(12.33157)));
            yy = -12.51331 + (((tickAnim - 38) / 12) * (0-(-12.51331)));
            zz = 22.0377 + (((tickAnim - 38) / 12) * (0-(22.0377)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LFoot, LFoot.rotateAngleX + (float) Math.toRadians(xx), LFoot.rotateAngleY + (float) Math.toRadians(yy), LFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0.65 + (((tickAnim - 0) / 22) * (0-(0.65)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0.09-(0)));
            yy = 0 + (((tickAnim - 22) / 4) * (0.65-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0.1-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = 0.09 + (((tickAnim - 26) / 12) * (0.325-(0.09)));
            yy = 0.65 + (((tickAnim - 26) / 12) * (0.35-(0.65)));
            zz = 0.1 + (((tickAnim - 26) / 12) * (0.38-(0.1)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0.325 + (((tickAnim - 38) / 12) * (0-(0.325)));
            yy = 0.35 + (((tickAnim - 38) / 12) * (0-(0.35)));
            zz = 0.38 + (((tickAnim - 38) / 12) * (0.65-(0.38)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LFoot.rotationPointX = this.LFoot.rotationPointX + (float)(xx);
        this.LFoot.rotationPointY = this.LFoot.rotationPointY - (float)(yy);
        this.LFoot.rotationPointZ = this.LFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = -26.0537 + (((tickAnim - 0) / 24) * (110.6884-(-26.0537)));
            yy = -33.35918 + (((tickAnim - 0) / 24) * (-18.45009-(-33.35918)));
            zz = -14.4365 + (((tickAnim - 0) / 24) * (107.73825-(-14.4365)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 110.6884 + (((tickAnim - 24) / 14) * (46.45423-(110.6884)));
            yy = -18.45009 + (((tickAnim - 24) / 14) * (-19.3863-(-18.45009)));
            zz = 107.73825 + (((tickAnim - 24) / 14) * (79.4049-(107.73825)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 46.45423 + (((tickAnim - 38) / 12) * (-26.0537-(46.45423)));
            yy = -19.3863 + (((tickAnim - 38) / 12) * (-33.35918-(-19.3863)));
            zz = 79.4049 + (((tickAnim - 38) / 12) * (-14.4365-(79.4049)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RLeg, RLeg.rotateAngleX + (float) Math.toRadians(xx), RLeg.rotateAngleY + (float) Math.toRadians(yy), RLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = -7.73788 + (((tickAnim - 0) / 24) * (-21.34406-(-7.73788)));
            yy = -9.62945 + (((tickAnim - 0) / 24) * (-18.7749-(-9.62945)));
            zz = -12.13506 + (((tickAnim - 0) / 24) * (5.5194-(-12.13506)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = -21.34406 + (((tickAnim - 24) / 14) * (-43.57087-(-21.34406)));
            yy = -18.7749 + (((tickAnim - 24) / 14) * (-1.0671-(-18.7749)));
            zz = 5.5194 + (((tickAnim - 24) / 14) * (-26.0068-(5.5194)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -43.57087 + (((tickAnim - 38) / 5) * (-30.75892-(-43.57087)));
            yy = -1.0671 + (((tickAnim - 38) / 5) * (13.2675-(-1.0671)));
            zz = -26.0068 + (((tickAnim - 38) / 5) * (-37.1477-(-26.0068)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -30.75892 + (((tickAnim - 43) / 7) * (-7.73788-(-30.75892)));
            yy = 13.2675 + (((tickAnim - 43) / 7) * (-9.62945-(13.2675)));
            zz = -37.1477 + (((tickAnim - 43) / 7) * (-12.13506-(-37.1477)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RLeg2, RLeg2.rotateAngleX + (float) Math.toRadians(xx), RLeg2.rotateAngleY + (float) Math.toRadians(yy), RLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0.25 + (((tickAnim - 0) / 50) * (0.25-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RLeg2.rotationPointX = this.RLeg2.rotationPointX + (float)(xx);
        this.RLeg2.rotationPointY = this.RLeg2.rotationPointY - (float)(yy);
        this.RLeg2.rotationPointZ = this.RLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 24.75 + (((tickAnim - 0) / 8) * (-8.23371-(24.75)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.7543-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-26.69665-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 24) {
            xx = -8.23371 + (((tickAnim - 8) / 16) * (53-(-8.23371)));
            yy = -1.7543 + (((tickAnim - 8) / 16) * (0-(-1.7543)));
            zz = -26.69665 + (((tickAnim - 8) / 16) * (0-(-26.69665)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 53 + (((tickAnim - 24) / 11) * (77.31-(53)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 42) {
            xx = 77.31 + (((tickAnim - 35) / 7) * (25.38994-(77.31)));
            yy = 0 + (((tickAnim - 35) / 7) * (-1.08743-(0)));
            zz = 0 + (((tickAnim - 35) / 7) * (-6.07085-(0)));
        }
        else if (tickAnim >= 42 && tickAnim < 45) {
            xx = 25.38994 + (((tickAnim - 42) / 3) * (12.17991-(25.38994)));
            yy = -1.08743 + (((tickAnim - 42) / 3) * (-1.63115-(-1.08743)));
            zz = -6.07085 + (((tickAnim - 42) / 3) * (-9.10628-(-6.07085)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 12.17991 + (((tickAnim - 45) / 5) * (24.75-(12.17991)));
            yy = -1.63115 + (((tickAnim - 45) / 5) * (0-(-1.63115)));
            zz = -9.10628 + (((tickAnim - 45) / 5) * (0-(-9.10628)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RFoot, RFoot.rotateAngleX + (float) Math.toRadians(xx), RFoot.rotateAngleY + (float) Math.toRadians(yy), RFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 2) * (0.78-(0.15)));
            zz = 0.65 + (((tickAnim - 0) / 2) * (0.65-(0.65)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.78 + (((tickAnim - 2) / 2) * (1.13-(0.78)));
            zz = 0.65 + (((tickAnim - 2) / 2) * (0.65-(0.65)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 1.13 + (((tickAnim - 4) / 4) * (1.15-(1.13)));
            zz = 0.65 + (((tickAnim - 4) / 4) * (0.65-(0.65)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (-0.35-(0)));
            yy = 1.15 + (((tickAnim - 8) / 7) * (0.46-(1.15)));
            zz = 0.65 + (((tickAnim - 8) / 7) * (1.275-(0.65)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -0.35 + (((tickAnim - 15) / 9) * (0-(-0.35)));
            yy = 0.46 + (((tickAnim - 15) / 9) * (0-(0.46)));
            zz = 1.275 + (((tickAnim - 15) / 9) * (0.65-(1.275)));
        }
        else if (tickAnim >= 24 && tickAnim < 42) {
            xx = 0 + (((tickAnim - 24) / 18) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 18) * (1.175-(0)));
            zz = 0.65 + (((tickAnim - 24) / 18) * (0.65-(0.65)));
        }
        else if (tickAnim >= 42 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 42) / 8) * (0-(0)));
            yy = 1.175 + (((tickAnim - 42) / 8) * (0.15-(1.175)));
            zz = 0.65 + (((tickAnim - 42) / 8) * (0.65-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RFoot.rotationPointX = this.RFoot.rotationPointX + (float)(xx);
        this.RFoot.rotationPointY = this.RFoot.rotationPointY - (float)(yy);
        this.RFoot.rotationPointZ = this.RFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (39.75-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 39.75 + (((tickAnim - 23) / 27) * (0-(39.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LClaw, LClaw.rotateAngleX + (float) Math.toRadians(xx), LClaw.rotateAngleY + (float) Math.toRadians(yy), LClaw.rotateAngleZ + (float) Math.toRadians(zz));


    }

    public void animWalk(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDrepanosaurus entity = (EntityPrehistoricFloraDrepanosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Drepanosaurus, Drepanosaurus.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5+50))*0.5), Drepanosaurus.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*2), Drepanosaurus.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+20))));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1 + (((tickAnim - 0) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1)));
            yy = -0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-10))*0.2 + (((tickAnim - 0) / 4) * (-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-10))*0.2-(-0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-10))*0.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.5 + (((tickAnim - 0) / 4) * (-0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1 + (((tickAnim - 4) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1)));
            yy = -0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-10))*0.2 + (((tickAnim - 4) / 10) * (0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-40))*0.2-(-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-10))*0.2)));
            zz = -0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.5 + (((tickAnim - 4) / 10) * (-0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.5-(-0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1 + (((tickAnim - 14) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1)));
            yy = 0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-40))*0.2 + (((tickAnim - 14) / 7) * (0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-40))*0.2-(0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-40))*0.2)));
            zz = -0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.5 + (((tickAnim - 14) / 7) * (0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144-80))*-0.5-(-0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.5)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1 + (((tickAnim - 21) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1)));
            yy = 0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-40))*0.2 + (((tickAnim - 21) / 7) * (0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-10))*0.1-(0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-40))*0.2)));
            zz = 0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144-80))*-0.5 + (((tickAnim - 21) / 7) * (0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*-0.5-(0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144-80))*-0.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 45) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1 + (((tickAnim - 28) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1)));
            yy = 0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-10))*0.1 + (((tickAnim - 28) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5+80))*-0.15-(0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-10))*0.1)));
            zz = 0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*-0.5 + (((tickAnim - 28) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*144+50))*-0.275-(0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*-0.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1 + (((tickAnim - 45) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5+80))*-0.15 + (((tickAnim - 45) / 5) * (-0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-10))*0.2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5+80))*-0.15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*144+50))*-0.275 + (((tickAnim - 45) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*144+50))*-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Drepanosaurus.rotationPointX = this.Drepanosaurus.rotationPointX + (float)(xx);
        this.Drepanosaurus.rotationPointY = this.Drepanosaurus.rotationPointY - (float)(yy);
        this.Drepanosaurus.rotationPointZ = this.Drepanosaurus.rotationPointZ + (float)(zz);



        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-2.5), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+70))*1.5));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(0);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0);


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*-2.5), Neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+130))*1.5));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0), Neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*2.5), Neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+170))*1.5));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(0), Neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*2.5), Neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+220))*1.5));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-250))*-2.5), Head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+270))*1.5));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -0.86758 + (((tickAnim - 0) / 10) * (-1.90403-(-0.86758)));
            yy = -5.96045 + (((tickAnim - 0) / 10) * (5.49255-(-5.96045)));
            zz = 28.77217 + (((tickAnim - 0) / 10) * (23.42356-(28.77217)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -1.90403 + (((tickAnim - 10) / 13) * (24.38805-(-1.90403)));
            yy = 5.49255 + (((tickAnim - 10) / 13) * (10.8756-(5.49255)));
            zz = 23.42356 + (((tickAnim - 10) / 13) * (6.6951-(23.42356)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 24.38805 + (((tickAnim - 23) / 27) * (-0.86758-(24.38805)));
            yy = 10.8756 + (((tickAnim - 23) / 27) * (-5.96045-(10.8756)));
            zz = 6.6951 + (((tickAnim - 23) / 27) * (28.77217-(6.6951)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LArm2, LArm2.rotateAngleX + (float) Math.toRadians(xx), LArm2.rotateAngleY + (float) Math.toRadians(yy), LArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -0.025 + (((tickAnim - 0) / 10) * (0-(-0.025)));
            yy = -1 + (((tickAnim - 0) / 10) * (0-(-1)));
            zz = 0.25 + (((tickAnim - 0) / 10) * (0-(0.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0.05-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0.325-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0.575-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0.05 + (((tickAnim - 23) / 27) * (-0.025-(0.05)));
            yy = 0.325 + (((tickAnim - 23) / 27) * (-1-(0.325)));
            zz = 0.575 + (((tickAnim - 23) / 27) * (0.25-(0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LArm2.rotationPointX = this.LArm2.rotationPointX + (float)(xx);
        this.LArm2.rotationPointY = this.LArm2.rotationPointY - (float)(yy);
        this.LArm2.rotationPointZ = this.LArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -0.25 + (((tickAnim - 0) / 10) * (0.89-(-0.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0.89 + (((tickAnim - 10) / 13) * (97.5-(0.89)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            zz = 97.5 + (((tickAnim - 23) / 15) * (89.77-(97.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 89.77 + (((tickAnim - 38) / 12) * (-0.25-(89.77)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LHand, LHand.rotateAngleX + (float) Math.toRadians(xx), LHand.rotateAngleY + (float) Math.toRadians(yy), LHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 50) * (0.15-(0.15)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LHand.rotationPointX = this.LHand.rotationPointX + (float)(xx);
        this.LHand.rotationPointY = this.LHand.rotationPointY - (float)(yy);
        this.LHand.rotationPointZ = this.LHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 24.38805 + (((tickAnim - 0) / 23) * (-0.86758-(24.38805)));
            yy = -10.87558 + (((tickAnim - 0) / 23) * (5.9604-(-10.87558)));
            zz = -6.69511 + (((tickAnim - 0) / 23) * (-28.7722-(-6.69511)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = -0.86758 + (((tickAnim - 23) / 14) * (2.89824-(-0.86758)));
            yy = 5.9604 + (((tickAnim - 23) / 14) * (-48.97743-(5.9604)));
            zz = -28.7722 + (((tickAnim - 23) / 14) * (-23.4624-(-28.7722)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 2.89824 + (((tickAnim - 37) / 13) * (24.38805-(2.89824)));
            yy = -48.97743 + (((tickAnim - 37) / 13) * (-10.87558-(-48.97743)));
            zz = -23.4624 + (((tickAnim - 37) / 13) * (-6.69511-(-23.4624)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RArm2, RArm2.rotateAngleX + (float) Math.toRadians(xx), RArm2.rotateAngleY + (float) Math.toRadians(yy), RArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0.05 + (((tickAnim - 0) / 6) * (0.03-(0.05)));
            yy = 0.325 + (((tickAnim - 0) / 6) * (-0.02-(0.325)));
            zz = 0.575 + (((tickAnim - 0) / 6) * (1.125-(0.575)));
        }
        else if (tickAnim >= 6 && tickAnim < 23) {
            xx = 0.03 + (((tickAnim - 6) / 17) * (-0.025-(0.03)));
            yy = -0.02 + (((tickAnim - 6) / 17) * (-1-(-0.02)));
            zz = 1.125 + (((tickAnim - 6) / 17) * (0.475-(1.125)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -0.025 + (((tickAnim - 23) / 8) * (0-(-0.025)));
            yy = -1 + (((tickAnim - 23) / 8) * (0-(-1)));
            zz = 0.475 + (((tickAnim - 23) / 8) * (0-(0.475)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 6) * (-1.425-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0.05-(0)));
            yy = 0 + (((tickAnim - 37) / 13) * (0.325-(0)));
            zz = -1.425 + (((tickAnim - 37) / 13) * (0.575-(-1.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RArm2.rotationPointX = this.RArm2.rotationPointX + (float)(xx);
        this.RArm2.rotationPointY = this.RArm2.rotationPointY - (float)(yy);
        this.RArm2.rotationPointZ = this.RArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = -97.5 + (((tickAnim - 0) / 23) * (-0.25-(-97.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = -0.25 + (((tickAnim - 23) / 14) * (6.57-(-0.25)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 6.57 + (((tickAnim - 37) / 13) * (-97.5-(6.57)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RHand, RHand.rotateAngleX + (float) Math.toRadians(xx), RHand.rotateAngleY + (float) Math.toRadians(yy), RHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = -39.75 + (((tickAnim - 0) / 23) * (0-(-39.75)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (-39.75-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RClaw, RClaw.rotateAngleX + (float) Math.toRadians(xx), RClaw.rotateAngleY + (float) Math.toRadians(yy), RClaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(0), Body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+50))*-2.5), Body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*1.5));


        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*2), Tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*-3), Tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*2), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*2), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*2), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(TailClaw, TailClaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-250))*2), TailClaw.rotateAngleY + (float) Math.toRadians(0), TailClaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 102.06247 + (((tickAnim - 0) / 10) * (46.45423-(102.06247)));
            yy = 10.43409 + (((tickAnim - 0) / 10) * (19.38629-(10.43409)));
            zz = -95.08158 + (((tickAnim - 0) / 10) * (-79.40493-(-95.08158)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = 46.45423 + (((tickAnim - 10) / 12) * (-6.8037-(46.45423)));
            yy = 19.38629 + (((tickAnim - 10) / 12) * (33.3592-(19.38629)));
            zz = -79.40493 + (((tickAnim - 10) / 12) * (14.4365-(-79.40493)));
        }
        else if (tickAnim >= 22 && tickAnim < 50) {
            xx = -6.8037 + (((tickAnim - 22) / 28) * (102.06247-(-6.8037)));
            yy = 33.3592 + (((tickAnim - 22) / 28) * (10.43409-(33.3592)));
            zz = 14.4365 + (((tickAnim - 22) / 28) * (-95.08158-(14.4365)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LLeg, LLeg.rotateAngleX + (float) Math.toRadians(xx), LLeg.rotateAngleY + (float) Math.toRadians(yy), LLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -21.34406 + (((tickAnim - 0) / 10) * (-43.57087-(-21.34406)));
            yy = 18.77494 + (((tickAnim - 0) / 10) * (1.06714-(18.77494)));
            zz = -5.51936 + (((tickAnim - 0) / 10) * (26.00683-(-5.51936)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -43.57087 + (((tickAnim - 10) / 6) * (-30.75892-(-43.57087)));
            yy = 1.06714 + (((tickAnim - 10) / 6) * (-13.26753-(1.06714)));
            zz = 26.00683 + (((tickAnim - 10) / 6) * (37.14767-(26.00683)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -30.75892 + (((tickAnim - 16) / 6) * (-7.73788-(-30.75892)));
            yy = -13.26753 + (((tickAnim - 16) / 6) * (9.6294-(-13.26753)));
            zz = 37.14767 + (((tickAnim - 16) / 6) * (12.1351-(37.14767)));
        }
        else if (tickAnim >= 22 && tickAnim < 50) {
            xx = -7.73788 + (((tickAnim - 22) / 28) * (-21.34406-(-7.73788)));
            yy = 9.6294 + (((tickAnim - 22) / 28) * (18.77494-(9.6294)));
            zz = 12.1351 + (((tickAnim - 22) / 28) * (-5.51936-(12.1351)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LLeg3, LLeg3.rotateAngleX + (float) Math.toRadians(xx), LLeg3.rotateAngleY + (float) Math.toRadians(yy), LLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.LLeg3.rotationPointX = this.LLeg3.rotationPointX + (float)(0);
        this.LLeg3.rotationPointY = this.LLeg3.rotationPointY - (float)(0);
        this.LLeg3.rotationPointZ = this.LLeg3.rotationPointZ + (float)(-0.05);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 53 + (((tickAnim - 0) / 8) * (77.31-(53)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 77.31 + (((tickAnim - 8) / 8) * (-10.2-(77.31)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -10.2 + (((tickAnim - 16) / 6) * (11.25-(-10.2)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 11.25 + (((tickAnim - 22) / 4) * (0.68636-(11.25)));
            yy = 0 + (((tickAnim - 22) / 4) * (-4.46014-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (13.4846-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0.68636 + (((tickAnim - 26) / 5) * (-1.33529-(0.68636)));
            yy = -4.46014 + (((tickAnim - 26) / 5) * (-5.03553-(-4.46014)));
            zz = 13.4846 + (((tickAnim - 26) / 5) * (26.04224-(13.4846)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -1.33529 + (((tickAnim - 31) / 7) * (12.33157-(-1.33529)));
            yy = -5.03553 + (((tickAnim - 31) / 7) * (-12.51331-(-5.03553)));
            zz = 26.04224 + (((tickAnim - 31) / 7) * (22.0377-(26.04224)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 12.33157 + (((tickAnim - 38) / 12) * (53-(12.33157)));
            yy = -12.51331 + (((tickAnim - 38) / 12) * (0-(-12.51331)));
            zz = 22.0377 + (((tickAnim - 38) / 12) * (0-(22.0377)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LFoot, LFoot.rotateAngleX + (float) Math.toRadians(xx), LFoot.rotateAngleY + (float) Math.toRadians(yy), LFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0.65 + (((tickAnim - 0) / 22) * (0-(0.65)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0.09-(0)));
            yy = 0 + (((tickAnim - 22) / 4) * (0.65-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0.1-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = 0.09 + (((tickAnim - 26) / 12) * (0.325-(0.09)));
            yy = 0.65 + (((tickAnim - 26) / 12) * (0.35-(0.65)));
            zz = 0.1 + (((tickAnim - 26) / 12) * (0.38-(0.1)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0.325 + (((tickAnim - 38) / 12) * (0-(0.325)));
            yy = 0.35 + (((tickAnim - 38) / 12) * (0-(0.35)));
            zz = 0.38 + (((tickAnim - 38) / 12) * (0.65-(0.38)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LFoot.rotationPointX = this.LFoot.rotationPointX + (float)(xx);
        this.LFoot.rotationPointY = this.LFoot.rotationPointY - (float)(yy);
        this.LFoot.rotationPointZ = this.LFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = -6.8037 + (((tickAnim - 0) / 24) * (102.06247-(-6.8037)));
            yy = -33.35918 + (((tickAnim - 0) / 24) * (-10.4341-(-33.35918)));
            zz = -14.4365 + (((tickAnim - 0) / 24) * (95.0816-(-14.4365)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 102.06247 + (((tickAnim - 24) / 14) * (46.45423-(102.06247)));
            yy = -10.4341 + (((tickAnim - 24) / 14) * (-19.3863-(-10.4341)));
            zz = 95.0816 + (((tickAnim - 24) / 14) * (79.4049-(95.0816)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 46.45423 + (((tickAnim - 38) / 12) * (-6.8037-(46.45423)));
            yy = -19.3863 + (((tickAnim - 38) / 12) * (-33.35918-(-19.3863)));
            zz = 79.4049 + (((tickAnim - 38) / 12) * (-14.4365-(79.4049)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RLeg, RLeg.rotateAngleX + (float) Math.toRadians(xx), RLeg.rotateAngleY + (float) Math.toRadians(yy), RLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = -7.73788 + (((tickAnim - 0) / 24) * (-21.34406-(-7.73788)));
            yy = -9.62945 + (((tickAnim - 0) / 24) * (-18.7749-(-9.62945)));
            zz = -12.13506 + (((tickAnim - 0) / 24) * (5.5194-(-12.13506)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = -21.34406 + (((tickAnim - 24) / 14) * (-43.57087-(-21.34406)));
            yy = -18.7749 + (((tickAnim - 24) / 14) * (-1.0671-(-18.7749)));
            zz = 5.5194 + (((tickAnim - 24) / 14) * (-26.0068-(5.5194)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -43.57087 + (((tickAnim - 38) / 5) * (-30.75892-(-43.57087)));
            yy = -1.0671 + (((tickAnim - 38) / 5) * (13.2675-(-1.0671)));
            zz = -26.0068 + (((tickAnim - 38) / 5) * (-37.1477-(-26.0068)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -30.75892 + (((tickAnim - 43) / 7) * (-7.73788-(-30.75892)));
            yy = 13.2675 + (((tickAnim - 43) / 7) * (-9.62945-(13.2675)));
            zz = -37.1477 + (((tickAnim - 43) / 7) * (-12.13506-(-37.1477)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RLeg2, RLeg2.rotateAngleX + (float) Math.toRadians(xx), RLeg2.rotateAngleY + (float) Math.toRadians(yy), RLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0.25 + (((tickAnim - 0) / 50) * (0.25-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RLeg2.rotationPointX = this.RLeg2.rotationPointX + (float)(xx);
        this.RLeg2.rotationPointY = this.RLeg2.rotationPointY - (float)(yy);
        this.RLeg2.rotationPointZ = this.RLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 7.25 + (((tickAnim - 0) / 8) * (-8.23371-(7.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.7543-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-26.69665-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 24) {
            xx = -8.23371 + (((tickAnim - 8) / 16) * (53-(-8.23371)));
            yy = -1.7543 + (((tickAnim - 8) / 16) * (0-(-1.7543)));
            zz = -26.69665 + (((tickAnim - 8) / 16) * (0-(-26.69665)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 53 + (((tickAnim - 24) / 11) * (77.31-(53)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 77.31 + (((tickAnim - 35) / 10) * (-10.2-(77.31)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -10.2 + (((tickAnim - 45) / 5) * (7.25-(-10.2)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RFoot, RFoot.rotateAngleX + (float) Math.toRadians(xx), RFoot.rotateAngleY + (float) Math.toRadians(yy), RFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 2) * (0.43-(0.15)));
            zz = 0.65 + (((tickAnim - 0) / 2) * (0.65-(0.65)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.43 + (((tickAnim - 2) / 2) * (0.535-(0.43)));
            zz = 0.65 + (((tickAnim - 2) / 2) * (0.65-(0.65)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.535 + (((tickAnim - 4) / 4) * (0.275-(0.535)));
            zz = 0.65 + (((tickAnim - 4) / 4) * (0.65-(0.65)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (-0.35-(0)));
            yy = 0.275 + (((tickAnim - 8) / 7) * (0.46-(0.275)));
            zz = 0.65 + (((tickAnim - 8) / 7) * (1.275-(0.65)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -0.35 + (((tickAnim - 15) / 9) * (0-(-0.35)));
            yy = 0.46 + (((tickAnim - 15) / 9) * (0-(0.46)));
            zz = 1.275 + (((tickAnim - 15) / 9) * (0.65-(1.275)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 26) * (0.15-(0)));
            zz = 0.65 + (((tickAnim - 24) / 26) * (0.65-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RFoot.rotationPointX = this.RFoot.rotationPointX + (float)(xx);
        this.RFoot.rotationPointY = this.RFoot.rotationPointY - (float)(yy);
        this.RFoot.rotationPointZ = this.RFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (39.75-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 39.75 + (((tickAnim - 23) / 27) * (0-(39.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LClaw, LClaw.rotateAngleX + (float) Math.toRadians(xx), LClaw.rotateAngleY + (float) Math.toRadians(yy), LClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (24.24281-(0)));
            yy = 75 + (((tickAnim - 0) / 23) * (18.4871+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(75)));
            zz = 0 + (((tickAnim - 0) / 23) * (-0.77585-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 24.24281 + (((tickAnim - 23) / 15) * (-25.7103+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4-(24.24281)));
            yy = 18.4871+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 23) / 15) * (17.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-15-(18.4871+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            zz = -0.77585 + (((tickAnim - 23) / 15) * (-43.1638+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(-0.77585)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -25.7103+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4 + (((tickAnim - 38) / 12) * (0-(-25.7103+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4)));
            yy = 17.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-15 + (((tickAnim - 38) / 12) * (75-(17.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-15)));
            zz = -43.1638+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 38) / 12) * (0-(-43.1638+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone, bone.rotateAngleX + (float) Math.toRadians(xx), bone.rotateAngleY + (float) Math.toRadians(yy), bone.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 10.75 + (((tickAnim - 0) / 10) * (-16.1194+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15-(10.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (-35.86739-(0)));
            zz = 27.75 + (((tickAnim - 0) / 10) * (45.1628+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*-20-(27.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -16.1194+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15 + (((tickAnim - 10) / 13) * (0-(-16.1194+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15)));
            yy = -35.86739 + (((tickAnim - 10) / 13) * (-73.75-(-35.86739)));
            zz = 45.1628+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*-20 + (((tickAnim - 10) / 13) * (0-(45.1628+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*-20)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (10.75-(0)));
            yy = -73.75 + (((tickAnim - 23) / 27) * (0-(-73.75)));
            zz = 0 + (((tickAnim - 23) / 27) * (27.75-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone3, bone3.rotateAngleX + (float) Math.toRadians(xx), bone3.rotateAngleY + (float) Math.toRadians(yy), bone3.rotateAngleZ + (float) Math.toRadians(zz));


    }



    public void animRun(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraDrepanosaurus entity = (EntityPrehistoricFloraDrepanosaurus) entitylivingbaseIn;
        int animCycle = 50;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        tickAnim = tickAnim * 3;
        if (tickAnim > 50) {
            tickAnim = tickAnim - 50;
        }
        if (tickAnim > 50) {
            tickAnim = tickAnim - 50;
        }
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(Drepanosaurus, Drepanosaurus.rotateAngleX + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144/0.5+50))*0.5), Drepanosaurus.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*2), Drepanosaurus.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+20))));

        if (tickAnim >= 0 && tickAnim < 4) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1 + (((tickAnim - 0) / 4) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1)));
            yy = -0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-10))*0.2 + (((tickAnim - 0) / 4) * (-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-10))*0.2-(-0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-10))*0.2)));
            zz = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.5 + (((tickAnim - 0) / 4) * (-0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.5-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.5)));
        }
        else if (tickAnim >= 4 && tickAnim < 14) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1 + (((tickAnim - 4) / 10) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1)));
            yy = -0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-10))*0.2 + (((tickAnim - 4) / 10) * (0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-40))*0.2-(-0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-10))*0.2)));
            zz = -0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.5 + (((tickAnim - 4) / 10) * (-0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.5-(-0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.5)));
        }
        else if (tickAnim >= 14 && tickAnim < 21) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1 + (((tickAnim - 14) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1)));
            yy = 0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-40))*0.2 + (((tickAnim - 14) / 7) * (0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-40))*0.2-(0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-40))*0.2)));
            zz = -0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.5 + (((tickAnim - 14) / 7) * (0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144-80))*-0.5-(-0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.5)));
        }
        else if (tickAnim >= 21 && tickAnim < 28) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1 + (((tickAnim - 21) / 7) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1)));
            yy = 0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-40))*0.2 + (((tickAnim - 21) / 7) * (0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-10))*0.1-(0.1+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-40))*0.2)));
            zz = 0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144-80))*-0.5 + (((tickAnim - 21) / 7) * (0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*-0.5-(0.325+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144-80))*-0.5)));
        }
        else if (tickAnim >= 28 && tickAnim < 45) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1 + (((tickAnim - 28) / 17) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1)));
            yy = 0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-10))*0.1 + (((tickAnim - 28) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5+80))*-0.15-(0.125+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-10))*0.1)));
            zz = 0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*-0.5 + (((tickAnim - 28) / 17) * (Math.sin((Math.PI/180)*(((double)tickAnim/20)*144+50))*-0.275-(0.025+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*-0.5)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = 0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1 + (((tickAnim - 45) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1-(0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.1)));
            yy = Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5+80))*-0.15 + (((tickAnim - 45) / 5) * (-0.075+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5-10))*0.2-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*144/0.5+80))*-0.15)));
            zz = Math.sin((Math.PI/180)*(((double)tickAnim/20)*144+50))*-0.275 + (((tickAnim - 45) / 5) * (0+Math.sin((Math.PI/180)*(((double)tickAnim/20)*144))*0.5-(Math.sin((Math.PI/180)*(((double)tickAnim/20)*144+50))*-0.275)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.Drepanosaurus.rotationPointX = this.Drepanosaurus.rotationPointX + (float)(xx);
        this.Drepanosaurus.rotationPointY = this.Drepanosaurus.rotationPointY - (float)(yy);
        this.Drepanosaurus.rotationPointZ = this.Drepanosaurus.rotationPointZ + (float)(zz);



        this.setRotateAngle(Body, Body.rotateAngleX + (float) Math.toRadians(0), Body.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*-2.5), Body.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+70))*1.5));
        this.Body.rotationPointX = this.Body.rotationPointX + (float)(0);
        this.Body.rotationPointY = this.Body.rotationPointY - (float)(0);
        this.Body.rotationPointZ = this.Body.rotationPointZ + (float)(0);


        this.setRotateAngle(Neck, Neck.rotateAngleX + (float) Math.toRadians(0), Neck.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-100))*-2.5), Neck.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+130))*1.5));


        this.setRotateAngle(Neck2, Neck2.rotateAngleX + (float) Math.toRadians(0), Neck2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*2.5), Neck2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+170))*1.5));


        this.setRotateAngle(Neck3, Neck3.rotateAngleX + (float) Math.toRadians(0), Neck3.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*2.5), Neck3.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+220))*1.5));


        this.setRotateAngle(Head, Head.rotateAngleX + (float) Math.toRadians(0), Head.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-250))*-2.5), Head.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+270))*1.5));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -0.86758 + (((tickAnim - 0) / 10) * (-1.90403-(-0.86758)));
            yy = -5.96045 + (((tickAnim - 0) / 10) * (5.49255-(-5.96045)));
            zz = 28.77217 + (((tickAnim - 0) / 10) * (23.42356-(28.77217)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -1.90403 + (((tickAnim - 10) / 13) * (24.38805-(-1.90403)));
            yy = 5.49255 + (((tickAnim - 10) / 13) * (10.8756-(5.49255)));
            zz = 23.42356 + (((tickAnim - 10) / 13) * (6.6951-(23.42356)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 24.38805 + (((tickAnim - 23) / 27) * (-0.86758-(24.38805)));
            yy = 10.8756 + (((tickAnim - 23) / 27) * (-5.96045-(10.8756)));
            zz = 6.6951 + (((tickAnim - 23) / 27) * (28.77217-(6.6951)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LArm2, LArm2.rotateAngleX + (float) Math.toRadians(xx), LArm2.rotateAngleY + (float) Math.toRadians(yy), LArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -0.025 + (((tickAnim - 0) / 10) * (0-(-0.025)));
            yy = -1 + (((tickAnim - 0) / 10) * (0-(-1)));
            zz = 0.25 + (((tickAnim - 0) / 10) * (0-(0.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0.05-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0.325-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (0.575-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0.05 + (((tickAnim - 23) / 27) * (-0.025-(0.05)));
            yy = 0.325 + (((tickAnim - 23) / 27) * (-1-(0.325)));
            zz = 0.575 + (((tickAnim - 23) / 27) * (0.25-(0.575)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LArm2.rotationPointX = this.LArm2.rotationPointX + (float)(xx);
        this.LArm2.rotationPointY = this.LArm2.rotationPointY - (float)(yy);
        this.LArm2.rotationPointZ = this.LArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = -0.25 + (((tickAnim - 0) / 10) * (0.89-(-0.25)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0.89 + (((tickAnim - 10) / 13) * (97.5-(0.89)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 15) * (0-(0)));
            zz = 97.5 + (((tickAnim - 23) / 15) * (89.77-(97.5)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            yy = 0 + (((tickAnim - 38) / 12) * (0-(0)));
            zz = 89.77 + (((tickAnim - 38) / 12) * (-0.25-(89.77)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LHand, LHand.rotateAngleX + (float) Math.toRadians(xx), LHand.rotateAngleY + (float) Math.toRadians(yy), LHand.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 50) * (0.15-(0.15)));
            zz = 0 + (((tickAnim - 0) / 50) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LHand.rotationPointX = this.LHand.rotationPointX + (float)(xx);
        this.LHand.rotationPointY = this.LHand.rotationPointY - (float)(yy);
        this.LHand.rotationPointZ = this.LHand.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 24.38805 + (((tickAnim - 0) / 23) * (-0.86758-(24.38805)));
            yy = -10.87558 + (((tickAnim - 0) / 23) * (5.9604-(-10.87558)));
            zz = -6.69511 + (((tickAnim - 0) / 23) * (-28.7722-(-6.69511)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = -0.86758 + (((tickAnim - 23) / 14) * (2.89824-(-0.86758)));
            yy = 5.9604 + (((tickAnim - 23) / 14) * (-48.97743-(5.9604)));
            zz = -28.7722 + (((tickAnim - 23) / 14) * (-23.4624-(-28.7722)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 2.89824 + (((tickAnim - 37) / 13) * (24.38805-(2.89824)));
            yy = -48.97743 + (((tickAnim - 37) / 13) * (-10.87558-(-48.97743)));
            zz = -23.4624 + (((tickAnim - 37) / 13) * (-6.69511-(-23.4624)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RArm2, RArm2.rotateAngleX + (float) Math.toRadians(xx), RArm2.rotateAngleY + (float) Math.toRadians(yy), RArm2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 6) {
            xx = 0.05 + (((tickAnim - 0) / 6) * (0.03-(0.05)));
            yy = 0.325 + (((tickAnim - 0) / 6) * (-0.02-(0.325)));
            zz = 0.575 + (((tickAnim - 0) / 6) * (1.125-(0.575)));
        }
        else if (tickAnim >= 6 && tickAnim < 23) {
            xx = 0.03 + (((tickAnim - 6) / 17) * (-0.025-(0.03)));
            yy = -0.02 + (((tickAnim - 6) / 17) * (-1-(-0.02)));
            zz = 1.125 + (((tickAnim - 6) / 17) * (0.475-(1.125)));
        }
        else if (tickAnim >= 23 && tickAnim < 31) {
            xx = -0.025 + (((tickAnim - 23) / 8) * (0-(-0.025)));
            yy = -1 + (((tickAnim - 23) / 8) * (0-(-1)));
            zz = 0.475 + (((tickAnim - 23) / 8) * (0-(0.475)));
        }
        else if (tickAnim >= 31 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            yy = 0 + (((tickAnim - 31) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 31) / 6) * (-1.425-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0.05-(0)));
            yy = 0 + (((tickAnim - 37) / 13) * (0.325-(0)));
            zz = -1.425 + (((tickAnim - 37) / 13) * (0.575-(-1.425)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RArm2.rotationPointX = this.RArm2.rotationPointX + (float)(xx);
        this.RArm2.rotationPointY = this.RArm2.rotationPointY - (float)(yy);
        this.RArm2.rotationPointZ = this.RArm2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = -97.5 + (((tickAnim - 0) / 23) * (-0.25-(-97.5)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = -0.25 + (((tickAnim - 23) / 14) * (6.57-(-0.25)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 6.57 + (((tickAnim - 37) / 13) * (-97.5-(6.57)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RHand, RHand.rotateAngleX + (float) Math.toRadians(xx), RHand.rotateAngleY + (float) Math.toRadians(yy), RHand.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 23) * (0-(0)));
            zz = -39.75 + (((tickAnim - 0) / 23) * (0-(-39.75)));
        }
        else if (tickAnim >= 23 && tickAnim < 37) {
            xx = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 14) * (0-(0)));
            zz = 0 + (((tickAnim - 23) / 14) * (0-(0)));
        }
        else if (tickAnim >= 37 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 37) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 37) / 13) * (-39.75-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RClaw, RClaw.rotateAngleX + (float) Math.toRadians(xx), RClaw.rotateAngleY + (float) Math.toRadians(yy), RClaw.rotateAngleZ + (float) Math.toRadians(zz));



        this.setRotateAngle(Body2, Body2.rotateAngleX + (float) Math.toRadians(0), Body2.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144+50))*-2.5), Body2.rotateAngleZ + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*1.5));


        this.setRotateAngle(Tail, Tail.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*2), Tail.rotateAngleY + (float) Math.toRadians(0+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144))*-3), Tail.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail2, Tail2.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-50))*2), Tail2.rotateAngleY + (float) Math.toRadians(0), Tail2.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail3, Tail3.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-150))*2), Tail3.rotateAngleY + (float) Math.toRadians(0), Tail3.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(Tail4, Tail4.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-200))*2), Tail4.rotateAngleY + (float) Math.toRadians(0), Tail4.rotateAngleZ + (float) Math.toRadians(0));


        this.setRotateAngle(TailClaw, TailClaw.rotateAngleX + (float) Math.toRadians(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*144-250))*2), TailClaw.rotateAngleY + (float) Math.toRadians(0), TailClaw.rotateAngleZ + (float) Math.toRadians(0));



        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 102.06247 + (((tickAnim - 0) / 10) * (46.45423-(102.06247)));
            yy = 10.43409 + (((tickAnim - 0) / 10) * (19.38629-(10.43409)));
            zz = -95.08158 + (((tickAnim - 0) / 10) * (-79.40493-(-95.08158)));
        }
        else if (tickAnim >= 10 && tickAnim < 22) {
            xx = 46.45423 + (((tickAnim - 10) / 12) * (-6.8037-(46.45423)));
            yy = 19.38629 + (((tickAnim - 10) / 12) * (33.3592-(19.38629)));
            zz = -79.40493 + (((tickAnim - 10) / 12) * (14.4365-(-79.40493)));
        }
        else if (tickAnim >= 22 && tickAnim < 50) {
            xx = -6.8037 + (((tickAnim - 22) / 28) * (102.06247-(-6.8037)));
            yy = 33.3592 + (((tickAnim - 22) / 28) * (10.43409-(33.3592)));
            zz = 14.4365 + (((tickAnim - 22) / 28) * (-95.08158-(14.4365)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LLeg, LLeg.rotateAngleX + (float) Math.toRadians(xx), LLeg.rotateAngleY + (float) Math.toRadians(yy), LLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = -21.34406 + (((tickAnim - 0) / 10) * (-43.57087-(-21.34406)));
            yy = 18.77494 + (((tickAnim - 0) / 10) * (1.06714-(18.77494)));
            zz = -5.51936 + (((tickAnim - 0) / 10) * (26.00683-(-5.51936)));
        }
        else if (tickAnim >= 10 && tickAnim < 16) {
            xx = -43.57087 + (((tickAnim - 10) / 6) * (-30.75892-(-43.57087)));
            yy = 1.06714 + (((tickAnim - 10) / 6) * (-13.26753-(1.06714)));
            zz = 26.00683 + (((tickAnim - 10) / 6) * (37.14767-(26.00683)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -30.75892 + (((tickAnim - 16) / 6) * (-7.73788-(-30.75892)));
            yy = -13.26753 + (((tickAnim - 16) / 6) * (9.6294-(-13.26753)));
            zz = 37.14767 + (((tickAnim - 16) / 6) * (12.1351-(37.14767)));
        }
        else if (tickAnim >= 22 && tickAnim < 50) {
            xx = -7.73788 + (((tickAnim - 22) / 28) * (-21.34406-(-7.73788)));
            yy = 9.6294 + (((tickAnim - 22) / 28) * (18.77494-(9.6294)));
            zz = 12.1351 + (((tickAnim - 22) / 28) * (-5.51936-(12.1351)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LLeg3, LLeg3.rotateAngleX + (float) Math.toRadians(xx), LLeg3.rotateAngleY + (float) Math.toRadians(yy), LLeg3.rotateAngleZ + (float) Math.toRadians(zz));

        this.LLeg3.rotationPointX = this.LLeg3.rotationPointX + (float)(0);
        this.LLeg3.rotationPointY = this.LLeg3.rotationPointY - (float)(0);
        this.LLeg3.rotationPointZ = this.LLeg3.rotationPointZ + (float)(-0.05);



        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 53 + (((tickAnim - 0) / 8) * (77.31-(53)));
            yy = 0 + (((tickAnim - 0) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (0-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 16) {
            xx = 77.31 + (((tickAnim - 8) / 8) * (-10.2-(77.31)));
            yy = 0 + (((tickAnim - 8) / 8) * (0-(0)));
            zz = 0 + (((tickAnim - 8) / 8) * (0-(0)));
        }
        else if (tickAnim >= 16 && tickAnim < 22) {
            xx = -10.2 + (((tickAnim - 16) / 6) * (11.25-(-10.2)));
            yy = 0 + (((tickAnim - 16) / 6) * (0-(0)));
            zz = 0 + (((tickAnim - 16) / 6) * (0-(0)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 11.25 + (((tickAnim - 22) / 4) * (0.68636-(11.25)));
            yy = 0 + (((tickAnim - 22) / 4) * (-4.46014-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (13.4846-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 31) {
            xx = 0.68636 + (((tickAnim - 26) / 5) * (-1.33529-(0.68636)));
            yy = -4.46014 + (((tickAnim - 26) / 5) * (-5.03553-(-4.46014)));
            zz = 13.4846 + (((tickAnim - 26) / 5) * (26.04224-(13.4846)));
        }
        else if (tickAnim >= 31 && tickAnim < 38) {
            xx = -1.33529 + (((tickAnim - 31) / 7) * (12.33157-(-1.33529)));
            yy = -5.03553 + (((tickAnim - 31) / 7) * (-12.51331-(-5.03553)));
            zz = 26.04224 + (((tickAnim - 31) / 7) * (22.0377-(26.04224)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 12.33157 + (((tickAnim - 38) / 12) * (53-(12.33157)));
            yy = -12.51331 + (((tickAnim - 38) / 12) * (0-(-12.51331)));
            zz = 22.0377 + (((tickAnim - 38) / 12) * (0-(22.0377)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LFoot, LFoot.rotateAngleX + (float) Math.toRadians(xx), LFoot.rotateAngleY + (float) Math.toRadians(yy), LFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 22) {
            xx = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 22) * (0-(0)));
            zz = 0.65 + (((tickAnim - 0) / 22) * (0-(0.65)));
        }
        else if (tickAnim >= 22 && tickAnim < 26) {
            xx = 0 + (((tickAnim - 22) / 4) * (0.09-(0)));
            yy = 0 + (((tickAnim - 22) / 4) * (0.65-(0)));
            zz = 0 + (((tickAnim - 22) / 4) * (0.1-(0)));
        }
        else if (tickAnim >= 26 && tickAnim < 38) {
            xx = 0.09 + (((tickAnim - 26) / 12) * (0.325-(0.09)));
            yy = 0.65 + (((tickAnim - 26) / 12) * (0.35-(0.65)));
            zz = 0.1 + (((tickAnim - 26) / 12) * (0.38-(0.1)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 0.325 + (((tickAnim - 38) / 12) * (0-(0.325)));
            yy = 0.35 + (((tickAnim - 38) / 12) * (0-(0.35)));
            zz = 0.38 + (((tickAnim - 38) / 12) * (0.65-(0.38)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.LFoot.rotationPointX = this.LFoot.rotationPointX + (float)(xx);
        this.LFoot.rotationPointY = this.LFoot.rotationPointY - (float)(yy);
        this.LFoot.rotationPointZ = this.LFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = -6.8037 + (((tickAnim - 0) / 24) * (102.06247-(-6.8037)));
            yy = -33.35918 + (((tickAnim - 0) / 24) * (-10.4341-(-33.35918)));
            zz = -14.4365 + (((tickAnim - 0) / 24) * (95.0816-(-14.4365)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = 102.06247 + (((tickAnim - 24) / 14) * (46.45423-(102.06247)));
            yy = -10.4341 + (((tickAnim - 24) / 14) * (-19.3863-(-10.4341)));
            zz = 95.0816 + (((tickAnim - 24) / 14) * (79.4049-(95.0816)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = 46.45423 + (((tickAnim - 38) / 12) * (-6.8037-(46.45423)));
            yy = -19.3863 + (((tickAnim - 38) / 12) * (-33.35918-(-19.3863)));
            zz = 79.4049 + (((tickAnim - 38) / 12) * (-14.4365-(79.4049)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RLeg, RLeg.rotateAngleX + (float) Math.toRadians(xx), RLeg.rotateAngleY + (float) Math.toRadians(yy), RLeg.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 24) {
            xx = -7.73788 + (((tickAnim - 0) / 24) * (-21.34406-(-7.73788)));
            yy = -9.62945 + (((tickAnim - 0) / 24) * (-18.7749-(-9.62945)));
            zz = -12.13506 + (((tickAnim - 0) / 24) * (5.5194-(-12.13506)));
        }
        else if (tickAnim >= 24 && tickAnim < 38) {
            xx = -21.34406 + (((tickAnim - 24) / 14) * (-43.57087-(-21.34406)));
            yy = -18.7749 + (((tickAnim - 24) / 14) * (-1.0671-(-18.7749)));
            zz = 5.5194 + (((tickAnim - 24) / 14) * (-26.0068-(5.5194)));
        }
        else if (tickAnim >= 38 && tickAnim < 43) {
            xx = -43.57087 + (((tickAnim - 38) / 5) * (-30.75892-(-43.57087)));
            yy = -1.0671 + (((tickAnim - 38) / 5) * (13.2675-(-1.0671)));
            zz = -26.0068 + (((tickAnim - 38) / 5) * (-37.1477-(-26.0068)));
        }
        else if (tickAnim >= 43 && tickAnim < 50) {
            xx = -30.75892 + (((tickAnim - 43) / 7) * (-7.73788-(-30.75892)));
            yy = 13.2675 + (((tickAnim - 43) / 7) * (-9.62945-(13.2675)));
            zz = -37.1477 + (((tickAnim - 43) / 7) * (-12.13506-(-37.1477)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RLeg2, RLeg2.rotateAngleX + (float) Math.toRadians(xx), RLeg2.rotateAngleY + (float) Math.toRadians(yy), RLeg2.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 50) * (0-(0)));
            zz = 0.25 + (((tickAnim - 0) / 50) * (0.25-(0.25)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RLeg2.rotationPointX = this.RLeg2.rotationPointX + (float)(xx);
        this.RLeg2.rotationPointY = this.RLeg2.rotationPointY - (float)(yy);
        this.RLeg2.rotationPointZ = this.RLeg2.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 8) {
            xx = 7.25 + (((tickAnim - 0) / 8) * (-8.23371-(7.25)));
            yy = 0 + (((tickAnim - 0) / 8) * (-1.7543-(0)));
            zz = 0 + (((tickAnim - 0) / 8) * (-26.69665-(0)));
        }
        else if (tickAnim >= 8 && tickAnim < 24) {
            xx = -8.23371 + (((tickAnim - 8) / 16) * (53-(-8.23371)));
            yy = -1.7543 + (((tickAnim - 8) / 16) * (0-(-1.7543)));
            zz = -26.69665 + (((tickAnim - 8) / 16) * (0-(-26.69665)));
        }
        else if (tickAnim >= 24 && tickAnim < 35) {
            xx = 53 + (((tickAnim - 24) / 11) * (77.31-(53)));
            yy = 0 + (((tickAnim - 24) / 11) * (0-(0)));
            zz = 0 + (((tickAnim - 24) / 11) * (0-(0)));
        }
        else if (tickAnim >= 35 && tickAnim < 45) {
            xx = 77.31 + (((tickAnim - 35) / 10) * (-10.2-(77.31)));
            yy = 0 + (((tickAnim - 35) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 35) / 10) * (0-(0)));
        }
        else if (tickAnim >= 45 && tickAnim < 50) {
            xx = -10.2 + (((tickAnim - 45) / 5) * (7.25-(-10.2)));
            yy = 0 + (((tickAnim - 45) / 5) * (0-(0)));
            zz = 0 + (((tickAnim - 45) / 5) * (0-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(RFoot, RFoot.rotateAngleX + (float) Math.toRadians(xx), RFoot.rotateAngleY + (float) Math.toRadians(yy), RFoot.rotateAngleZ + (float) Math.toRadians(zz));


        if (tickAnim >= 0 && tickAnim < 2) {
            xx = 0 + (((tickAnim - 0) / 2) * (0-(0)));
            yy = 0.15 + (((tickAnim - 0) / 2) * (0.43-(0.15)));
            zz = 0.65 + (((tickAnim - 0) / 2) * (0.65-(0.65)));
        }
        else if (tickAnim >= 2 && tickAnim < 4) {
            xx = 0 + (((tickAnim - 2) / 2) * (0-(0)));
            yy = 0.43 + (((tickAnim - 2) / 2) * (0.535-(0.43)));
            zz = 0.65 + (((tickAnim - 2) / 2) * (0.65-(0.65)));
        }
        else if (tickAnim >= 4 && tickAnim < 8) {
            xx = 0 + (((tickAnim - 4) / 4) * (0-(0)));
            yy = 0.535 + (((tickAnim - 4) / 4) * (0.275-(0.535)));
            zz = 0.65 + (((tickAnim - 4) / 4) * (0.65-(0.65)));
        }
        else if (tickAnim >= 8 && tickAnim < 15) {
            xx = 0 + (((tickAnim - 8) / 7) * (-0.35-(0)));
            yy = 0.275 + (((tickAnim - 8) / 7) * (0.46-(0.275)));
            zz = 0.65 + (((tickAnim - 8) / 7) * (1.275-(0.65)));
        }
        else if (tickAnim >= 15 && tickAnim < 24) {
            xx = -0.35 + (((tickAnim - 15) / 9) * (0-(-0.35)));
            yy = 0.46 + (((tickAnim - 15) / 9) * (0-(0.46)));
            zz = 1.275 + (((tickAnim - 15) / 9) * (0.65-(1.275)));
        }
        else if (tickAnim >= 24 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 24) / 26) * (0-(0)));
            yy = 0 + (((tickAnim - 24) / 26) * (0.15-(0)));
            zz = 0.65 + (((tickAnim - 24) / 26) * (0.65-(0.65)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.RFoot.rotationPointX = this.RFoot.rotationPointX + (float)(xx);
        this.RFoot.rotationPointY = this.RFoot.rotationPointY - (float)(yy);
        this.RFoot.rotationPointZ = this.RFoot.rotationPointZ + (float)(zz);




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            yy = 0 + (((tickAnim - 0) / 10) * (0-(0)));
            zz = 0 + (((tickAnim - 0) / 10) * (0-(0)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            yy = 0 + (((tickAnim - 10) / 13) * (0-(0)));
            zz = 0 + (((tickAnim - 10) / 13) * (39.75-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            yy = 0 + (((tickAnim - 23) / 27) * (0-(0)));
            zz = 39.75 + (((tickAnim - 23) / 27) * (0-(39.75)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(LClaw, LClaw.rotateAngleX + (float) Math.toRadians(xx), LClaw.rotateAngleY + (float) Math.toRadians(yy), LClaw.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 23) {
            xx = 0 + (((tickAnim - 0) / 23) * (24.24281-(0)));
            yy = 75 + (((tickAnim - 0) / 23) * (18.4871+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5-(75)));
            zz = 0 + (((tickAnim - 0) / 23) * (-0.77585-(0)));
        }
        else if (tickAnim >= 23 && tickAnim < 38) {
            xx = 24.24281 + (((tickAnim - 23) / 15) * (-25.7103+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4-(24.24281)));
            yy = 18.4871+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5 + (((tickAnim - 23) / 15) * (17.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-15-(18.4871+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*-5)));
            zz = -0.77585 + (((tickAnim - 23) / 15) * (-43.1638+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5-(-0.77585)));
        }
        else if (tickAnim >= 38 && tickAnim < 50) {
            xx = -25.7103+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4 + (((tickAnim - 38) / 12) * (0-(-25.7103+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*4)));
            yy = 17.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-15 + (((tickAnim - 38) / 12) * (75-(17.3583+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120+20))*-15)));
            zz = -43.1638+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5 + (((tickAnim - 38) / 12) * (0-(-43.1638+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120))*5)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone, bone.rotateAngleX + (float) Math.toRadians(xx), bone.rotateAngleY + (float) Math.toRadians(yy), bone.rotateAngleZ + (float) Math.toRadians(zz));




        if (tickAnim >= 0 && tickAnim < 10) {
            xx = 10.75 + (((tickAnim - 0) / 10) * (-16.1194+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15-(10.75)));
            yy = 0 + (((tickAnim - 0) / 10) * (-35.86739-(0)));
            zz = 27.75 + (((tickAnim - 0) / 10) * (45.1628+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*-20-(27.75)));
        }
        else if (tickAnim >= 10 && tickAnim < 23) {
            xx = -16.1194+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15 + (((tickAnim - 10) / 13) * (0-(-16.1194+Math.sin((Math.PI/180)*(((double)tickAnim/20)*120-50))*-15)));
            yy = -35.86739 + (((tickAnim - 10) / 13) * (-73.75-(-35.86739)));
            zz = 45.1628+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*-20 + (((tickAnim - 10) / 13) * (0-(45.1628+Math.sin((Math.PI/180)*(((double)tickAnim/20)*90-20))*-20)));
        }
        else if (tickAnim >= 23 && tickAnim < 50) {
            xx = 0 + (((tickAnim - 23) / 27) * (10.75-(0)));
            yy = -73.75 + (((tickAnim - 23) / 27) * (0-(-73.75)));
            zz = 0 + (((tickAnim - 23) / 27) * (27.75-(0)));
        }
        else {
            xx = 0;
            yy = 0;
            zz = 0;
        }
        this.setRotateAngle(bone3, bone3.rotateAngleX + (float) Math.toRadians(xx), bone3.rotateAngleY + (float) Math.toRadians(yy), bone3.rotateAngleZ + (float) Math.toRadians(zz));


    }


    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraDrepanosaurus e = (EntityPrehistoricFloraDrepanosaurus) entity;
        animator.update(entity);
        //this.resetToDefaultPose();

    }
}
