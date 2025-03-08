package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.base.EntityPrehistoricFloraAgeableBase;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelNematoptychius extends ModelBasePalaeopedia {
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
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer pelvicfinright;
    private final AdvancedModelRenderer pelvicfinleft;
    private final AdvancedModelRenderer body2;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer body3;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer body4;
    private final AdvancedModelRenderer cube_r18;
    private final AdvancedModelRenderer cube_r19;
    private final AdvancedModelRenderer pectoralfinright;
    private final AdvancedModelRenderer pectoralfinleft;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r20;

    private ModelAnimator animator;

    public ModelNematoptychius() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 7, 9, -2.025F, -8.5F, -13.5F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 6, 2, -2.025F, -8.5F, -13.0F, 1, 1, 1, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 6, 0, -2.025F, -9.0F, -13.0F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 2, -2.025F, -9.0F, -13.5F, 1, 1, 1, -0.01F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, -2.05F, -8.75F, -13.25F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 0, 1.05F, -8.75F, -13.25F, 1, 1, 1, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 0, 2, 1.025F, -9.0F, -13.5F, 1, 1, 1, -0.01F, true));
        this.head.cubeList.add(new ModelBox(head, 6, 0, 1.025F, -9.0F, -13.0F, 1, 1, 1, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 7, 9, 1.025F, -8.5F, -13.5F, 1, 1, 1, 0.0F, true));
        this.head.cubeList.add(new ModelBox(head, 6, 2, 1.025F, -8.5F, -13.0F, 1, 1, 1, -0.01F, true));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(1.0F, -7.6F, -12.825F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.48F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 19, 9, -3.0F, -1.0F, -1.0F, 4, 1, 1, -0.01F, false));

        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(1.0F, -8.225F, -13.15F);
        this.head.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.48F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 44, 0, -3.0F, -1.0F, -1.0F, 4, 1, 2, -0.015F, false));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(1.0F, -7.625F, -11.65F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0436F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 38, 27, -3.0F, -2.0F, -1.0F, 4, 2, 5, -0.01F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(0.5F, -6.45F, -12.75F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -0.1745F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 42, 6, -2.0F, -1.0F, -1.0F, 3, 1, 0, -0.01F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(1.0F, -6.35F, -12.25F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.1745F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 30, -3.0F, -1.0F, -1.0F, 4, 1, 6, -0.01F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(1.0F, -6.9F, -12.75F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.1745F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 28, -3.0F, -2.0F, -1.0F, 4, 2, 6, 0.0F, false));

        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(1.0F, -5.75F, -7.0F);
        this.head.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.829F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 42, 13, -3.0F, -2.0F, -1.0F, 4, 2, 2, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(2.15F, -4.0F, -6.9F);
        this.head.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, 0.1309F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 18, -1.0F, -5.0F, -1.0F, 1, 5, 3, 0.0F, true));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(-2.15F, -4.0F, -6.9F);
        this.head.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0F, -0.1309F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 18, 0.0F, -5.0F, -1.0F, 1, 5, 3, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(1.0F, -3.675F, -7.0F);
        this.head.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -0.1745F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 42, 7, -3.0F, -1.0F, -1.0F, 4, 1, 5, -0.01F, false));

        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(1.0F, -3.85F, -6.5F);
        this.head.addChild(cube_r11);
        this.setRotateAngle(cube_r11, 0.0436F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 34, 17, -3.0F, -6.0F, -1.0F, 4, 6, 4, 0.01F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -6.75F, -4.0F);
        this.head.addChild(body);
        this.body.cubeList.add(new ModelBox(body, 0, 0, -2.0F, -3.25F, 0.0F, 4, 7, 11, 0.0F, false));

        this.pelvicfinright = new AdvancedModelRenderer(this);
        this.pelvicfinright.setRotationPoint(-1.0F, 3.65F, 6.0F);
        this.body.addChild(pelvicfinright);
        this.setRotateAngle(pelvicfinright, 0.0873F, 0.0F, 0.3927F);
        this.pelvicfinright.cubeList.add(new ModelBox(pelvicfinright, 0, 3, 0.0F, 0.0F, -1.0F, 0, 3, 4, 0.0F, false));

        this.pelvicfinleft = new AdvancedModelRenderer(this);
        this.pelvicfinleft.setRotationPoint(1.0F, 3.65F, 6.0F);
        this.body.addChild(pelvicfinleft);
        this.setRotateAngle(pelvicfinleft, 0.0873F, 0.0F, -0.3927F);
        this.pelvicfinleft.cubeList.add(new ModelBox(pelvicfinleft, 0, 3, 0.0F, 0.0F, -1.0F, 0, 3, 4, 0.0F, true));

        this.body2 = new AdvancedModelRenderer(this);
        this.body2.setRotationPoint(0.0F, -0.15F, 11.0F);
        this.body.addChild(body2);
        this.body2.cubeList.add(new ModelBox(body2, 0, 18, -1.5F, -1.85F, -1.0F, 3, 4, 8, 0.0F, false));
        this.body2.cubeList.add(new ModelBox(body2, 0, 31, 0.0F, 1.75F, 2.0F, 0, 6, 6, 0.0F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.5F, 3.5F, 0.75F);
        this.body2.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.2182F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 19, 0, -2.0F, -2.0F, -1.0F, 3, 2, 7, -0.01F, false));

        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.5F, -1.525F, 4.7F);
        this.body2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.3054F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 24, 37, -2.0F, -1.0F, -1.0F, 3, 1, 3, -0.02F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(-1.0F, -1.75F, 1.0F);
        this.body2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.0436F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 30, 3, 1.0F, -8.0F, -1.0F, 0, 8, 6, 0.0F, false));

        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.5F, -1.0F, 0.0F);
        this.body2.addChild(cube_r15);
        this.setRotateAngle(cube_r15, -0.0436F, 0.0F, 0.0F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 42, 34, -2.0F, -2.0F, -1.0F, 3, 2, 5, -0.01F, false));

        this.body3 = new AdvancedModelRenderer(this);
        this.body3.setRotationPoint(0.0F, 0.0F, 7.0F);
        this.body2.addChild(body3);
        this.body3.cubeList.add(new ModelBox(body3, 14, 36, -1.0F, -1.35F, -1.0F, 2, 3, 6, 0.0F, false));

        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 2.0F, 0.0F);
        this.body3.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.1745F, 0.0F, 0.0F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 27, 44, -1.0F, -1.0F, -1.0F, 2, 1, 3, -0.01F, false));

        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(0.0F, -0.7F, 0.0F);
        this.body3.addChild(cube_r17);
        this.setRotateAngle(cube_r17, -0.1745F, 0.0F, 0.0F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 37, 44, -1.0F, -1.0F, -1.0F, 2, 1, 3, -0.01F, false));

        this.body4 = new AdvancedModelRenderer(this);
        this.body4.setRotationPoint(0.0F, -0.5F, 5.0F);
        this.body3.addChild(body4);
        this.body4.cubeList.add(new ModelBox(body4, 0, 42, 0.0F, -3.55F, -1.1F, 0, 10, 7, 0.0F, false));

        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(-0.5F, -1.5F, -2.0F);
        this.body4.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.48F, 0.0F, 0.0F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 28, 28, 0.0F, 1.0F, 0.0F, 1, 1, 8, 0.0F, false));

        this.cube_r19 = new AdvancedModelRenderer(this);
        this.cube_r19.setRotationPoint(-0.5F, 0.95F, -2.1F);
        this.body4.addChild(cube_r19);
        this.setRotateAngle(cube_r19, 0.9599F, 0.0F, 0.0F);
        this.cube_r19.cubeList.add(new ModelBox(cube_r19, 0, 0, 0.0F, 1.0F, 0.0F, 1, 1, 4, -0.01F, false));

        this.pectoralfinright = new AdvancedModelRenderer(this);
        this.pectoralfinright.setRotationPoint(-1.975F, -4.5F, -4.5F);
        this.head.addChild(pectoralfinright);
        this.setRotateAngle(pectoralfinright, -0.3054F, -0.3491F, 0.1745F);
        this.pectoralfinright.cubeList.add(new ModelBox(pectoralfinright, 50, 19, 0.0F, -0.75F, 0.025F, 0, 3, 5, 0.0F, false));

        this.pectoralfinleft = new AdvancedModelRenderer(this);
        this.pectoralfinleft.setRotationPoint(1.975F, -4.5F, -4.5F);
        this.head.addChild(pectoralfinleft);
        this.setRotateAngle(pectoralfinleft, -0.3054F, 0.3491F, -0.1745F);
        this.pectoralfinleft.cubeList.add(new ModelBox(pectoralfinleft, 50, 19, 0.0F, -0.75F, 0.025F, 0, 3, 5, 0.0F, true));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -6.025F, -7.9F);
        this.head.addChild(jaw);
        this.setRotateAngle(jaw, -0.1745F, 0.0F, 0.0F);
        this.jaw.cubeList.add(new ModelBox(jaw, 30, 37, -1.5F, 0.0F, -5.75F, 3, 1, 6, 0.0F, false));
        this.jaw.cubeList.add(new ModelBox(jaw, 32, 0, -1.5F, -0.5F, -5.75F, 3, 1, 6, -0.01F, false));

        this.cube_r20 = new AdvancedModelRenderer(this);
        this.cube_r20.setRotationPoint(0.5F, 1.225F, -3.25F);
        this.jaw.addChild(cube_r20);
        this.setRotateAngle(cube_r20, -0.1963F, 0.0F, 0.0F);
        this.cube_r20.cubeList.add(new ModelBox(cube_r20, 0, 43, -2.0F, -1.0F, -1.0F, 3, 1, 5, -0.01F, false));

        updateDefaultPose();
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.head.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.head.offsetY = -1.2F;
        this.head.offsetX = 0.4F;
        this.head.rotateAngleY = (float)Math.toRadians(220);
        this.head.rotateAngleX = (float)Math.toRadians(8);
        this.head.rotateAngleZ = (float)Math.toRadians(-8);
        this.head.scaleChildren = true;
        float scaler = 2.3F;
        this.head.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.head.render(f);
        //Reset rotations, positions and sizing:
        this.head.setScale(1.0F, 1.0F, 1.0F);
        this.head.scaleChildren = false;
        resetToDefaultPose();

    }

    public void renderStaticWall(float f) {
        this.head.rotateAngleY = (float) Math.toRadians(90);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.head.offsetY = -0.2F;
        this.head.offsetX = -0.05F;
        this.head.offsetZ = -0.37F;
        this.head.render(0.01F);
        this.resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.setRotateAngle(head, 0.0F, 0.0F, 0.05F);
        this.setRotateAngle(body, 0.0F, 0.2F, 0.05F);
        this.setRotateAngle(body2, 0.0F, 0.2F, 0.05F);
        this.setRotateAngle(body3, 0.0F, 0.3F, 0.05F);
        this.setRotateAngle(body4, 0.0F, 0.4F, 0.05F);
        this.setRotateAngle(jaw, 0.3F, 0.0F, 0.0F);
        this.head.offsetX = -0.01F;
        this.head.offsetY = 0.0F;
        this.head.render(0.01F);
        resetToDefaultPose();
    }
    
    public void setRotateAngle(ModelRenderer AdvancedModelRenderer, float x, float y, float z) {
        AdvancedModelRenderer.rotateAngleX = x;
        AdvancedModelRenderer.rotateAngleY = y;
        AdvancedModelRenderer.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.Acrolepis.offsetY = 1.0F;

        if (e instanceof EntityLiving) {
            if (((EntityLiving)e).isAIDisabled()) {
                return;
            }
        }

        AdvancedModelRenderer[] fishTail = {this.body, this.body2, this.body3, this.body4};

        float speed = 0.186F;
        EntityPrehistoricFloraAgeableBase ee = (EntityPrehistoricFloraAgeableBase) e;
        if (ee.getIsFast()) {
            speed = speed * 2.6F;
        }
        float still = 1f;
        if (f3 == 0.0F) {
            still = 0.8F;
        }
        if (!e.isInWater()) {
            speed = 0.26F;
        }

        //this.head.rotateAngleY += f3 / (180F / (float) Math.PI);
        //this.head.rotateAngleX += f4 / (180F / (float) Math.PI);

        //if (f3 != 0.0F) {this.walk(Jaw, (float) (speed * 1.5), 0.2F, true, 0, 0, f2, 1);}
        if (e.isInWater()) {
            this.chainWave(fishTail, speed * still * 2, 0.02F * still, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * still, 0.29F * still, -0.85, f2, 0.5F * still);
            this.swing(head, speed*still, 0.2F*still, true, 0, 0, f2, 0.8F);
        }
        else {
            this.swing(head, speed, 0.1F, true, 0, 0, f2, 0.5F);
        }
        this.flap(pectoralfinleft, (float) (speed * 0.65), 0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinleft, (float) (speed * 0.65), 0.18F, true, 0, 0, f2, 0.5F);
        this.flap(pectoralfinright, (float) (speed * 0.65), -0.28F, false, 0.8F, 0, f2, 0.5F);
        this.swing(pectoralfinright, (float) (speed * 0.65), -0.18F, true, 0, 0, f2, 0.5F);

        this.flap(pelvicfinleft, (float) (speed * 0.65), 0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinleft, (float) (speed * 0.65), 0.18F, true, 1, 0, f2, 0.5F);
        this.flap(pelvicfinright, (float) (speed * 0.65), -0.28F, false, 1.8F, 0, f2, 0.5F);
        this.swing(pelvicfinright, (float) (speed * 0.65), -0.18F, true, 1, 0, f2, 0.5F);

        if (!e.isInWater()) {
            this.head.rotateAngleZ = (float) Math.toRadians(90);
            //this.head.offsetY = 0.40F;
            this.bob(head, -speed * 1.9F, 2.5F, false, f2, 1);
            this.chainWave(fishTail, speed * 1.7F, 0.028F, -0.2, f2, 0.8F * still);
            this.chainSwing(fishTail, speed * 1.7F, 0.28F, -0.55, f2, 0.4F * still);

        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAgeableBase e = (EntityPrehistoricFloraAgeableBase) entity;
        animator.update(entity);
        this.resetToDefaultPose();
        setRotationAngles(f, f1, f2, f3, f4, f5, (Entity) entity);

        animator.setAnimation(e.ATTACK_ANIMATION);
        animator.startKeyframe(5);
        animator.rotate(this.jaw, (float) Math.toRadians(40), (float) Math.toRadians(0), (float) Math.toRadians(0));
        animator.endKeyframe();
        animator.setStaticKeyframe(5);
        animator.resetKeyframe(2);

    }
}

