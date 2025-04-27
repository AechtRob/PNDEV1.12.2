package net.lepidodendron.entity.model.tile;

import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.lepidodendron.entity.model.llibraryextensions.AdvancedModelBaseExtended;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;

public class ModelDactyliocerasShell extends AdvancedModelBaseExtended {
    private final AdvancedModelRenderer root;
    private final AdvancedModelRenderer Shell;
    private final AdvancedModelRenderer Shell1_r1;
    private final AdvancedModelRenderer Shellbase_r1;
    private final AdvancedModelRenderer Shell2_r1;
    private final AdvancedModelRenderer Shell3_r1;
    private final AdvancedModelRenderer Shell4_r1;
    private final AdvancedModelRenderer Shell5_r1;
    private final AdvancedModelRenderer Shell6_r1;
    private final AdvancedModelRenderer Shell7_r1;
    private final AdvancedModelRenderer Shell8_r1;
    private final AdvancedModelRenderer Shell9_r1;
    private final AdvancedModelRenderer Shell10_r1;
    private final AdvancedModelRenderer Shell11_r1;
    private final AdvancedModelRenderer Shell11_r2;
    private final AdvancedModelRenderer mantle;
    private final AdvancedModelRenderer eyeRight;
    private final AdvancedModelRenderer eyeLeft;
    private final AdvancedModelRenderer tentaclebase;
    private final AdvancedModelRenderer Tentacle1a;
    private final AdvancedModelRenderer Tentacle1b;
    private final AdvancedModelRenderer Tentacle1c;
    private final AdvancedModelRenderer Tentacle2a;
    private final AdvancedModelRenderer Tentacle2b;
    private final AdvancedModelRenderer Tentacle2c;
    private final AdvancedModelRenderer Tentacle3a;
    private final AdvancedModelRenderer Tentacle3b;
    private final AdvancedModelRenderer Tentacle3c;
    private final AdvancedModelRenderer Tentacle4a;
    private final AdvancedModelRenderer Tentacle4b;
    private final AdvancedModelRenderer Tentacle4c;
    private final AdvancedModelRenderer Tentacle5a;
    private final AdvancedModelRenderer Tentacle5b;
    private final AdvancedModelRenderer Tentacle5c;
    private final AdvancedModelRenderer Tentacle6a;
    private final AdvancedModelRenderer Tentacle6b;
    private final AdvancedModelRenderer Tentacle6c;
    private final AdvancedModelRenderer Tentacle7a;
    private final AdvancedModelRenderer Tentacle7b;
    private final AdvancedModelRenderer Tentacle7c;
    private final AdvancedModelRenderer Tentacle8a;
    private final AdvancedModelRenderer Tentacle8b;
    private final AdvancedModelRenderer Tentacle8c;
    private final AdvancedModelRenderer Tentacle9a;
    private final AdvancedModelRenderer Tentacle9b;
    private final AdvancedModelRenderer Tentacle9c;
    private final AdvancedModelRenderer Tentacle10a;
    private final AdvancedModelRenderer Tentacle10b;
    private final AdvancedModelRenderer Tentacle10c;
    private final AdvancedModelRenderer siphon;

