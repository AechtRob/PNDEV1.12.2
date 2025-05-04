package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraSqualoraja;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelSqualoraja extends ModelBasePalaeopedia {
    private ModelAnimator animator;
    private final AdvancedModelRenderer Root;
    private final AdvancedModelRenderer Base;
    private final AdvancedModelRenderer Head;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer Jaw;
    private final AdvancedModelRenderer RightPectoral;
    private final AdvancedModelRenderer LeftPectoral;
    private final AdvancedModelRenderer Bodymiddle;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer Bodyback;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer RightAnal;
    private final AdvancedModelRenderer LeftAnal;
    private final AdvancedModelRenderer Tail;
    private final AdvancedModelRenderer Tail2;
    private final AdvancedModelRenderer Tail3;

    public ModelSqualoraja() {
        this.textureWidth = 70;
        this.textureHeight = 64;

        this.Root = new AdvancedModelRenderer(this);
        this.Root.setRotationPoint(0.0F, 22.5F, 0.0F);


        this.Base = new AdvancedModelRenderer(this);
        this.Base.setRotationPoint(0.0F, 0.0F, -9.0F);
        this.Root.addChild(Base);
        this.Base.cubeList.add(new ModelBox(Base, 39, 38, -2.5F, -0.5F, -1.0F, 5, 2, 4, 0.01F, false));
        this.Base.cubeList.add(new ModelBox(Base, 54, 28, -2.0F, -1.0F, -1.0F, 4, 1, 4, 0.01F, false));

        this.Head = new AdvancedModelRenderer(this);
        this.Head.setRotationPoint(0.0F, 0.5F, 0.0F);
        this.Base.addChild(Head);
        this.Head.cubeList.add(new ModelBox(Head, 48, 0, -2.0F, -1.0F, -5.0F, 4, 2, 5, 0.0F, false));
        this.Head.cubeList.add(new ModelBox(Head, 20, 23, -0.5F, 0.0F, -16.0F, 1, 1, 11, 0.0F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, -1.2F, -3.0F);
        this.Head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 16, 10, -0.5F, 0.0F, -10.0F, 1, 1, 11, 0.0F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(2.0F, -1.0F, -3.0F);
        this.Head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.7418F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 10, -1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-2.0F, -1.0F, -3.0F);
        this.Head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.7418F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 10, 0.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.Head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.096F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 30, -0.5F, 0.0F, -16.0F, 1, 1, 3, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 10, -1.0F, 0.0F, -13.0F, 2, 1, 5, 0.0F, false));
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 15, 36, -1.5F, 0.0F, -8.0F, 3, 1, 8, 0.0F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(0.5F, -0.5F, -16.0F);
        this.Head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, 0.4363F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 52, 16, -5.0F, 0.5F, 7.92F, 5, 1, 4, -0.01F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 17, -4.0F, 0.5F, 5.94F, 4, 1, 2, -0.01F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 16, 15, -3.0F, 0.5F, 3.96F, 3, 1, 2, -0.01F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 13, 30, -2.0F, 0.5F, 1.98F, 2, 1, 2, -0.01F, true));
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 30, 13, -1.0F, 0.5F, 0.0F, 1, 1, 2, -0.01F, true));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.5F, -0.5F, -16.0F);
        this.Head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, -0.4363F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 52, 16, 0.0F, 0.5F, 7.92F, 5, 1, 4, -0.01F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 17, 0.0F, 0.5F, 5.94F, 4, 1, 2, -0.01F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 17, 0.0F, 0.5F, 5.94F, 4, 1, 2, -0.01F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 15, 0.0F, 0.5F, 3.96F, 3, 1, 2, -0.01F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 13, 30, 0.0F, 0.5F, 1.98F, 2, 1, 2, -0.01F, false));
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 30, 13, 0.0F, 0.5F, 0.0F, 1, 1, 2, -0.01F, false));

        this.Jaw = new AdvancedModelRenderer(this);
        this.Jaw.setRotationPoint(0.0F, 1.0F, -2.0F);
        this.Head.addChild(Jaw);
        this.Jaw.cubeList.add(new ModelBox(Jaw, 16, 10, -1.5F, -1.99F, -1.99F, 3, 2, 2, 0.0F, false));
        this.Jaw.cubeList.add(new ModelBox(Jaw, 30, 17, -1.0F, -0.99F, -2.99F, 2, 1, 1, 0.0F, false));

        this.RightPectoral = new AdvancedModelRenderer(this);
        this.RightPectoral.setRotationPoint(-2.0F, 0.5F, 0.0F);
        this.Base.addChild(RightPectoral);
        this.setRotateAngle(RightPectoral, -0.0193F, 0.305F, -0.0454F);
        this.RightPectoral.cubeList.add(new ModelBox(RightPectoral, 0, 21, -3.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, false));
        this.RightPectoral.cubeList.add(new ModelBox(RightPectoral, 0, 0, -12.0F, 0.0F, -0.98F, 12, 0, 9, 0.0F, false));
        this.RightPectoral.cubeList.add(new ModelBox(RightPectoral, -9, 55, -12.0F, 0.05F, -0.98F, 12, 0, 9, 0.0F, false));

        this.LeftPectoral = new AdvancedModelRenderer(this);
        this.LeftPectoral.setRotationPoint(2.0F, 0.5F, 0.0F);
        this.Base.addChild(LeftPectoral);
        this.setRotateAngle(LeftPectoral, -0.0193F, -0.305F, 0.0454F);
        this.LeftPectoral.cubeList.add(new ModelBox(LeftPectoral, 0, 21, 0.0F, -0.5F, -1.0F, 3, 1, 2, 0.0F, true));
        this.LeftPectoral.cubeList.add(new ModelBox(LeftPectoral, 0, 0, 0.0F, 0.0F, -0.98F, 12, 0, 9, 0.0F, true));
        this.LeftPectoral.cubeList.add(new ModelBox(LeftPectoral, -9, 55, 0.0F, 0.05F, -0.98F, 12, 0, 9, 0.0F, true));

        this.Bodymiddle = new AdvancedModelRenderer(this);
        this.Bodymiddle.setRotationPoint(0.0F, 0.5F, 2.0F);
        this.Base.addChild(Bodymiddle);
        this.Bodymiddle.cubeList.add(new ModelBox(Bodymiddle, 34, 16, -2.5F, -1.0F, 0.0F, 5, 2, 7, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(0.0F, -1.5F, 0.0F);
        this.Bodymiddle.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.0349F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 38, 29, -2.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F, false));

        this.Bodyback = new AdvancedModelRenderer(this);
        this.Bodyback.setRotationPoint(0.0F, 0.0F, 6.0F);
        this.Bodymiddle.addChild(Bodyback);
        this.Bodyback.cubeList.add(new ModelBox(Bodyback, 41, 45, -2.0F, -1.0F, 0.0F, 4, 2, 6, -0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -0.5F, 1.0F);
        this.Bodyback.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 0, 0.0F, -4.0F, 0.0F, 0, 4, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, -1.5F, -7.0F);
        this.Bodyback.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 51, 8, -1.5F, 0.01F, 7.0F, 3, 1, 6, 0.0F, false));

        this.RightAnal = new AdvancedModelRenderer(this);
        this.RightAnal.setRotationPoint(-1.5F, 0.5F, 1.0F);
        this.Bodyback.addChild(RightAnal);
        this.setRotateAngle(RightAnal, -0.0432F, 0.2568F, -0.0947F);
        this.RightAnal.cubeList.add(new ModelBox(RightAnal, 54, 22, -4.0F, 0.0F, 0.0F, 4, 0, 5, 0.01F, false));

        this.LeftAnal = new AdvancedModelRenderer(this);
        this.LeftAnal.setRotationPoint(1.5F, 0.5F, 1.0F);
        this.Bodyback.addChild(LeftAnal);
        this.setRotateAngle(LeftAnal, -0.0432F, -0.2568F, 0.0947F);
        this.LeftAnal.cubeList.add(new ModelBox(LeftAnal, 54, 22, 0.0F, 0.0F, 0.0F, 4, 0, 5, 0.01F, true));

        this.Tail = new AdvancedModelRenderer(this);
        this.Tail.setRotationPoint(0.0F, 0.0F, 5.0F);
        this.Bodyback.addChild(Tail);
        this.Tail.cubeList.add(new ModelBox(Tail, 34, 1, -1.0F, -1.0F, 0.0F, 2, 2, 9, 0.0F, false));
        this.Tail.cubeList.add(new ModelBox(Tail, 0, 42, 0.0F, -3.0F, 1.0F, 0, 4, 8, 0.0F, false));

        this.Tail2 = new AdvancedModelRenderer(this);
        this.Tail2.setRotationPoint(0.0F, -0.25F, 8.5F);
        this.Tail.addChild(Tail2);
        this.Tail2.cubeList.add(new ModelBox(Tail2, 17, 46, -0.5F, -0.5F, 0.0F, 1, 1, 8, 0.0F, false));
        this.Tail2.cubeList.add(new ModelBox(Tail2, 30, 38, -0.01F, -2.75F, 0.0F, 0, 4, 8, 0.0F, false));

        this.Tail3 = new AdvancedModelRenderer(this);
        this.Tail3.setRotationPoint(0.0F, 0.0F, 7.5F);
        this.Tail2.addChild(Tail3);
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 30, -0.5F, -0.5F, 0.0F, 1, 1, 10, -0.01F, false));
        this.Tail3.cubeList.add(new ModelBox(Tail3, 0, 10, 0.0F, -2.75F, 0.0F, 0, 4, 15, 0.0F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.Root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.Root.rotateAngleX = (float) Math.toRadians(90);
        this.Root.rotateAngleZ = (float) Math.toRadians(90);
        this.Root.offsetX = -0.02F;
        this.Root.offsetZ = -0.01F;
        this.Root.offsetY = -0.245F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(Bodyback, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.7418F);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.7418F);
        this.setRotateAngle(cube_r4, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, 0.4363F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(cube_r7, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(LeftAnal, -0.0432F, -0.2568F, 0.0947F);
        this.setRotateAngle(LeftPectoral, -0.0193F, -0.305F, 0.0454F);
        this.setRotateAngle(RightAnal, -0.0432F, 0.2568F, -0.0947F);
        this.setRotateAngle(RightPectoral, -0.0193F, 0.305F, -0.0454F);
        this.setRotateAngle(Root, 0.0436F, -0.0873F, 0.0436F);
        this.setRotateAngle(Tail, 0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(Tail2, 0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(Tail3, -0.0436F, -0.1309F, 0.0F);
        this.Root.rotateAngleY = (float) Math.toRadians(90);
        this.Root.offsetY = -0.25F;
        this.Root.offsetX = 0.02F;
        this.Root.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.Root.offsetY = -1.4F;
        this.Root.offsetX = -0.2F;
        this.Root.offsetZ = 2.0F;
        this.Root.rotateAngleY = (float)Math.toRadians(120);
        this.Root.rotateAngleX = (float)Math.toRadians(0);
        this.Root.rotateAngleZ = (float)Math.toRadians(0);
        this.Root.scaleChildren = true;
        float scaler = 2.0F;
        this.Root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(Root, 0.6F, 3.8F, -0.2F);
        this.setRotateAngle(Bodyback, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(Bodymiddle, 0.0F, -0.0436F, 0.0F);
        this.setRotateAngle(cube_r1, -0.1309F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r2, 0.0F, 0.0F, -0.7418F);
        this.setRotateAngle(cube_r3, 0.0F, 0.0F, 0.7418F);
        this.setRotateAngle(cube_r4, 0.096F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r5, 0.0F, 0.4363F, 0.0F);
        this.setRotateAngle(cube_r6, 0.0F, -0.4363F, 0.0F);
        this.setRotateAngle(cube_r7, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r8, -0.3927F, 0.0F, 0.0F);
        this.setRotateAngle(cube_r9, -0.0349F, 0.0F, 0.0F);
        this.setRotateAngle(Head, -0.0436F, 0.0F, 0.0F);
        this.setRotateAngle(Jaw, 0.6545F, 0.0F, 0.0F);
        this.setRotateAngle(LeftAnal, -0.0432F, -0.2568F, 0.0947F);
        this.setRotateAngle(LeftPectoral, -0.0193F, -0.305F, 0.0454F);
        this.setRotateAngle(RightAnal, -0.0432F, 0.2568F, -0.0947F);
        this.setRotateAngle(RightPectoral, -0.0193F, 0.305F, -0.0454F);
        this.setRotateAngle(Tail, 0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(Tail2, 0.0436F, -0.0873F, 0.0F);
        this.setRotateAngle(Tail3, -0.0436F, -0.1309F, 0.0F);
        //End of pose, now render the model:
        this.Root.render(f);
        //Reset rotations, positions and sizing:
        this.Root.setScale(1.0F, 1.0F, 1.0F);
        this.Root.scaleChildren = false;
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
        //this.Root.offsetY = 1.45F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;

        AdvancedModelRenderer[] fishTail = {this.Bodyback, this.Tail, this.Tail2, this.Tail3};
        float speed = 0.1F;
        if (!e.isInWater()) { // if not in water
            speed = 0.7F * 0.5F;
        } else if (!ee.getIsMoving()) {
            speed = 0.7F * 0.13F;
        }


        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {



            this.walk(LeftAnal, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            this.swing(LeftAnal, (float) (speed * 0.75), 0.2F, true, 0, 0, f2, 1);
            if(ee.getIsMoving()|| !e.isInWater()) { //if moving, slap fins
                this.flap(LeftPectoral, speed * 2.5F, 0.4F, true, -3, 0, f2, 1);
                this.flap(RightPectoral, speed* 2.5F, -0.4F, true, -3, 0, f2, 1);
                this.chainWave(fishTail, speed* 2.5F, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed* 2.5F, 0.25F, -3, f2, 1);
            }

            else { //if not accelerating swing fins instead
                //this.swing(leftFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -0, -0.5F, f2, 1);
                //this.swing(rightFrontFin, (float)(speed*0.15), (float)Math.toRadians(45), false, -3, 0.5F, f2, 1);
                this.flap(LeftPectoral, (speed), 0.25F, true, -3, 0, f2, 1);
                this.flap(RightPectoral, (speed), -0.25F, true, -3, 0, f2, 1);
                this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
                this.chainSwing(fishTail, speed, 0.3F, -3, f2, 1);
            }


            this.walk(RightAnal, (float) (speed), 0.2F, true, 0, 0, f2, 1);
            this.swing(RightAnal, (float) (speed), 0.2F, true, 0, 0, f2, 1);


            if (!e.isInWater()) {
                //this.Root.offsetY = 1.55F;
                this.bob(Root, -speed, 5F, false, f2, 1);
            }
        }
    }
    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraSqualoraja e = (EntityPrehistoricFloraSqualoraja) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(20);
        animator.rotate(this.Jaw, (float) Math.toRadians(35), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}
