package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.math.BlockPos;

public class ModelConcentrilepis extends ModelBasePalaeopedia {
    private final AdvancedModelRenderer main;
    private final AdvancedModelRenderer cube_r1;
    private final AdvancedModelRenderer jaw;
    private final AdvancedModelRenderer cube_r2;
    private final AdvancedModelRenderer head;
    private final AdvancedModelRenderer cube_r3;
    private final AdvancedModelRenderer cube_r4;
    private final AdvancedModelRenderer cube_r5;
    private final AdvancedModelRenderer cube_r6;
    private final AdvancedModelRenderer body;
    private final AdvancedModelRenderer cube_r7;
    private final AdvancedModelRenderer cube_r8;
    private final AdvancedModelRenderer cube_r9;
    private final AdvancedModelRenderer cube_r10;
    private final AdvancedModelRenderer tail;
    private final AdvancedModelRenderer cube_r11;
    private final AdvancedModelRenderer cube_r12;
    private final AdvancedModelRenderer tail2;
    private final AdvancedModelRenderer cube_r13;
    private final AdvancedModelRenderer cube_r14;
    private final AdvancedModelRenderer backLeftFin;
    private final AdvancedModelRenderer cube_r15;
    private final AdvancedModelRenderer backRightFin;
    private final AdvancedModelRenderer cube_r16;
    private final AdvancedModelRenderer frontLeftFin;
    private final AdvancedModelRenderer cube_r17;
    private final AdvancedModelRenderer frontRightFin;
    private final AdvancedModelRenderer cube_r18;