    public ModelDactyliocerasShell() {
        this.textureWidth = 64;
        this.textureHeight = 64;

        this.root = new AdvancedModelRenderer(this);
        this.root.setRotationPoint(0.0F, 24.0F, 0.0F);


        this.Shell = new AdvancedModelRenderer(this);
        this.Shell.setRotationPoint(0.0F, -3.5F, 0.0F);
        this.root.addChild(Shell);


        this.Shell1_r1 = new AdvancedModelRenderer(this);
        this.Shell1_r1.setRotationPoint(0.0F, 3.2477F, 1.3049F);
        this.Shell.addChild(Shell1_r1);
        this.setRotateAngle(Shell1_r1, 0.3821F, 0.0F, 0.0F);
        this.Shell1_r1.cubeList.add(new ModelBox(Shell1_r1, 26, 0, -2.0F, -2.8264F, 1.483F, 4, 4, 6, 0.04F, false));

        this.Shellbase_r1 = new AdvancedModelRenderer(this);
        this.Shellbase_r1.setRotationPoint(0.0F, 0.2663F, 1.9121F);
        this.Shell.addChild(Shellbase_r1);
        this.setRotateAngle(Shellbase_r1, 0.5601F, 0.0F, 0.0F);
        this.Shellbase_r1.cubeList.add(new ModelBox(Shellbase_r1, 16, 30, -2.0F, -0.5284F, -0.2164F, 4, 2, 6, 0.03F, false));

        this.Shell2_r1 = new AdvancedModelRenderer(this);
        this.Shell2_r1.setRotationPoint(0.0F, 2.7868F, -0.2962F);
        this.Shell.addChild(Shell2_r1);
        this.setRotateAngle(Shell2_r1, -0.1061F, 0.0F, 0.0F);
        this.Shell2_r1.cubeList.add(new ModelBox(Shell2_r1, 11, 9, -2.0F, -3.3675F, -3.5053F, 4, 4, 7, 0.01F, false));

        this.Shell3_r1 = new AdvancedModelRenderer(this);
        this.Shell3_r1.setRotationPoint(0.0F, 4.3154F, -3.0899F);
        this.Shell.addChild(Shell3_r1);
        this.setRotateAngle(Shell3_r1, -0.8915F, 0.0F, 0.0F);
        this.Shell3_r1.cubeList.add(new ModelBox(Shell3_r1, 0, 20, -2.0F, -4.1778F, -8.4655F, 4, 4, 7, 0.0F, false));

        this.Shell4_r1 = new AdvancedModelRenderer(this);
        this.Shell4_r1.setRotationPoint(0.0F, 4.9873F, -10.1627F);
        this.Shell.addChild(Shell4_r1);
        this.setRotateAngle(Shell4_r1, -1.783F, 0.0F, 0.0F);
        this.Shell4_r1.cubeList.add(new ModelBox(Shell4_r1, 22, 20, -2.0F, -3.3058F, -14.6037F, 4, 3, 7, -0.01F, false));

        this.Shell5_r1 = new AdvancedModelRenderer(this);
        this.Shell5_r1.setRotationPoint(0.0F, -1.4162F, -18.655F);
        this.Shell.addChild(Shell5_r1);
        this.setRotateAngle(Shell5_r1, -2.6321F, 0.0F, 0.0F);
        this.Shell5_r1.cubeList.add(new ModelBox(Shell5_r1, 0, 32, -1.5F, -1.9684F, -20.1683F, 3, 3, 6, 0.04F, false));

        this.Shell6_r1 = new AdvancedModelRenderer(this);
        this.Shell6_r1.setRotationPoint(0.0F, -13.006F, -21.1968F);
        this.Shell.addChild(Shell6_r1);
        this.setRotateAngle(Shell6_r1, 2.9505F, 0.0F, 0.0F);
        this.Shell6_r1.cubeList.add(new ModelBox(Shell6_r1, 30, 32, -1.5F, -0.1219F, -25.4135F, 3, 3, 6, 0.01F, false));

        this.Shell7_r1 = new AdvancedModelRenderer(this);
        this.Shell7_r1.setRotationPoint(-0.01F, -29.0409F, -12.5853F);
        this.Shell.addChild(Shell7_r1);
        this.setRotateAngle(Shell7_r1, 2.0825F, 0.0F, 0.0F);
        this.Shell7_r1.cubeList.add(new ModelBox(Shell7_r1, 33, 10, -1.49F, 2.8907F, -28.9949F, 3, 3, 5, 0.0F, false));

        this.Shell8_r1 = new AdvancedModelRenderer(this);
        this.Shell8_r1.setRotationPoint(0.97F, -4.5117F, 4.1488F);
        this.Shell.addChild(Shell8_r1);
        this.setRotateAngle(Shell8_r1, 1.4198F, 0.0F, 0.0F);
        this.Shell8_r1.cubeList.add(new ModelBox(Shell8_r1, 11, 0, -2.47F, -0.75F, -1.5F, 3, 3, 4, -0.01F, false));

        this.Shell9_r1 = new AdvancedModelRenderer(this);
        this.Shell9_r1.setRotationPoint(-0.01F, -2.2461F, 3.2662F);
        this.Shell.addChild(Shell9_r1);
        this.setRotateAngle(Shell9_r1, -0.8774F, 0.0F, 0.0F);
        this.Shell9_r1.cubeList.add(new ModelBox(Shell9_r1, 15, 38, -1.49F, -2.5F, -1.5F, 3, 4, 3, -0.04F, false));

        this.Shell10_r1 = new AdvancedModelRenderer(this);
        this.Shell10_r1.setRotationPoint(-0.01F, 4.8647F, 6.4649F);
        this.Shell.addChild(Shell10_r1);
        this.setRotateAngle(Shell10_r1, -1.401F, 0.0F, 0.0F);
        this.Shell10_r1.cubeList.add(new ModelBox(Shell10_r1, 27, 41, -0.99F, 2.5F, -8.5F, 2, 4, 3, 0.04F, false));

        this.Shell11_r1 = new AdvancedModelRenderer(this);
        this.Shell11_r1.setRotationPoint(-0.01F, 6.5678F, -0.4314F);
        this.Shell.addChild(Shell11_r1);
        this.setRotateAngle(Shell11_r1, -1.9246F, 0.0F, 0.0F);
        this.Shell11_r1.cubeList.add(new ModelBox(Shell11_r1, 0, 41, -0.99F, 2.5F, -8.5F, 2, 5, 3, 0.01F, false));

        this.Shell11_r2 = new AdvancedModelRenderer(this);
        this.Shell11_r2.setRotationPoint(-0.01F, 2.4214F, 3.408F);
        this.Shell.addChild(Shell11_r2);
        this.setRotateAngle(Shell11_r2, -1.5755F, 0.0F, 0.0F);
        this.Shell11_r2.cubeList.add(new ModelBox(Shell11_r2, 0, 0, -0.99F, -0.5F, -11.5F, 2, 9, 7, 0.0F, false));

        this.mantle = new AdvancedModelRenderer(this);
        this.mantle.setRotationPoint(0.0F, -3.1F, 6.5F);
        this.Shell.addChild(mantle);
        this.mantle.cubeList.add(new ModelBox(mantle, 15, 20, -1.5F, 0.0F, 0.0F, 3, 4, 3, 0.0F, false));

        this.eyeRight = new AdvancedModelRenderer(this);
        this.eyeRight.setRotationPoint(1.0F, 1.05F, 2.15F);
        this.mantle.addChild(eyeRight);
        this.setRotateAngle(eyeRight, -0.5035F, -0.7355F, -0.5724F);
        this.eyeRight.cubeList.add(new ModelBox(eyeRight, 49, 42, -1.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));
        this.eyeRight.cubeList.add(new ModelBox(eyeRight, 0, 2, 1.025F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.eyeLeft = new AdvancedModelRenderer(this);
        this.eyeLeft.setRotationPoint(-1.0F, 1.05F, 2.15F);
        this.mantle.addChild(eyeLeft);
        this.setRotateAngle(eyeLeft, -0.5035F, 0.7355F, 0.5724F);
        this.eyeLeft.cubeList.add(new ModelBox(eyeLeft, 21, 0, -2.0F, -1.0F, -1.0F, 3, 2, 2, 0.0F, false));
        this.eyeLeft.cubeList.add(new ModelBox(eyeLeft, 0, 0, -2.025F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

        this.tentaclebase = new AdvancedModelRenderer(this);
        this.tentaclebase.setRotationPoint(0.0F, 0.05F, 3.0F);
        this.mantle.addChild(tentaclebase);
        this.setRotateAngle(tentaclebase, -0.6109F, 0.0F, 0.0F);
        this.tentaclebase.cubeList.add(new ModelBox(tentaclebase, 37, 18, -1.5F, -0.0247F, -0.012F, 3, 4, 4, -0.01F, false));

        this.Tentacle1a = new AdvancedModelRenderer(this);
        this.Tentacle1a.setRotationPoint(-0.4F, 3.3253F, 3.588F);
        this.tentaclebase.addChild(Tentacle1a);
        this.Tentacle1a.cubeList.add(new ModelBox(Tentacle1a, 45, 48, -0.6F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle1b = new AdvancedModelRenderer(this);
        this.Tentacle1b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle1a.addChild(Tentacle1b);
        this.Tentacle1b.cubeList.add(new ModelBox(Tentacle1b, 48, 32, -0.6F, -0.5F, 0.0F, 1, 1, 4, -0.1F, false));

        this.Tentacle1c = new AdvancedModelRenderer(this);
        this.Tentacle1c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle1b.addChild(Tentacle1c);
        this.Tentacle1c.cubeList.add(new ModelBox(Tentacle1c, 51, 46, -0.6F, -0.5F, 0.0F, 1, 1, 3, -0.2F, false));

        this.Tentacle2a = new AdvancedModelRenderer(this);
        this.Tentacle2a.setRotationPoint(-0.9F, 2.5753F, 3.588F);
        this.tentaclebase.addChild(Tentacle2a);
        this.Tentacle2a.cubeList.add(new ModelBox(Tentacle2a, 48, 27, -0.6F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle2b = new AdvancedModelRenderer(this);
        this.Tentacle2b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle2a.addChild(Tentacle2b);
        this.Tentacle2b.cubeList.add(new ModelBox(Tentacle2b, 22, 48, -0.6F, -0.5F, 0.0F, 1, 1, 4, -0.1F, false));

        this.Tentacle2c = new AdvancedModelRenderer(this);
        this.Tentacle2c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle2b.addChild(Tentacle2c);
        this.setRotateAngle(Tentacle2c, 0.0F, 0.0F, 0.0F);
        this.Tentacle2c.cubeList.add(new ModelBox(Tentacle2c, 33, 51, -0.6F, -0.5F, 0.0F, 1, 1, 3, -0.2F, false));

        this.Tentacle3a = new AdvancedModelRenderer(this);
        this.Tentacle3a.setRotationPoint(-0.9F, 1.8253F, 3.588F);
        this.tentaclebase.addChild(Tentacle3a);
        this.Tentacle3a.cubeList.add(new ModelBox(Tentacle3a, 39, 47, -0.6F, -0.5F, 0.0F, 1, 1, 4, 0.005F, false));

        this.Tentacle3b = new AdvancedModelRenderer(this);
        this.Tentacle3b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle3a.addChild(Tentacle3b);
        this.setRotateAngle(Tentacle3b, 0.0F, 0.0F, 0.0F);
        this.Tentacle3b.cubeList.add(new ModelBox(Tentacle3b, 47, 22, -0.6F, -0.5F, 0.0F, 1, 1, 4, -0.1F, false));

        this.Tentacle3c = new AdvancedModelRenderer(this);
        this.Tentacle3c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle3b.addChild(Tentacle3c);
        this.setRotateAngle(Tentacle3c, 0.0F, 0.0F, 0.0F);
        this.Tentacle3c.cubeList.add(new ModelBox(Tentacle3c, 51, 10, -0.6F, -0.5F, 0.0F, 1, 1, 3, -0.2F, false));

        this.Tentacle4a = new AdvancedModelRenderer(this);
        this.Tentacle4a.setRotationPoint(-0.9F, 1.0753F, 3.588F);
        this.tentaclebase.addChild(Tentacle4a);
        this.Tentacle4a.cubeList.add(new ModelBox(Tentacle4a, 47, 14, -0.6F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle4b = new AdvancedModelRenderer(this);
        this.Tentacle4b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle4a.addChild(Tentacle4b);
        this.Tentacle4b.cubeList.add(new ModelBox(Tentacle4b, 33, 46, -0.6F, -0.5F, 0.0F, 1, 1, 4, -0.1F, false));

        this.Tentacle4c = new AdvancedModelRenderer(this);
        this.Tentacle4c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle4b.addChild(Tentacle4c);
        this.setRotateAngle(Tentacle4c, 0.0F, 0.0F, 0.0F);
        this.Tentacle4c.cubeList.add(new ModelBox(Tentacle4c, 50, 37, -0.6F, -0.5F, 0.0F, 1, 1, 3, -0.2F, false));

        this.Tentacle5a = new AdvancedModelRenderer(this);
        this.Tentacle5a.setRotationPoint(-0.4F, 0.3253F, 3.588F);
        this.tentaclebase.addChild(Tentacle5a);
        this.Tentacle5a.cubeList.add(new ModelBox(Tentacle5a, 46, 1, -0.6F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle5b = new AdvancedModelRenderer(this);
        this.Tentacle5b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle5a.addChild(Tentacle5b);
        this.setRotateAngle(Tentacle5b, 0.0F, 0.0F, 0.0F);
        this.Tentacle5b.cubeList.add(new ModelBox(Tentacle5b, 16, 45, -0.6F, -0.5F, 0.0F, 1, 1, 4, -0.1F, false));

        this.Tentacle5c = new AdvancedModelRenderer(this);
        this.Tentacle5c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle5b.addChild(Tentacle5c);
        this.setRotateAngle(Tentacle5c, 0.0F, 0.0F, 0.0F);
        this.Tentacle5c.cubeList.add(new ModelBox(Tentacle5c, 13, 50, -0.6F, -0.5F, 0.0F, 1, 1, 3, -0.2F, false));

        this.Tentacle6a = new AdvancedModelRenderer(this);
        this.Tentacle6a.setRotationPoint(0.4F, 3.3253F, 3.588F);
        this.tentaclebase.addChild(Tentacle6a);
        this.Tentacle6a.cubeList.add(new ModelBox(Tentacle6a, 6, 45, -0.4F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle6b = new AdvancedModelRenderer(this);
        this.Tentacle6b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle6a.addChild(Tentacle6b);
        this.Tentacle6b.cubeList.add(new ModelBox(Tentacle6b, 44, 37, -0.4F, -0.5F, 0.0F, 1, 1, 4, -0.1F, false));

        this.Tentacle6c = new AdvancedModelRenderer(this);
        this.Tentacle6c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle6b.addChild(Tentacle6c);
        this.Tentacle6c.cubeList.add(new ModelBox(Tentacle6c, 50, 6, -0.4F, -0.5F, 0.0F, 1, 1, 3, -0.2F, false));

        this.Tentacle7a = new AdvancedModelRenderer(this);
        this.Tentacle7a.setRotationPoint(0.9F, 2.5753F, 3.588F);
        this.tentaclebase.addChild(Tentacle7a);
        this.Tentacle7a.cubeList.add(new ModelBox(Tentacle7a, 44, 6, -0.4F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle7b = new AdvancedModelRenderer(this);
        this.Tentacle7b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle7a.addChild(Tentacle7b);
        this.Tentacle7b.cubeList.add(new ModelBox(Tentacle7b, 43, 42, -0.4F, -0.5F, 0.0F, 1, 1, 4, -0.1F, false));

        this.Tentacle7c = new AdvancedModelRenderer(this);
        this.Tentacle7c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle7b.addChild(Tentacle7c);
        this.setRotateAngle(Tentacle7c, 0.0F, 0.0F, 0.0F);
        this.Tentacle7c.cubeList.add(new ModelBox(Tentacle7c, 5, 50, -0.4F, -0.5F, 0.0F, 1, 1, 3, -0.2F, false));

        this.Tentacle8a = new AdvancedModelRenderer(this);
        this.Tentacle8a.setRotationPoint(0.9F, 1.8253F, 3.588F);
        this.tentaclebase.addChild(Tentacle8a);
        this.Tentacle8a.cubeList.add(new ModelBox(Tentacle8a, 42, 31, -0.4F, -0.5F, 0.0F, 1, 1, 4, 0.005F, false));

        this.Tentacle8b = new AdvancedModelRenderer(this);
        this.Tentacle8b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle8a.addChild(Tentacle8b);
        this.setRotateAngle(Tentacle8b, 0.0F, 0.0F, 0.0F);
        this.Tentacle8b.cubeList.add(new ModelBox(Tentacle8b, 37, 41, -0.4F, -0.5F, 0.0F, 1, 1, 4, -0.1F, false));

        this.Tentacle8c = new AdvancedModelRenderer(this);
        this.Tentacle8c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle8b.addChild(Tentacle8c);
        this.setRotateAngle(Tentacle8c, 0.0F, 0.0F, 0.0F);
        this.Tentacle8c.cubeList.add(new ModelBox(Tentacle8c, 0, 49, -0.4F, -0.5F, 0.0F, 1, 1, 3, -0.2F, false));

        this.Tentacle9a = new AdvancedModelRenderer(this);
        this.Tentacle9a.setRotationPoint(0.9F, 1.0753F, 3.588F);
        this.tentaclebase.addChild(Tentacle9a);
        this.Tentacle9a.cubeList.add(new ModelBox(Tentacle9a, 40, 26, -0.4F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle9b = new AdvancedModelRenderer(this);
        this.Tentacle9b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle9a.addChild(Tentacle9b);
        this.Tentacle9b.cubeList.add(new ModelBox(Tentacle9b, 40, 0, -0.4F, -0.5F, 0.0F, 1, 1, 4, -0.1F, false));

        this.Tentacle9c = new AdvancedModelRenderer(this);
        this.Tentacle9c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle9b.addChild(Tentacle9c);
        this.setRotateAngle(Tentacle9c, 0.0F, 0.0F, 0.0F);
        this.Tentacle9c.cubeList.add(new ModelBox(Tentacle9c, 28, 48, -0.4F, -0.5F, 0.0F, 1, 1, 3, -0.2F, false));

        this.Tentacle10a = new AdvancedModelRenderer(this);
        this.Tentacle10a.setRotationPoint(0.4F, 0.3253F, 3.588F);
        this.tentaclebase.addChild(Tentacle10a);
        this.Tentacle10a.cubeList.add(new ModelBox(Tentacle10a, 12, 31, -0.4F, -0.5F, 0.0F, 1, 1, 4, 0.0F, false));

        this.Tentacle10b = new AdvancedModelRenderer(this);
        this.Tentacle10b.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle10a.addChild(Tentacle10b);
        this.setRotateAngle(Tentacle10b, 0.0F, 0.0F, 0.0F);
        this.Tentacle10b.cubeList.add(new ModelBox(Tentacle10b, 26, 10, -0.4F, -0.5F, 0.0F, 1, 1, 4, -0.1F, false));

        this.Tentacle10c = new AdvancedModelRenderer(this);
        this.Tentacle10c.setRotationPoint(0.0F, 0.0F, 3.5F);
        this.Tentacle10b.addChild(Tentacle10c);
        this.setRotateAngle(Tentacle10c, 0.0F, 0.0F, 0.0F);
        this.Tentacle10c.cubeList.add(new ModelBox(Tentacle10c, 12, 45, -0.4F, -0.5F, 0.0F, 1, 1, 3, -0.2F, false));

        this.siphon = new AdvancedModelRenderer(this);
        this.siphon.setRotationPoint(0.0F, 4.3658F, 1.8408F);
        this.mantle.addChild(siphon);
        this.setRotateAngle(siphon, -0.3054F, 0.0F, 0.0F);
        this.siphon.cubeList.add(new ModelBox(siphon, 0, 16, -1.0F, -1.025F, -1.0F, 2, 1, 3, -0.01F, false));
        updateDefaultPose();
    }

    public void renderAll(float f) {
        this.resetToDefaultPose();
        this.root.offsetY = -1.4F;
        this.root.render(0.08f);
    }

    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }

}
