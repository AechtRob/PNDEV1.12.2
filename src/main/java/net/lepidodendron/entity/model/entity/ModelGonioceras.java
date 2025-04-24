package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;

public class ModelGonioceras extends ModelBasePalaeopedia {
    private final AdvancedModelRendererExtended bone;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended tentacle;
    private final AdvancedModelRendererExtended tentacleA;
    private final AdvancedModelRendererExtended tentacle5;
    private final AdvancedModelRendererExtended tentacleA5;
    private final AdvancedModelRendererExtended tentacle3;
    private final AdvancedModelRendererExtended tentacleA3;
    private final AdvancedModelRendererExtended tentacle7;
    private final AdvancedModelRendererExtended tentacleA7;
    private final AdvancedModelRendererExtended tentacle4;
    private final AdvancedModelRendererExtended tentacleA4;
    private final AdvancedModelRendererExtended tentacle8;
    private final AdvancedModelRendererExtended tentacleA8;
    private final AdvancedModelRendererExtended tentacle2;
    private final AdvancedModelRendererExtended tentacleA2;
    private final AdvancedModelRendererExtended tentacle6;
    private final AdvancedModelRendererExtended tentacleA6;

    public ModelGonioceras() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.bone = new AdvancedModelRendererExtended(this);
        this.bone.setRotationPoint(0.0F, 24.0F, 0.0F);
        this.bone.cubeList.add(new ModelBox(bone, 0, 0, -3.0F, -1.975F, -3.0F, 6, 2, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 10, 20, 2.05F, -1.274F, -1.975F, 3, 1, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 18, -5.05F, -1.274F, -1.975F, 3, 1, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 13, -2.0F, -2.5F, -3.0F, 4, 1, 4, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 30, 21, -1.5F, -2.5F, 1.0F, 3, 1, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 0, 28, -1.49F, -2.4F, 3.75F, 3, 1, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 19, 31, -1.0F, -2.3F, 6.5F, 2, 1, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 9, 31, -0.99F, -2.15F, 9.5F, 2, 2, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 13, 15, -2.5F, -2.0F, 1.0F, 5, 2, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 24, 4, -2.0F, -2.01F, 3.75F, 4, 2, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 25, 26, -1.5F, -2.0F, 6.5F, 3, 2, 3, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 18, 4, -1.0F, -2.0F, 12.25F, 2, 1, 2, 0.0F, false));
        this.bone.cubeList.add(new ModelBox(bone, 12, 6, -0.5F, -1.75F, 14.25F, 1, 1, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.bone.addChild(cube_r1);
        this.setRotateAngle(cube_r1, 0.0F, 0.2182F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 6, -4.225F, -1.274F, 14.5F, 1, 1, 2, 0.0F, false));
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 25, 16, -4.5F, -1.274F, 10.5F, 2, 1, 4, 0.0F, false));

        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, -1.0F);
        this.bone.addChild(cube_r2);
        this.setRotateAngle(cube_r2, 0.0F, -0.2182F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 9, 3.225F, -1.275F, 14.5F, 1, 1, 2, 0.0F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 26, 10, 2.5F, -1.275F, 10.5F, 2, 1, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.bone.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.0F, 0.2182F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 0, 6, -4.75F, -1.276F, 4.5F, 3, 1, 6, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 0.0F, 0.2182F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 20, 21, -5.0F, -1.275F, 0.5F, 3, 1, 4, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.0F, 0.0F, -0.5F);
        this.bone.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.0F, -0.2182F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 12, 7, 1.75F, -1.276F, 4.5F, 3, 1, 6, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(-0.25F, 0.0F, 0.0F);
        this.bone.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 0.0F, 0.48F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 29, 0, -3.325F, -1.275F, -4.05F, 3, 1, 1, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.25F, 0.0F, 0.0F);
        this.bone.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.0F, -0.48F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 32, 2, 0.325F, -1.275F, -4.05F, 3, 1, 1, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.bone.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.0F, -0.2182F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 0, 23, 2.0F, -1.275F, 0.5F, 3, 1, 4, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.0F, -2.5F, -3.0F);
        this.bone.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 0.0436F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 16, 0, -2.5F, -0.025F, -3.0F, 5, 1, 3, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -2.05F, -3.0F);
        this.bone.addChild(head);
        this.setRotateAngle(head, 0.1745F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 11, 26, -2.0F, 0.075F, -2.75F, 4, 2, 3, 0.0F, false));

        this.tentacle = new AdvancedModelRendererExtended(this);
        this.tentacle.setRotationPoint(1.5F, 0.65F, -2.5F);
        this.head.addChild(tentacle);
        this.setRotateAngle(tentacle, 0.0F, -0.3491F, 0.0F);
        this.tentacle.cubeList.add(new ModelBox(tentacle, 0, 32, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.tentacleA = new AdvancedModelRendererExtended(this);
        this.tentacleA.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.tentacle.addChild(tentacleA);
        this.tentacleA.cubeList.add(new ModelBox(tentacleA, 29, 31, -0.49F, -0.51F, -3.0F, 1, 1, 3, 0.0F, false));

        this.tentacle5 = new AdvancedModelRendererExtended(this);
        this.tentacle5.setRotationPoint(-1.5F, 0.65F, -2.5F);
        this.head.addChild(tentacle5);
        this.setRotateAngle(tentacle5, 0.0F, 0.3491F, 0.0F);
        this.tentacle5.cubeList.add(new ModelBox(tentacle5, 0, 32, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.tentacleA5 = new AdvancedModelRendererExtended(this);
        this.tentacleA5.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.tentacle5.addChild(tentacleA5);
        this.tentacleA5.cubeList.add(new ModelBox(tentacleA5, 29, 31, -0.51F, -0.51F, -3.0F, 1, 1, 3, 0.0F, true));

        this.tentacle3 = new AdvancedModelRendererExtended(this);
        this.tentacle3.setRotationPoint(0.5F, 0.55F, -2.5F);
        this.head.addChild(tentacle3);
        this.setRotateAngle(tentacle3, 0.0F, -0.1309F, 0.0F);
        this.tentacle3.cubeList.add(new ModelBox(tentacle3, 0, 32, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.tentacleA3 = new AdvancedModelRendererExtended(this);
        this.tentacleA3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.tentacle3.addChild(tentacleA3);
        this.tentacleA3.cubeList.add(new ModelBox(tentacleA3, 29, 31, -0.49F, -0.51F, -3.0F, 1, 1, 3, 0.0F, false));

        this.tentacle7 = new AdvancedModelRendererExtended(this);
        this.tentacle7.setRotationPoint(-0.5F, 0.55F, -2.5F);
        this.head.addChild(tentacle7);
        this.setRotateAngle(tentacle7, 0.0F, 0.1309F, 0.0F);
        this.tentacle7.cubeList.add(new ModelBox(tentacle7, 0, 32, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.tentacleA7 = new AdvancedModelRendererExtended(this);
        this.tentacleA7.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.tentacle7.addChild(tentacleA7);
        this.tentacleA7.cubeList.add(new ModelBox(tentacleA7, 29, 31, -0.51F, -0.51F, -3.0F, 1, 1, 3, 0.0F, true));

        this.tentacle4 = new AdvancedModelRendererExtended(this);
        this.tentacle4.setRotationPoint(0.5F, 1.75F, -2.5F);
        this.head.addChild(tentacle4);
        this.setRotateAngle(tentacle4, 0.3491F, -0.1309F, 0.0F);
        this.tentacle4.cubeList.add(new ModelBox(tentacle4, 0, 32, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.tentacleA4 = new AdvancedModelRendererExtended(this);
        this.tentacleA4.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.tentacle4.addChild(tentacleA4);
        this.tentacleA4.cubeList.add(new ModelBox(tentacleA4, 29, 31, -0.49F, -0.51F, -3.0F, 1, 1, 3, 0.0F, false));

        this.tentacle8 = new AdvancedModelRendererExtended(this);
        this.tentacle8.setRotationPoint(-0.5F, 1.75F, -2.5F);
        this.head.addChild(tentacle8);
        this.setRotateAngle(tentacle8, 0.3491F, 0.1309F, 0.0F);
        this.tentacle8.cubeList.add(new ModelBox(tentacle8, 0, 32, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.tentacleA8 = new AdvancedModelRendererExtended(this);
        this.tentacleA8.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.tentacle8.addChild(tentacleA8);
        this.tentacleA8.cubeList.add(new ModelBox(tentacleA8, 29, 31, -0.51F, -0.51F, -3.0F, 1, 1, 3, 0.0F, true));

        this.tentacle2 = new AdvancedModelRendererExtended(this);
        this.tentacle2.setRotationPoint(1.5F, 1.65F, -2.5F);
        this.head.addChild(tentacle2);
        this.setRotateAngle(tentacle2, 0.3054F, -0.3491F, 0.0F);
        this.tentacle2.cubeList.add(new ModelBox(tentacle2, 0, 32, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.tentacleA2 = new AdvancedModelRendererExtended(this);
        this.tentacleA2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.tentacle2.addChild(tentacleA2);
        this.tentacleA2.cubeList.add(new ModelBox(tentacleA2, 29, 31, -0.49F, -0.51F, -3.0F, 1, 1, 3, 0.0F, false));

        this.tentacle6 = new AdvancedModelRendererExtended(this);
        this.tentacle6.setRotationPoint(-1.5F, 1.65F, -2.5F);
        this.head.addChild(tentacle6);
        this.setRotateAngle(tentacle6, 0.3054F, 0.3491F, 0.0F);
        this.tentacle6.cubeList.add(new ModelBox(tentacle6, 0, 32, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.tentacleA6 = new AdvancedModelRendererExtended(this);
        this.tentacleA6.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.tentacle6.addChild(tentacleA6);
        this.tentacleA6.cubeList.add(new ModelBox(tentacleA6, 29, 31, -0.51F, -0.51F, -3.0F, 1, 1, 3, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.bone.render(f5);
    }

    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.bone.offsetY = -1.2F;
        this.bone.offsetX = 0.0F;
        this.bone.offsetZ = 2.0F;
        this.bone.rotateAngleY = (float)Math.toRadians(120);
        this.bone.rotateAngleX = (float)Math.toRadians(1);
        this.bone.rotateAngleZ = (float)Math.toRadians(0);
        this.bone.scaleChildren = true;
        float scaler = 2.2F;
        this.bone.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(bone, 0.6F, 3.8F, -0.2F);
        //End of pose, now render the model:
        this.bone.render(f);
        //Reset rotations, positions and sizing:
        this.bone.setScale(1.0F, 1.0F, 1.0F);
        this.bone.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(AdvancedModelRendererExtended AdvancedModelRendererExtended, float x, float y, float z) {
        AdvancedModelRendererExtended.rotateAngleX = x;
        AdvancedModelRendererExtended.rotateAngleY = y;
        AdvancedModelRendererExtended.rotateAngleZ = z;
    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        this.resetToDefaultPose();
        //this.bone.offsetY = 0.95F;
        this.bone.rotateAngleY = (float)Math.toRadians(180);

        AdvancedModelRendererExtended[] TentacleL = {this.tentacle3, this.tentacleA3};
        AdvancedModelRendererExtended[] TentacleR = {this.tentacle7, this.tentacleA7};
        AdvancedModelRendererExtended[] TentacleLL = {this.tentacle, this.tentacleA};
        AdvancedModelRendererExtended[] TentacleRR = {this.tentacle5, this.tentacleA5};

        AdvancedModelRendererExtended[] TentacleDL = {this.tentacle4, this.tentacleA4};
        AdvancedModelRendererExtended[] TentacleDR = {this.tentacle8, this.tentacleA8};
        AdvancedModelRendererExtended[] TentacleDLL = {this.tentacle2, this.tentacleA2};
        AdvancedModelRendererExtended[] TentacleDRR = {this.tentacle6, this.tentacleA6};

        float speed = 0.4F;
        if (!e.isInWater()) {
            speed = 0.7F;
        }
        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {

            float feedModifier = 1;
            if (f3 == 0.0) {
                feedModifier = 0.15F;
            }
            else {
                this.walk(bone, -speed * 0.6F, 0.21F, true, 0, -0.1F, f2, -0.4F);
            }

            this.chainWave(TentacleL, (float)0.45 * feedModifier, 0.07F, -3.5, f2, 0.8F);
            this.chainSwing(TentacleL, (float)0.45 *  feedModifier, 0.2F, -0.1, f2, 0.5F);

            this.chainWave(TentacleR, (float)0.45 * feedModifier, 0.07F, -3.5, f2, -0.8F);
            this.chainSwing(TentacleR, (float)0.45 *  feedModifier, -0.2F, 0.1, f2, 0.5F);

            this.chainWave(TentacleDL, (float)0.45 * feedModifier, 0.07F, -2.5, f2, 0.8F);
            this.chainSwing(TentacleDL, (float)0.45 *  feedModifier, 0.2F, -1.1, f2, 0.5F);

            this.chainWave(TentacleDR, (float)0.45 * feedModifier, 0.07F, -2.5, f2, -0.8F);
            this.chainSwing(TentacleDR, (float)0.45 *  feedModifier, -0.2F, 1.1, f2, 0.5F);


            this.chainWave(TentacleLL, (float)0.45 * feedModifier, 0.05F, -2.5, f2, 0.8F);
            this.chainSwing(TentacleLL, (float)0.45 *  feedModifier, 0.3F, -1.1, f2, 0.5F);

            this.chainWave(TentacleRR, (float)0.45 * feedModifier, 0.05F, -2.5, f2, -0.8F);
            this.chainSwing(TentacleRR, (float)0.45 *  feedModifier, -0.3F, 1.1, f2, 0.5F);

            this.chainWave(TentacleDLL, (float)0.45 * feedModifier, 0.05F, -1.5, f2, 0.8F);
            this.chainSwing(TentacleDLL, (float)0.45 *  feedModifier, 0.3F, -0.1, f2, 0.5F);

            this.chainWave(TentacleDRR, (float)0.45 * feedModifier, 0.05F, -1.5, f2, -0.8F);
            this.chainSwing(TentacleDRR, (float)0.45 *  feedModifier, -0.3F, 0.1, f2, 0.5F);


            if (!e.isInWater()) {
                this.bob(bone, -speed * 1.5F, 0.6F, false, f2, 1);
            } else {
                if (f3 == 0.0F) {
                    this.bob(bone, -speed, 0.01F, false, f2, 2);
                } else {
                    this.bob(bone, -speed, 0.07F, false, f2, 2);
                    this.bone.offsetZ = this.moveBoxExtended(speed, 0.02F, false, 2.5F, f2, 1);
                }
            }
        }
    }
}