    public ModelConcentrilepis() {
        this.textureWidth = 28;
        this.textureHeight = 26;

        this.main = new AdvancedModelRenderer(this);
        this.main.setRotationPoint(0.0F, 22.7F, -1.4F);
        this.main.cubeList.add(new ModelBox(main, 18, 5, -1.0F, 0.0F, -1.0F, 2, 1, 2, 0.003F, false));
        this.main.cubeList.add(new ModelBox(main, 0, 12, -1.0F, -2.4F, -1.0F, 2, 3, 2, 0.02F, false));

        this.cube_r1 = new AdvancedModelRenderer(this);
        this.cube_r1.setRotationPoint(0.0F, 0.5875F, -3.8859F);
        this.main.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.1353F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 7, -1.0F, -2.0F, 0.0F, 2, 2, 3, -0.01F, false));

        this.jaw = new AdvancedModelRenderer(this);
        this.jaw.setRotationPoint(0.0F, -0.025F, -3.8F);
        this.main.addChild(jaw);


        this.cube_r2 = new AdvancedModelRenderer(this);
        this.cube_r2.setRotationPoint(0.0F, 0.0F, 3.8F);
        this.jaw.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.1047F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 0, 17, -0.9F, 0.0122F, -6.3732F, 1, 1, 3, -0.003F, false));
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 16, 13, -0.1F, 0.0122F, -6.3732F, 1, 1, 3, 0.0F, false));

        this.head = new AdvancedModelRenderer(this);
        this.head.setRotationPoint(0.4F, -0.9112F, -2.7257F);
        this.main.addChild(head);
        this.head.cubeList.add(new ModelBox(head, 14, 5, -0.375F, -0.3888F, -3.3743F, 1, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 14, 5, -1.425F, -0.3888F, -3.3743F, 1, 1, 1, 0.0F, true));

        this.cube_r3 = new AdvancedModelRenderer(this);
        this.cube_r3.setRotationPoint(-0.3F, 0.9112F, 2.7257F);
        this.head.addChild(cube_r3);
        this.setRotateAngle(cube_r3, 0.4014F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 22, 3, -1.1F, -3.732F, -5.8064F, 2, 1, 1, 0.003F, false));

        this.cube_r4 = new AdvancedModelRenderer(this);
        this.cube_r4.setRotationPoint(-0.4F, 0.4606F, -2.1188F);
        this.head.addChild(cube_r4);
        this.setRotateAngle(cube_r4, 1.3788F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 14, 22, -1.0F, -1.5F, -0.5F, 2, 3, 1, -0.003F, false));

        this.cube_r5 = new AdvancedModelRenderer(this);
        this.cube_r5.setRotationPoint(-0.4F, -0.646F, -3.1569F);
        this.head.addChild(cube_r5);
        this.setRotateAngle(cube_r5, 0.1702F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 0, -1.0F, 0.0F, 0.0F, 2, 2, 5, -0.001F, false));

        this.cube_r6 = new AdvancedModelRenderer(this);
        this.cube_r6.setRotationPoint(-0.4F, 1.2895F, -0.7892F);
        this.head.addChild(cube_r6);
        this.setRotateAngle(cube_r6, 1.3701F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 16, 17, -1.0F, -0.95F, 0.05F, 2, 1, 2, 0.006F, false));

        this.body = new AdvancedModelRenderer(this);
        this.body.setRotationPoint(0.0F, -0.8F, 0.9F);
        this.main.addChild(body);


        this.cube_r7 = new AdvancedModelRenderer(this);
        this.cube_r7.setRotationPoint(-0.25F, -1.5623F, 0.0104F);
        this.body.addChild(cube_r7);
        this.setRotateAngle(cube_r7, -0.2138F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 14, 0, -0.5F, 0.0F, 0.0F, 1, 2, 3, -0.006F, false));
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 8, 13, 0.0F, 0.0F, 0.0F, 1, 2, 3, 0.01F, false));

        this.cube_r8 = new AdvancedModelRenderer(this);
        this.cube_r8.setRotationPoint(0.0F, -1.4102F, 1.009F);
        this.body.addChild(cube_r8);
        this.setRotateAngle(cube_r8, 0.4538F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 6, 23, 0.0F, 0.0F, -0.1F, 0, 1, 2, 0.0F, false));

        this.cube_r9 = new AdvancedModelRenderer(this);
        this.cube_r9.setRotationPoint(0.0F, 1.4151F, 3.614F);
        this.body.addChild(cube_r9);
        this.setRotateAngle(cube_r9, 1.1519F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 12, 23, 0.0F, -1.4F, -0.4F, 0, 2, 1, 0.0F, false));

        this.cube_r10 = new AdvancedModelRenderer(this);
        this.cube_r10.setRotationPoint(0.25F, 0.889F, 3.3107F);
        this.body.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.3134F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 18, 8, -1.0F, 0.5F, -2.0F, 1, 3, 2, -0.009F, false));
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 8, 18, -0.5F, 0.5F, -2.0F, 1, 3, 2, -0.003F, false));

        this.tail = new AdvancedModelRenderer(this);
        this.tail.setRotationPoint(0.0F, 0.1F, 2.8F);
        this.body.addChild(tail);


        this.cube_r11 = new AdvancedModelRenderer(this);
        this.cube_r11.setRotationPoint(0.0F, -0.8155F, 1.8936F);
        this.tail.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.1134F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 20, 22, -0.5F, 0.0F, -2.0F, 1, 1, 2, 0.003F, false));

        this.cube_r12 = new AdvancedModelRenderer(this);
        this.cube_r12.setRotationPoint(0.0F, 0.1864F, 1.7857F);
        this.tail.addChild(cube_r12);
        this.setRotateAngle(cube_r12, 0.3752F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 21, -0.5F, -1.0F, -2.0F, 1, 1, 2, -0.01F, false));

        this.tail2 = new AdvancedModelRenderer(this);
        this.tail2.setRotationPoint(0.0F, -0.2F, 1.8F);
        this.tail.addChild(tail2);


        this.cube_r13 = new AdvancedModelRenderer(this);
        this.cube_r13.setRotationPoint(0.001F, 0.3885F, 1.8209F);
        this.tail2.addChild(cube_r13);
        this.setRotateAngle(cube_r13, 0.1571F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 10, 7, 0.0F, -1.175F, -2.0F, 0, 2, 4, 0.0F, false));

        this.cube_r14 = new AdvancedModelRenderer(this);
        this.cube_r14.setRotationPoint(0.0F, 0.4079F, -0.0669F);
        this.tail2.addChild(cube_r14);
        this.setRotateAngle(cube_r14, 0.1178F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 22, 0, -0.5F, -1.0F, 0.0F, 1, 1, 2, 0.0F, false));

        this.backLeftFin = new AdvancedModelRenderer(this);
        this.backLeftFin.setRotationPoint(0.6F, 1.7234F, 0.5341F);
        this.body.addChild(backLeftFin);


        this.cube_r15 = new AdvancedModelRenderer(this);
        this.cube_r15.setRotationPoint(0.0F, 0.3F, 0.1F);
        this.backLeftFin.addChild(cube_r15);
        this.setRotateAngle(cube_r15, 0.3322F, 0.1578F, -0.4273F);
        this.cube_r15.cubeList.add(new ModelBox(cube_r15, 14, 18, 0.1F, -0.5F, -0.5F, 0, 1, 1, 0.0F, false));

        this.backRightFin = new AdvancedModelRenderer(this);
        this.backRightFin.setRotationPoint(-0.6F, 1.7234F, 0.5341F);
        this.body.addChild(backRightFin);


        this.cube_r16 = new AdvancedModelRenderer(this);
        this.cube_r16.setRotationPoint(0.0F, 0.3F, 0.1F);
        this.backRightFin.addChild(cube_r16);
        this.setRotateAngle(cube_r16, 0.3322F, -0.1578F, 0.4273F);
        this.cube_r16.cubeList.add(new ModelBox(cube_r16, 14, 18, -0.1F, -0.5F, -0.5F, 0, 1, 1, 0.0F, true));

        this.frontLeftFin = new AdvancedModelRenderer(this);
        this.frontLeftFin.setRotationPoint(0.827F, 0.3599F, -2.3951F);
        this.main.addChild(frontLeftFin);


        this.cube_r17 = new AdvancedModelRenderer(this);
        this.cube_r17.setRotationPoint(-0.827F, -0.3599F, 2.3951F);
        this.frontLeftFin.addChild(cube_r17);
        this.setRotateAngle(cube_r17, 0.736F, 0.3029F, -0.4101F);
        this.cube_r17.cubeList.add(new ModelBox(cube_r17, 10, 23, 1.2741F, -1.0507F, -2.5958F, 0, 2, 1, 0.0F, false));

        this.frontRightFin = new AdvancedModelRenderer(this);
        this.frontRightFin.setRotationPoint(-0.827F, 0.3599F, -2.3951F);
        this.main.addChild(frontRightFin);


        this.cube_r18 = new AdvancedModelRenderer(this);
        this.cube_r18.setRotationPoint(0.827F, -0.3599F, 2.3951F);
        this.frontRightFin.addChild(cube_r18);
        this.setRotateAngle(cube_r18, 0.736F, -0.3029F, 0.4101F);
        this.cube_r18.cubeList.add(new ModelBox(cube_r18, 10, 23, -1.2741F, -1.0507F, -2.5958F, 0, 2, 1, 0.0F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.main.render(f5);
    }
    public void renderStaticWall(float f) {
        this.main.rotateAngleY = (float) Math.toRadians(90);
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    public void renderStaticFloor(float f) {
        this.main.render(0.01F);
        resetToDefaultPose();
    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.main.offsetY = -1.2F;
        this.main.offsetX = -0.2F;
        this.main.rotateAngleY = (float)Math.toRadians(230);
        this.main.rotateAngleX = (float)Math.toRadians(20);
        this.main.rotateAngleZ = (float)Math.toRadians(-8);
        this.main.scaleChildren = true;
        float scaler = 3.0F;
        this.main.setScale(scaler, scaler, scaler);
        //Start of pose:

        //End of pose, now render the model:
        this.main.render(f);
        //Reset rotations, positions and sizing:
        this.main.setScale(1.0F, 1.0F, 1.0F);
        this.main.scaleChildren = false;
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
        //this.main.offsetY = 1.0F;

        //this.Tailfin.setScale(1.1F, 1.1F, 1.1F);
        AdvancedModelRenderer[] fishTail = {this.tail, this.tail2};

        float speed = 0.4F;
        float taildegree = 0.35F;

        if (!e.isInWater()) {
            speed = 0.7F;
        }

        boolean isAtBottom = false;
        if (e.getPosition().getY() - 1 > 1) {
            BlockPos pos = new BlockPos(e.getPosition().getX(), e.getPosition().getY() - 1, e.getPosition().getZ());
            isAtBottom = ((e.isInsideOfMaterial(Material.WATER) || e.isInsideOfMaterial(Material.CORAL))
                    && ((e.world.getBlockState(pos)).getMaterial() != Material.WATER)
                    && ((double)e.getPosition().getY() + 0.334D) > e.posY);
        }
        if (isAtBottom) {
            //System.err.println("Animation at bottom");
            speed = 0.15F;
            taildegree = 0.15F;
        }

        if (e instanceof EntityLiving && !((EntityLiving) e).isAIDisabled()) {
            this.chainWave(fishTail, speed, 0.05F, -3, f2, 1);
            this.chainSwing(fishTail, speed, taildegree, -3, f2, 1);
            this.swing(main, speed, 0.3F, true, 0, 0, f2, 1);

            if (!e.isInWater()) {
                this.main.rotateAngleZ = (float) Math.toRadians(90);
                //this.main.offsetY = 0.95F;
                this.bob(main, -speed, 2F, false, f2, 1);
                this.chainWave(fishTail, speed, 0.2F, -3, f2, 1);
            }
        }
    }
}
