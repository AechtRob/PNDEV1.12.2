package net.lepidodendron.entity.model.entity;

import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelRendererExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelElephantoceras extends AdvancedModelBaseExtended {
    private final AdvancedModelRendererExtended Shell1;
    private final AdvancedModelRendererExtended Shell2;
    private final AdvancedModelRendererExtended Shell3;
    private final AdvancedModelRendererExtended Shellbase;
    private final AdvancedModelRendererExtended Shell4;
    private final AdvancedModelRendererExtended Shell5;
    private final AdvancedModelRendererExtended Shell6;
    private final AdvancedModelRendererExtended Shell7;
    private final AdvancedModelRendererExtended Shell8;
    private final AdvancedModelRendererExtended Shell9;
    private final AdvancedModelRendererExtended shell10;
    private final AdvancedModelRendererExtended backshell;
    private final AdvancedModelRendererExtended Shell6_r1;
    private final AdvancedModelRendererExtended head;
    private final AdvancedModelRendererExtended cube_r1;
    private final AdvancedModelRendererExtended arm;
    private final AdvancedModelRendererExtended arm3;
    private final AdvancedModelRendererExtended arm4;
    private final AdvancedModelRendererExtended arm5;
    private final AdvancedModelRendererExtended arm6;
    private final AdvancedModelRendererExtended arm2;
    private final AdvancedModelRendererExtended tuskleft;
    private final AdvancedModelRendererExtended tusk_r1;
    private final AdvancedModelRendererExtended tuskleft2;
    private final AdvancedModelRendererExtended tusk_r2;
    private final AdvancedModelRendererExtended tuskleft3;
    private final AdvancedModelRendererExtended tuskright;
    private final AdvancedModelRendererExtended tusk_r3;
    private final AdvancedModelRendererExtended tuskright2;
    private final AdvancedModelRendererExtended tusk_r4;
    private final AdvancedModelRendererExtended tuskright3;

    public ModelElephantoceras() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.Shell1 = new AdvancedModelRendererExtended(this);
        this.Shell1.setRotationPoint(0.0F, 24.0F, -6.0F);
        this.setRotateAngle(Shell1, 0.3974F, 0.0F, 0.0F);


        this.Shell2 = new AdvancedModelRendererExtended(this);
        this.Shell2.setRotationPoint(-0.01F, 0.2375F, -23.9044F);
        this.Shell1.addChild(Shell2);
        this.setRotateAngle(Shell2, -0.4882F, 0.0F, 0.0F);


        this.Shell3 = new AdvancedModelRendererExtended(this);
        this.Shell3.setRotationPoint(0.01F, 0.9F, -4.9F);
        this.Shell2.addChild(Shell3);
        this.setRotateAngle(Shell3, -0.7854F, 0.0F, 0.0F);


        this.Shellbase = new AdvancedModelRendererExtended(this);
        this.Shellbase.setRotationPoint(0.0F, 3.0F, 4.0F);
        this.Shell1.addChild(Shellbase);
        this.setRotateAngle(Shellbase, -0.1274F, 0.0F, 0.0F);


        this.Shell4 = new AdvancedModelRendererExtended(this);
        this.Shell4.setRotationPoint(0.0F, -3.3442F, -1.2938F);
        this.Shellbase.addChild(Shell4);
        this.setRotateAngle(Shell4, -0.4552F, 0.0F, 0.0F);
        this.Shell4.cubeList.add(new ModelBox(Shell4, 0, 0, -2.5F, -2.5F, -3.5F, 5, 5, 7, 0.01F, false));
        this.Shell4.cubeList.add(new ModelBox(Shell4, 18, 37, -4.5F, -2.5F, -3.5F, 2, 4, 7, 0.01F, false));
        this.Shell4.cubeList.add(new ModelBox(Shell4, 0, 34, 2.5F, -2.5F, -3.5F, 2, 4, 7, 0.01F, false));

        this.Shell5 = new AdvancedModelRendererExtended(this);
        this.Shell5.setRotationPoint(0.0F, 2.5179F, -3.482F);
        this.Shell4.addChild(Shell5);
        this.setRotateAngle(Shell5, -1.0673F, 0.0F, 0.0F);
        this.Shell5.cubeList.add(new ModelBox(Shell5, 20, 16, -2.5F, -5.9955F, -6.0253F, 5, 6, 6, 0.0F, false));
        this.Shell5.cubeList.add(new ModelBox(Shell5, 40, 11, -4.5F, -6.4205F, -5.9003F, 2, 6, 5, 0.0F, false));
        this.Shell5.cubeList.add(new ModelBox(Shell5, 36, 37, 2.5F, -6.4205F, -5.9003F, 2, 6, 5, 0.0F, false));

        this.Shell6 = new AdvancedModelRendererExtended(this);
        this.Shell6.setRotationPoint(0.0F, 0.3807F, -5.3208F);
        this.Shell5.addChild(Shell6);
        this.setRotateAngle(Shell6, -0.6569F, 0.0F, 0.0F);
        this.Shell6.cubeList.add(new ModelBox(Shell6, 0, 12, -4.0F, -5.1872F, -6.0099F, 8, 5, 5, 0.0F, false));

        this.Shell7 = new AdvancedModelRendererExtended(this);
        this.Shell7.setRotationPoint(0.0F, -0.2074F, -6.0159F);
        this.Shell6.addChild(Shell7);
        this.setRotateAngle(Shell7, -0.9116F, 0.0F, 0.0F);
        this.Shell7.cubeList.add(new ModelBox(Shell7, 21, 8, -4.0F, -3.9344F, -3.9896F, 8, 4, 4, -0.01F, false));

        this.Shell8 = new AdvancedModelRendererExtended(this);
        this.Shell8.setRotationPoint(0.0F, -30.3188F, -8.5675F);
        this.Shell7.addChild(Shell8);
        this.setRotateAngle(Shell8, -0.6191F, 0.0F, 0.0F);
        this.Shell8.cubeList.add(new ModelBox(Shell8, 36, 2, -3.5F, 18.9911F, 18.3731F, 7, 3, 3, 0.01F, false));

        this.Shell9 = new AdvancedModelRendererExtended(this);
        this.Shell9.setRotationPoint(0.0F, 22.0441F, 18.4629F);
        this.Shell8.addChild(Shell9);
        this.setRotateAngle(Shell9, -0.5955F, 0.0F, 0.0F);
        this.Shell9.cubeList.add(new ModelBox(Shell9, 0, 24, -3.5F, -5.949F, -4.0287F, 7, 6, 4, 0.0F, false));

        this.shell10 = new AdvancedModelRendererExtended(this);
        this.shell10.setRotationPoint(0.0F, 0.1408F, -4.0336F);
        this.Shell9.addChild(shell10);
        this.setRotateAngle(shell10, -0.829F, 0.0F, 0.0F);
        this.shell10.cubeList.add(new ModelBox(shell10, 22, 28, -3.0F, -4.0898F, -4.9951F, 6, 4, 5, 0.0F, false));

        this.backshell = new AdvancedModelRendererExtended(this);
        this.backshell.setRotationPoint(0.0F, 2.5F, 3.5F);
        this.Shell4.addChild(backshell);
        this.setRotateAngle(backshell, 0.5236F, 0.0F, 0.0F);
        this.backshell.cubeList.add(new ModelBox(backshell, 39, 25, -2.5F, -2.0F, 0.0F, 5, 2, 3, 0.01F, false));

        this.Shell6_r1 = new AdvancedModelRendererExtended(this);
        this.Shell6_r1.setRotationPoint(0.0F, -1.5F, 1.5F);
        this.backshell.addChild(Shell6_r1);
        this.setRotateAngle(Shell6_r1, -0.5236F, 0.0F, 0.0F);
        this.Shell6_r1.cubeList.add(new ModelBox(Shell6_r1, 17, 0, -4.0F, -1.25F, -1.75F, 8, 2, 3, 0.0F, false));

        this.head = new AdvancedModelRendererExtended(this);
        this.head.setRotationPoint(0.0F, -0.3361F, 4.7206F);
        this.Shell4.addChild(head);
        this.setRotateAngle(head, 0.2182F, 0.0F, 0.0F);
        this.head.cubeList.add(new ModelBox(head, 11, 34, -2.0F, -1.5697F, -1.9268F, 4, 3, 3, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 0, 22, -4.1F, -1.5947F, -0.9018F, 3, 1, 1, 0.0F, false));
        this.head.cubeList.add(new ModelBox(head, 17, 5, 1.1F, -1.5947F, -0.9018F, 3, 1, 1, 0.0F, false));

        this.cube_r1 = new AdvancedModelRendererExtended(this);
        this.cube_r1.setRotationPoint(-0.5F, 1.3303F, 0.0732F);
        this.head.addChild(cube_r1);
        this.setRotateAngle(cube_r1, -0.2051F, 0.0F, 0.0F);
        this.cube_r1.cubeList.add(new ModelBox(cube_r1, 26, 5, -0.5F, -0.5F, -0.35F, 2, 1, 2, 0.0F, false));

        this.arm = new AdvancedModelRendererExtended(this);
        this.arm.setRotationPoint(-1.25F, -0.6697F, 1.0732F);
        this.head.addChild(arm);
        this.arm.cubeList.add(new ModelBox(arm, 26, 48, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.arm3 = new AdvancedModelRendererExtended(this);
        this.arm3.setRotationPoint(1.25F, -0.6697F, 1.0732F);
        this.head.addChild(arm3);
        this.arm3.cubeList.add(new ModelBox(arm3, 10, 45, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.arm4 = new AdvancedModelRendererExtended(this);
        this.arm4.setRotationPoint(-1.25F, 0.5803F, 1.0732F);
        this.head.addChild(arm4);
        this.arm4.cubeList.add(new ModelBox(arm4, 46, 44, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.arm5 = new AdvancedModelRendererExtended(this);
        this.arm5.setRotationPoint(1.25F, 0.5803F, 1.0732F);
        this.head.addChild(arm5);
        this.arm5.cubeList.add(new ModelBox(arm5, 0, 45, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.arm6 = new AdvancedModelRendererExtended(this);
        this.arm6.setRotationPoint(0.0F, 0.7803F, 1.0732F);
        this.head.addChild(arm6);
        this.arm6.cubeList.add(new ModelBox(arm6, 45, 35, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.arm2 = new AdvancedModelRendererExtended(this);
        this.arm2.setRotationPoint(0.0F, -0.9197F, 1.0732F);
        this.head.addChild(arm2);
        this.arm2.cubeList.add(new ModelBox(arm2, 16, 48, -0.5F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.tuskleft = new AdvancedModelRendererExtended(this);
        this.tuskleft.setRotationPoint(0.225F, -0.475F, 5.375F);
        this.Shell4.addChild(tuskleft);
        this.setRotateAngle(tuskleft, 1.1345F, 0.0F, 0.0F);
        this.tuskleft.cubeList.add(new ModelBox(tuskleft, 44, 30, 1.5F, -1.0F, -1.0F, 1, 1, 4, 0.01F, false));

        this.tusk_r1 = new AdvancedModelRendererExtended(this);
        this.tusk_r1.setRotationPoint(2.0F, -0.5F, 3.0F);
        this.tuskleft.addChild(tusk_r1);
        this.setRotateAngle(tusk_r1, 0.0F, -0.1745F, 0.0F);
        this.tusk_r1.cubeList.add(new ModelBox(tusk_r1, 29, 37, -0.05F, -0.5F, -4.175F, 1, 1, 4, -0.01F, false));

        this.tuskleft2 = new AdvancedModelRendererExtended(this);
        this.tuskleft2.setRotationPoint(2.0F, 0.0009F, 3.0359F);
        this.tuskleft.addChild(tuskleft2);
        this.setRotateAngle(tuskleft2, 0.5531F, 0.0255F, 0.0406F);
        this.tuskleft2.cubeList.add(new ModelBox(tuskleft2, 22, 48, -0.5F, -1.0086F, -0.0513F, 1, 1, 3, 0.01F, false));

        this.tusk_r2 = new AdvancedModelRendererExtended(this);
        this.tusk_r2.setRotationPoint(0.5F, -0.5086F, 2.9487F);
        this.tuskleft2.addChild(tusk_r2);
        this.setRotateAngle(tusk_r2, 0.0F, -0.1745F, 0.0F);
        this.tusk_r2.cubeList.add(new ModelBox(tusk_r2, 6, 45, -1.0F, -0.5F, -3.0F, 1, 1, 3, -0.01F, false));

        this.tuskleft3 = new AdvancedModelRendererExtended(this);
        this.tuskleft3.setRotationPoint(-2.0F, -0.0151F, 2.9632F);
        this.tuskleft2.addChild(tuskleft3);
        this.setRotateAngle(tuskleft3, 0.2184F, -0.0426F, -0.0094F);
        this.tuskleft3.cubeList.add(new ModelBox(tuskleft3, 0, 0, 1.5F, -0.9949F, -0.098F, 1, 1, 2, 0.01F, false));

        this.tuskright = new AdvancedModelRendererExtended(this);
        this.tuskright.setRotationPoint(-0.225F, -0.475F, 5.375F);
        this.Shell4.addChild(tuskright);
        this.setRotateAngle(tuskright, 1.1345F, 0.0F, 0.0F);
        this.tuskright.cubeList.add(new ModelBox(tuskright, 44, 30, -2.5F, -1.0F, -1.0F, 1, 1, 4, 0.01F, true));

        this.tusk_r3 = new AdvancedModelRendererExtended(this);
        this.tusk_r3.setRotationPoint(-2.0F, -0.5F, 3.0F);
        this.tuskright.addChild(tusk_r3);
        this.setRotateAngle(tusk_r3, 0.0F, 0.1745F, 0.0F);
        this.tusk_r3.cubeList.add(new ModelBox(tusk_r3, 29, 37, -0.95F, -0.5F, -4.175F, 1, 1, 4, -0.01F, true));

        this.tuskright2 = new AdvancedModelRendererExtended(this);
        this.tuskright2.setRotationPoint(-2.0F, 0.0009F, 3.0359F);
        this.tuskright.addChild(tuskright2);
        this.setRotateAngle(tuskright2, 0.5531F, -0.0255F, -0.0406F);
        this.tuskright2.cubeList.add(new ModelBox(tuskright2, 22, 48, -0.5F, -1.0086F, -0.0513F, 1, 1, 3, 0.01F, true));

        this.tusk_r4 = new AdvancedModelRendererExtended(this);
        this.tusk_r4.setRotationPoint(-0.5F, -0.5086F, 2.9487F);
        this.tuskright2.addChild(tusk_r4);
        this.setRotateAngle(tusk_r4, 0.0F, 0.1745F, 0.0F);
        this.tusk_r4.cubeList.add(new ModelBox(tusk_r4, 6, 45, 0.0F, -0.5F, -3.0F, 1, 1, 3, -0.01F, true));

        this.tuskright3 = new AdvancedModelRendererExtended(this);
        this.tuskright3.setRotationPoint(2.0F, -0.0151F, 2.9632F);
        this.tuskright2.addChild(tuskright3);
        this.setRotateAngle(tuskright3, 0.2184F, 0.0426F, 0.0094F);
        this.tuskright3.cubeList.add(new ModelBox(tuskright3, 0, 0, -2.5F, -0.9949F, -0.098F, 1, 1, 2, 0.01F, true));

        updateDefaultPose();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        this.Shell1.render(f5);
    }
    public void renderStaticFloor(float f) {
        this.Shell1.offsetY = -0.1F;
        this.Shell1.offsetZ = 0.03F;
        this.Shell1.render(0.01F);
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
        //this.Shell1.offsetY = -0.5F;
        //this.Shell1.rotateAngleY = (float) Math.toRadians(180);
        //this.body.offsetZ = -1F;

        AdvancedModelRendererExtended[] t1 = {this.arm};
        AdvancedModelRendererExtended[] t2 = {this.arm2};
        AdvancedModelRendererExtended[] t3 = {this.arm3};
        AdvancedModelRendererExtended[] t4 = {this.arm4};
        AdvancedModelRendererExtended[] t5 = {this.arm5};
        AdvancedModelRendererExtended[] t6 = {this.arm6};


        float speed = 0.10F;
        if (!e.isInWater()) {
            speed = 0.5F;
        }

        //Left:
        //
        this.chainWave(t5, speed, 0.25F, -2, f2, 0.5F);
        this.chainSwing(t5, speed, -0.1F, -2, f2, 0.5F);
        //Left lower middle:
        this.chainWave(t6, speed, 0.3F, -2, f2, 0.5F);
        //Left upper top:
        this.chainWave(t3, speed, -0.25F, -2, f2, 0.5F);
        this.chainSwing(t3, speed, -0.1F, -2, f2, 0.5F);

        //Right:
        //Right lower bottom:
        this.chainWave(t4, speed, 0.25F, -2, f2, 0.5F);
        this.chainSwing(t4, speed, 0.1F, -2, f2, 0.5F);
        //Right upper middle:
        this.chainWave(t2, speed, -0.3F, -2, f2, 0.5F);
        //Right upper top:
        this.chainWave(t1, speed, -0.25F, -2, f2, 0.5F);
        this.chainSwing(t1, speed, 0.1F, -2, f2, 0.5F);

        if (e.isInWater()) {
            float bobSpeed = 0.1F;
            this.bob(Shell1, bobSpeed, 0.8F, false, f2, 2);
            this.Shell1.offsetZ = this.moveBoxExtended(speed, 0.2F, false, 0.5F, f2, 1);
        }
        else {
            this.Shell1.rotateAngleZ = (float) Math.toRadians(90);
        }

    }

}
