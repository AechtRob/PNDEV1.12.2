package net.lepidodendron.entity.model.entity;


import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelPhragmoceras extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended body;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended allarms;
    private final AdvancedModelRendererExtended arm1;
    private final AdvancedModelRendererExtended armb1;
    private final AdvancedModelRendererExtended arm2;
    private final AdvancedModelRendererExtended armb2;
    private final AdvancedModelRendererExtended arm3;
    private final AdvancedModelRendererExtended armb3;
    private final AdvancedModelRendererExtended arm4;
    private final AdvancedModelRendererExtended armb4;
    private final AdvancedModelRendererExtended arm5;
    private final AdvancedModelRendererExtended armb5;
    private final AdvancedModelRendererExtended arm6;
    private final AdvancedModelRendererExtended armb6;
    private final AdvancedModelRendererExtended arm7;
    private final AdvancedModelRendererExtended armb7;
    private final AdvancedModelRendererExtended arm8;
    private final AdvancedModelRendererExtended armb8;
    private final AdvancedModelRendererExtended arm9;
    private final AdvancedModelRendererExtended armb9;
    private final AdvancedModelRendererExtended arm10;
    private final AdvancedModelRendererExtended armb10;
    private final AdvancedModelRendererExtended shell;
    private final AdvancedModelRendererExtended cube_r2;
    private final AdvancedModelRendererExtended cube_r3;
    private final AdvancedModelRendererExtended cube_r4;
    private final AdvancedModelRendererExtended cube_r5;
    private final AdvancedModelRendererExtended cube_r6;
    private final AdvancedModelRendererExtended cube_r7;
    private final AdvancedModelRendererExtended cube_r8;
    private final AdvancedModelRendererExtended cube_r9;
    private final AdvancedModelRendererExtended cube_r10;
    private final AdvancedModelRendererExtended cube_r11;
    private final AdvancedModelRendererExtended cube_r12;
    private final AdvancedModelRendererExtended cube_r13;
    private final AdvancedModelRendererExtended cube_r14;

    public ModelPhragmoceras() {
        this.textureWidth = 128;
        this.textureHeight = 128;

        this.body = new AdvancedModelRendererExtended(this);
        this.body.setRotationPoint(0.0F, 21.0F, -5.0F);
        this.setRotateAngle(body, 0.9163F, 0.0F, 0.0F);
        this.body.cubeList.add(new ModelBox(body, 38, 48, -3.4F, -5.25F, 0.5F, 1, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 48, 21, -3.0F, -6.25F, 0.0F, 6, 6, 4, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 19, 48, -3.5F, -7.25F, 4.0F, 7, 7, 5, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 50, 12, -3.5F, -1.2F, 2.0F, 7, 1, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 40, 21, -2.5F, -7.25F, 0.0F, 5, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 48, 0, -3.0F, -7.25F, 1.0F, 6, 1, 3, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 18, 49, 2.4F, -5.25F, 0.5F, 1, 2, 2, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 25, 2.425F, -4.75F, 1.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 7, 18, 2.41F, -4.24F, 1.01F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 0, 9, -3.425F, -4.75F, 1.0F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 4, 9, -3.41F, -4.24F, 1.01F, 1, 1, 1, 0.0F, false));
        this.body.cubeList.add(new ModelBox(body, 5, 0, -0.5F, -7.251F, 1.0F, 1, 0, 2, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(0.0F, -2.45F, 2.0F);
        this.body.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.5236F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 0, 49, -3.5F, -2.925F, 0.6F, 7, 4, 2, 0.01F, false));

        this.allarms = new AdvancedModelRendererExtended(this);
        this.allarms.setRotationPoint(0.75F, -5.6F, 0.25F);
        this.body.addChild(allarms);


        this.arm1 = new AdvancedModelRendererExtended(this);
        this.arm1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.allarms.addChild(arm1);
        this.arm1.cubeList.add(new ModelBox(arm1, 17, 37, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.armb1 = new AdvancedModelRendererExtended(this);
        this.armb1.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm1.addChild(armb1);
        this.armb1.cubeList.add(new ModelBox(armb1, 3, 22, -0.49F, -0.51F, -3.0F, 1, 1, 3, 0.0F, false));

        this.arm2 = new AdvancedModelRendererExtended(this);
        this.arm2.setRotationPoint(-1.5F, 0.0F, 0.0F);
        this.allarms.addChild(arm2);
        this.arm2.cubeList.add(new ModelBox(arm2, 17, 37, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.armb2 = new AdvancedModelRendererExtended(this);
        this.armb2.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm2.addChild(armb2);
        this.armb2.cubeList.add(new ModelBox(armb2, 3, 22, -0.51F, -0.51F, -3.0F, 1, 1, 3, 0.0F, true));

        this.arm3 = new AdvancedModelRendererExtended(this);
        this.arm3.setRotationPoint(-2.5F, 1.0F, 0.0F);
        this.allarms.addChild(arm3);
        this.arm3.cubeList.add(new ModelBox(arm3, 17, 37, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.armb3 = new AdvancedModelRendererExtended(this);
        this.armb3.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm3.addChild(armb3);
        this.armb3.cubeList.add(new ModelBox(armb3, 3, 22, -0.51F, -0.51F, -3.0F, 1, 1, 3, 0.0F, true));

        this.arm4 = new AdvancedModelRendererExtended(this);
        this.arm4.setRotationPoint(1.0F, 1.0F, 0.0F);
        this.allarms.addChild(arm4);
        this.arm4.cubeList.add(new ModelBox(arm4, 17, 37, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.armb4 = new AdvancedModelRendererExtended(this);
        this.armb4.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm4.addChild(armb4);
        this.armb4.cubeList.add(new ModelBox(armb4, 3, 22, -0.49F, -0.51F, -3.0F, 1, 1, 3, 0.0F, false));

        this.arm5 = new AdvancedModelRendererExtended(this);
        this.arm5.setRotationPoint(1.5F, 2.15F, 0.0F);
        this.allarms.addChild(arm5);
        this.arm5.cubeList.add(new ModelBox(arm5, 17, 37, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.armb5 = new AdvancedModelRendererExtended(this);
        this.armb5.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm5.addChild(armb5);
        this.armb5.cubeList.add(new ModelBox(armb5, 3, 22, -0.49F, -0.51F, -3.0F, 1, 1, 3, 0.0F, false));

        this.arm6 = new AdvancedModelRendererExtended(this);
        this.arm6.setRotationPoint(-3.0F, 2.15F, 0.0F);
        this.allarms.addChild(arm6);
        this.arm6.cubeList.add(new ModelBox(arm6, 17, 37, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.armb6 = new AdvancedModelRendererExtended(this);
        this.armb6.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm6.addChild(armb6);
        this.armb6.cubeList.add(new ModelBox(armb6, 3, 22, -0.51F, -0.51F, -3.0F, 1, 1, 3, 0.0F, true));

        this.arm7 = new AdvancedModelRendererExtended(this);
        this.arm7.setRotationPoint(1.0F, 3.25F, 0.0F);
        this.allarms.addChild(arm7);
        this.arm7.cubeList.add(new ModelBox(arm7, 17, 37, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.armb7 = new AdvancedModelRendererExtended(this);
        this.armb7.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm7.addChild(armb7);
        this.armb7.cubeList.add(new ModelBox(armb7, 3, 22, -0.49F, -0.51F, -3.0F, 1, 1, 3, 0.0F, false));

        this.arm8 = new AdvancedModelRendererExtended(this);
        this.arm8.setRotationPoint(-2.5F, 3.25F, 0.0F);
        this.allarms.addChild(arm8);
        this.arm8.cubeList.add(new ModelBox(arm8, 17, 37, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, true));

        this.armb8 = new AdvancedModelRendererExtended(this);
        this.armb8.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm8.addChild(armb8);
        this.armb8.cubeList.add(new ModelBox(armb8, 3, 22, -0.51F, -0.51F, -3.0F, 1, 1, 3, 0.0F, true));

        this.arm9 = new AdvancedModelRendererExtended(this);
        this.arm9.setRotationPoint(0.0F, 4.25F, 0.0F);
        this.allarms.addChild(arm9);
        this.arm9.cubeList.add(new ModelBox(arm9, 17, 37, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.armb9 = new AdvancedModelRendererExtended(this);
        this.armb9.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm9.addChild(armb9);
        this.armb9.cubeList.add(new ModelBox(armb9, 3, 22, -0.49F, -0.51F, -3.0F, 1, 1, 3, 0.0F, false));

        this.arm10 = new AdvancedModelRendererExtended(this);
        this.arm10.setRotationPoint(-1.5F, 4.25F, 0.0F);
        this.allarms.addChild(arm10);
        this.arm10.cubeList.add(new ModelBox(arm10, 17, 37, -0.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F, false));

        this.armb10 = new AdvancedModelRendererExtended(this);
        this.armb10.setRotationPoint(0.0F, 0.0F, -3.0F);
        this.arm10.addChild(armb10);
        this.armb10.cubeList.add(new ModelBox(armb10, 3, 22, -0.49F, -0.51F, -3.0F, 1, 1, 3, 0.0F, false));

        this.shell = new AdvancedModelRendererExtended(this);
        this.shell.setRotationPoint(-0.5F, 2.1384F, 6.049F);
        this.body.addChild(shell);


        this.cube_r2 = new AdvancedModelRendererExtended(this);
        this.cube_r2.setRotationPoint(0.0F, -2.8384F, -3.549F);
        this.shell.addChild(cube_r2);
        this.setRotateAngle(cube_r2, -0.7418F, 0.0F, 0.0F);
        this.cube_r2.cubeList.add(new ModelBox(cube_r2, 48, 31, -2.5F, -2.25F, 0.5F, 6, 2, 4, 0.0F, false));

        this.cube_r3 = new AdvancedModelRendererExtended(this);
        this.cube_r3.setRotationPoint(0.0F, -12.5144F, 0.1666F);
        this.shell.addChild(cube_r3);
        this.setRotateAngle(cube_r3, -0.6109F, 0.0F, 0.0F);
        this.cube_r3.cubeList.add(new ModelBox(cube_r3, 27, 0, -3.5F, -0.0841F, -0.0655F, 8, 4, 5, 0.0F, false));

        this.cube_r4 = new AdvancedModelRendererExtended(this);
        this.cube_r4.setRotationPoint(0.5F, -5.3647F, 13.9799F);
        this.shell.addChild(cube_r4);
        this.setRotateAngle(cube_r4, -1.9199F, 0.0F, 0.0F);
        this.cube_r4.cubeList.add(new ModelBox(cube_r4, 0, 19, 0.0F, -2.9868F, -3.2417F, 0, 3, 3, 0.0F, false));

        this.cube_r5 = new AdvancedModelRendererExtended(this);
        this.cube_r5.setRotationPoint(0.5F, -4.38F, 15.3089F);
        this.shell.addChild(cube_r5);
        this.setRotateAngle(cube_r5, -0.829F, 0.0F, 0.0F);
        this.cube_r5.cubeList.add(new ModelBox(cube_r5, 0, 37, -0.5F, -1.8337F, -1.8454F, 1, 2, 2, 0.0F, false));

        this.cube_r6 = new AdvancedModelRendererExtended(this);
        this.cube_r6.setRotationPoint(0.5F, -4.38F, 17.3089F);
        this.shell.addChild(cube_r6);
        this.setRotateAngle(cube_r6, -0.3054F, 0.0F, 0.0F);
        this.cube_r6.cubeList.add(new ModelBox(cube_r6, 0, 0, -1.0F, -1.1727F, -1.8533F, 2, 2, 3, 0.0F, false));

        this.cube_r7 = new AdvancedModelRendererExtended(this);
        this.cube_r7.setRotationPoint(0.5F, -5.18F, 18.1089F);
        this.shell.addChild(cube_r7);
        this.setRotateAngle(cube_r7, 0.6545F, 0.0F, 0.0F);
        this.cube_r7.cubeList.add(new ModelBox(cube_r7, 50, 5, -1.5F, -1.4F, -1.15F, 3, 3, 4, 0.0F, false));

        this.cube_r8 = new AdvancedModelRendererExtended(this);
        this.cube_r8.setRotationPoint(0.5F, -9.8853F, 21.2731F);
        this.shell.addChild(cube_r8);
        this.setRotateAngle(cube_r8, -1.6144F, 0.0F, 0.0F);
        this.cube_r8.cubeList.add(new ModelBox(cube_r8, 43, 48, -2.0F, -0.3197F, -0.7642F, 4, 4, 5, 0.0F, false));

        this.cube_r9 = new AdvancedModelRendererExtended(this);
        this.cube_r9.setRotationPoint(0.5F, -12.1712F, 17.6884F);
        this.shell.addChild(cube_r9);
        this.setRotateAngle(cube_r9, -0.9643F, 0.0F, 0.0F);
        this.cube_r9.cubeList.add(new ModelBox(cube_r9, 0, 37, -2.5F, -2.5F, -3.5F, 5, 5, 7, 0.0F, false));

        this.cube_r10 = new AdvancedModelRendererExtended(this);
        this.cube_r10.setRotationPoint(0.0F, -8.7659F, 17.6707F);
        this.shell.addChild(cube_r10);
        this.setRotateAngle(cube_r10, -1.6319F, 0.0F, 0.0F);
        this.cube_r10.cubeList.add(new ModelBox(cube_r10, 28, 29, -2.5F, 0.4F, -7.75F, 6, 11, 8, 0.0F, false));

        this.cube_r11 = new AdvancedModelRendererExtended(this);
        this.cube_r11.setRotationPoint(0.0F, -11.6347F, 6.3047F);
        this.shell.addChild(cube_r11);
        this.setRotateAngle(cube_r11, -0.9163F, 0.0F, 0.0F);
        this.cube_r11.cubeList.add(new ModelBox(cube_r11, 0, 18, -3.0F, -3.75F, -4.5F, 7, 8, 11, 0.0F, false));

        this.cube_r12 = new AdvancedModelRendererExtended(this);
        this.cube_r12.setRotationPoint(0.0F, -4.1922F, 5.6822F);
        this.shell.addChild(cube_r12);
        this.setRotateAngle(cube_r12, -0.2618F, 0.0F, 0.0F);
        this.cube_r12.cubeList.add(new ModelBox(cube_r12, 0, 0, -3.5F, -3.85F, -6.825F, 8, 7, 11, 0.01F, false));

        this.cube_r13 = new AdvancedModelRendererExtended(this);
        this.cube_r13.setRotationPoint(0.0F, 0.6638F, 8.4515F);
        this.shell.addChild(cube_r13);
        this.setRotateAngle(cube_r13, -0.7941F, 0.0F, 0.0F);
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 0, 5, -1.0F, -1.75F, 2.5F, 3, 2, 2, 0.0F, false));
        this.cube_r13.cubeList.add(new ModelBox(cube_r13, 25, 21, -2.0F, -2.25F, -2.5F, 5, 3, 5, 0.0F, false));

        this.cube_r14 = new AdvancedModelRendererExtended(this);
        this.cube_r14.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shell.addChild(cube_r14);
        this.setRotateAngle(cube_r14, -0.1309F, 0.0F, 0.0F);
        this.cube_r14.cubeList.add(new ModelBox(cube_r14, 29, 9, -2.5F, -2.945F, -0.0342F, 6, 3, 9, -0.01F, false));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.body.render(f5 * 0.17F);
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
        this.body.offsetY = 4F;

        AdvancedModelRendererExtended[] tentacle1 = {this.arm1, this.armb1};
        AdvancedModelRendererExtended[] tentacle2 = {this.arm2, this.armb2};
        AdvancedModelRendererExtended[] tentacle3 = {this.arm3, this.armb3};
        AdvancedModelRendererExtended[] tentacle4 = {this.arm4, this.armb4};
        AdvancedModelRendererExtended[] tentacle5 = {this.arm5, this.armb5};
        AdvancedModelRendererExtended[] tentacle6 = {this.arm6, this.armb6};
        AdvancedModelRendererExtended[] tentacle7 = {this.arm7, this.armb7};
        AdvancedModelRendererExtended[] tentacle8 = {this.arm8, this.armb8};
        AdvancedModelRendererExtended[] tentacle9 = {this.arm9, this.armb9};
        AdvancedModelRendererExtended[] tentacle10 = {this.arm10, this.armb10};

        float speed = 0.15F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        //Left:
        this.chainSwing(tentacle5, speed, -0.3F, -2, f2, 1F);
        //Left lower middle:
        this.chainWave(tentacle7, speed, 0.3F, -1.5, f2, 1F);
        this.chainSwing(tentacle7, speed, -0.3F, -1.5, f2, 1F);
        //Left lower bottom:
        this.chainWave(tentacle9, speed, 0.25F, -2, f2, 1F);
        this.chainSwing(tentacle9, speed, -0.1F, -1.5, f2, 1F);
        //Left upper middle:
        this.chainWave(tentacle4, speed, -0.3F, -1.5, f2, 1F);
        this.chainSwing(tentacle4, speed, -0.3F, -1.5, f2, 1F);
        //Left upper top:
        this.chainWave(tentacle1, speed, -0.25F, -2, f2, 1F);
        this.chainSwing(tentacle1, speed, -0.1F, -1.5, f2, 1F);

        //Right:
        this.chainSwing(tentacle6, speed, 0.3F, -2, f2, 1F);
        //Right lower middle:
        this.chainWave(tentacle8, speed, 0.3F, -1.5, f2, 1F);
        this.chainSwing(tentacle8, speed, 0.3F, -1.5, f2, 1F);
        //Right lower bottom:
        this.chainWave(tentacle10, speed, 0.25F, -2, f2, 1F);
        this.chainSwing(tentacle10, speed, 0.1F, -1.5, f2, 1F);
        //Right upper middle:
        this.chainWave(tentacle3, speed, -0.3F, -1.5, f2, 1F);
        this.chainSwing(tentacle3, speed, 0.3F, -1.5, f2, 1F);
        //Right upper top:
        this.chainWave(tentacle2, speed, -0.25F, -2, f2, 1F);
        this.chainSwing(tentacle2, speed, 0.1F, -1.5, f2, 1F);

        if (e.isInWater()) {
            this.bob(body, speed, 3.0F, false, f2, 2);
            this.flap(body, speed*0.5F, 0.06F, false, 0, 0, f2, 2);
            this.walk(body, speed*0.5F, 0.06F, false, 0, 0, f2, 2);
            this.body.offsetY = this.moveBoxExtended(speed, 0.2F, false, 0, f2, 1) + 1.3F;

        }
        else {
            this.body.rotateAngleZ = (float) Math.toRadians(90);
            this.body.offsetY = 1.23F;
        }

    }

}
