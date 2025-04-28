package net.lepidodendron.entity.model.entity;

import net.ilexiconn.llibrary.client.model.ModelAnimator;
import net.ilexiconn.llibrary.client.model.tools.AdvancedModelRenderer;
import net.ilexiconn.llibrary.server.animation.IAnimatedEntity;
import net.lepidodendron.entity.EntityPrehistoricFloraAmmonite_Dactylioceras;
import net.lepidodendron.entity.EntityPrehistoricFloraArcestes;
import net.lepidodendron.entity.model.ModelBasePalaeopedia;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelDactylioceras extends ModelBasePalaeopedia {
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

    private ModelAnimator animator;

    public ModelDactylioceras() {
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
        animator = ModelAnimator.create();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        animate((IAnimatedEntity) entity, f, f1, f2, f3, f4, f5);
        this.root.render(f5);
    }

    public void renderStaticWall(float f) {
        this.root.rotateAngleY = (float) Math.toRadians(90);
        this.root.offsetY = -0.2F;
        this.root.offsetX = -0.15F;
        this.root.offsetZ = -0.4F;
        this.root.render(0.01F);
        resetToDefaultPose();
    }

    public void renderStaticFloor(float f) {
        this.root.offsetZ = -0.1F;
        this.root.offsetY = -0.03F;
        this.root.offsetX = -0.02F;
        this.root.render(0.01F);
        resetToDefaultPose();

    }
    @Override
    public void renderStaticBook(float f) {
        //Rotations, positions and sizing:
        this.root.offsetY = -1.8F;
        this.root.offsetX = -0.4F;
        this.root.offsetZ = 2.0F;
        this.root.rotateAngleY = (float)Math.toRadians(120);
        this.root.rotateAngleX = (float)Math.toRadians(0);
        this.root.rotateAngleZ = (float)Math.toRadians(0);
        this.root.scaleChildren = true;
        float scaler = 2.0F;
        this.root.setScale(scaler, scaler, scaler);
        //Start of pose:
        this.setRotateAngle(root, -0.2F, 0.8F, -0.2F);
        //End of pose, now render the model:
        this.root.render(f);
        //Reset rotations, positions and sizing:
        this.root.setScale(1.0F, 1.0F, 1.0F);
        this.root.scaleChildren = false;
        resetToDefaultPose();

    }

    public void setRotateAngle(AdvancedModelRenderer AdvancedAdvancedModelRenderer, float x, float y, float z) {
        AdvancedAdvancedModelRenderer.rotateAngleX = x;
        AdvancedAdvancedModelRenderer.rotateAngleY = y;
        AdvancedAdvancedModelRenderer.rotateAngleZ = z;
    }


    @Override
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        super.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
        this.resetToDefaultPose();
        EntityPrehistoricFloraAmmonite_Dactylioceras ee = (EntityPrehistoricFloraAmmonite_Dactylioceras) entitylivingbaseIn;

            if ((!ee.isReallySwimming()) && (ee.getAnimation() != ee.UNSWIM_ANIMATION)) { //Running
                if (ee.isInWater()) {
                    animWalking(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
                }
            } else {
                animSwimming(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTickTime);
            }
            

    }

    public void animSwimming(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAmmonite_Dactylioceras entity = (EntityPrehistoricFloraAmmonite_Dactylioceras) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(mantle, mantle.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2.5), mantle.rotateAngleY + (float) Math.toRadians(0), mantle.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-2.5));
        this.mantle.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.01));
        this.setRotateAngle(eyeRight, eyeRight.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*5), eyeRight.rotateAngleY + (float) Math.toRadians(60), eyeRight.rotateAngleZ + (float) Math.toRadians(10));
        this.setRotateAngle(eyeLeft, eyeLeft.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*5), eyeLeft.rotateAngleY + (float) Math.toRadians(-60), eyeLeft.rotateAngleZ + (float) Math.toRadians(-10));
        this.setRotateAngle(tentaclebase, tentaclebase.rotateAngleX + (float) Math.toRadians(20), tentaclebase.rotateAngleY + (float) Math.toRadians(0), tentaclebase.rotateAngleZ + (float) Math.toRadians(0));
        this.tentaclebase.setScale((float)(0.95+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*0.01),(float)(0.95+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*0.01),(float)(0.95+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*-0.01));
        this.setRotateAngle(Tentacle1a, Tentacle1a.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle1a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), Tentacle1a.rotateAngleZ + (float) Math.toRadians(5));
        this.Tentacle1a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle1b, Tentacle1b.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle1b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1.25), Tentacle1b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle1c, Tentacle1c.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle1c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1.25), Tentacle1c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle2a, Tentacle2a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), Tentacle2a.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle2a.rotateAngleZ + (float) Math.toRadians(-15));
        this.Tentacle2a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle2b, Tentacle2b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1.25), Tentacle2b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle2b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle2c, Tentacle2c.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1.25), Tentacle2c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle2c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle3a, Tentacle3a.rotateAngleX + (float) Math.toRadians(-2.5), Tentacle3a.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle3a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle3a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle3b, Tentacle3b.rotateAngleX + (float) Math.toRadians(-5), Tentacle3b.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle3b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle3c, Tentacle3c.rotateAngleX + (float) Math.toRadians(-2.5), Tentacle3c.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle3c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle4a, Tentacle4a.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle4a.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle4a.rotateAngleZ + (float) Math.toRadians(15));
        this.Tentacle4a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle4b, Tentacle4b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), Tentacle4b.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle4b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle4c, Tentacle4c.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), Tentacle4c.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle4c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle5a, Tentacle5a.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle5a.rotateAngleY + (float) Math.toRadians(0), Tentacle5a.rotateAngleZ + (float) Math.toRadians(-5));
        this.Tentacle5a.rotationPointX = this.Tentacle5a.rotationPointX + (float)(0);
        this.Tentacle5a.rotationPointY = this.Tentacle5a.rotationPointY - (float)(-0.25);
        this.Tentacle5a.rotationPointZ = this.Tentacle5a.rotationPointZ + (float)(0);
        this.Tentacle5a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle5b, Tentacle5b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle5b.rotateAngleY + (float) Math.toRadians(-1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1.25), Tentacle5b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle5c, Tentacle5c.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle5c.rotateAngleY + (float) Math.toRadians(-1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1.25), Tentacle5c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle6a, Tentacle6a.rotateAngleX + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle6a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle6a.rotateAngleZ + (float) Math.toRadians(-5));
        this.Tentacle6a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle6b, Tentacle6b.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle6b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), Tentacle6b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle6c, Tentacle6c.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle6c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), Tentacle6c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle7a, Tentacle7a.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), Tentacle7a.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle7a.rotateAngleZ + (float) Math.toRadians(15));
        this.Tentacle7a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle7b, Tentacle7b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-1.25), Tentacle7b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle7b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle7c, Tentacle7c.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1.25), Tentacle7c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle7c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle8a, Tentacle8a.rotateAngleX + (float) Math.toRadians(-2.5), Tentacle8a.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle8a.rotateAngleZ + (float) Math.toRadians(0));
        this.Tentacle8a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle8b, Tentacle8b.rotateAngleX + (float) Math.toRadians(-5), Tentacle8b.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle8b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle8c, Tentacle8c.rotateAngleX + (float) Math.toRadians(-2.5), Tentacle8c.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle8c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle9a, Tentacle9a.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle9a.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle9a.rotateAngleZ + (float) Math.toRadians(-15));
        this.Tentacle9a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle9b, Tentacle9b.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), Tentacle9b.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle9b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle9c, Tentacle9c.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), Tentacle9c.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle9c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle10a, Tentacle10a.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle10a.rotateAngleY + (float) Math.toRadians(0), Tentacle10a.rotateAngleZ + (float) Math.toRadians(5));
        this.Tentacle10a.rotationPointX = this.Tentacle10a.rotationPointX + (float)(0);
        this.Tentacle10a.rotationPointY = this.Tentacle10a.rotationPointY - (float)(-0.25);
        this.Tentacle10a.rotationPointZ = this.Tentacle10a.rotationPointZ + (float)(0);
        this.Tentacle10a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle10b, Tentacle10b.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle10b.rotateAngleY + (float) Math.toRadians(1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*1.25), Tentacle10b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle10c, Tentacle10c.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle10c.rotateAngleY + (float) Math.toRadians(1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), Tentacle10c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(siphon, siphon.rotateAngleX + (float) Math.toRadians(-1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-5), siphon.rotateAngleY + (float) Math.toRadians(0), siphon.rotateAngleZ + (float) Math.toRadians(0));
        this.siphon.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.05),(float)(0.8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.2),(float)(1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-0.2));
        this.setRotateAngle(Shell, Shell.rotateAngleX + (float) Math.toRadians(15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), Shell.rotateAngleY + (float) Math.toRadians(0), Shell.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*5));
        this.Shell.rotationPointX = this.Shell.rotationPointX + (float)(0);
        this.Shell.rotationPointY = this.Shell.rotationPointY - (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-90))*-1);
        this.Shell.rotationPointZ = this.Shell.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-60))*2);

    }
    public void animWalking(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPrehistoricFloraAmmonite_Dactylioceras entity = (EntityPrehistoricFloraAmmonite_Dactylioceras) entitylivingbaseIn;
        int animCycle = 80;
        double tickAnim = (entity.ticksExisted + entity.getTickOffset()) - (int) (Math.floor((double) (entity.ticksExisted + entity.getTickOffset()) / (double) animCycle) * (double) animCycle) + partialTickTime;
        double xx = 0;
        double yy = 0;
        double zz = 0;
        this.setRotateAngle(mantle, mantle.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90+60))*-2.5), mantle.rotateAngleY + (float) Math.toRadians(0), mantle.rotateAngleZ + (float) Math.toRadians(0));
        this.mantle.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.01),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*0.02),(float)(1.1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-0.01));
        this.setRotateAngle(eyeRight, eyeRight.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2.5), eyeRight.rotateAngleY + (float) Math.toRadians(20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45))*10), eyeRight.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*10));
        this.eyeRight.setScale((float)(1.2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.01),(float)(0.9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.1));
        this.setRotateAngle(eyeLeft, eyeLeft.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*-2.5), eyeLeft.rotateAngleY + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*45))*10), eyeLeft.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*10));
        this.eyeLeft.setScale((float)(1.2+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.01),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-0.01),(float)(0.9+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*0.1));
        this.setRotateAngle(tentaclebase, tentaclebase.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*-2.5), tentaclebase.rotateAngleY + (float) Math.toRadians(0), tentaclebase.rotateAngleZ + (float) Math.toRadians(0));
        this.tentaclebase.setScale((float)(0.95+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*0.01),(float)(0.95+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*0.05),(float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+30))*-0.05));
        this.setRotateAngle(Tentacle1a, Tentacle1a.rotateAngleX + (float) Math.toRadians(-65+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle1a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), Tentacle1a.rotateAngleZ + (float) Math.toRadians(5));
        this.Tentacle1a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle1b, Tentacle1b.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), Tentacle1b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle1b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle1c, Tentacle1c.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle1c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1.25), Tentacle1c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle2a, Tentacle2a.rotateAngleX + (float) Math.toRadians(-55+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), Tentacle2a.rotateAngleY + (float) Math.toRadians(-45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle2a.rotateAngleZ + (float) Math.toRadians(-10));
        this.Tentacle2a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle2b, Tentacle2b.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle2b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), Tentacle2b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle2c, Tentacle2c.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1.25), Tentacle2c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle2c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle3a, Tentacle3a.rotateAngleX + (float) Math.toRadians(-60), Tentacle3a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle3a.rotateAngleZ + (float) Math.toRadians(15));
        this.Tentacle3a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle3b, Tentacle3b.rotateAngleX + (float) Math.toRadians(-15), Tentacle3b.rotateAngleY + (float) Math.toRadians(2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), Tentacle3b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle3c, Tentacle3c.rotateAngleX + (float) Math.toRadians(-2.5), Tentacle3c.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle3c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle4a, Tentacle4a.rotateAngleX + (float) Math.toRadians(-55+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle4a.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle4a.rotateAngleZ + (float) Math.toRadians(15));
        this.Tentacle4a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle4b, Tentacle4b.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle4b.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), Tentacle4b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle4c, Tentacle4c.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), Tentacle4c.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle4c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle5a, Tentacle5a.rotateAngleX + (float) Math.toRadians(-55+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle5a.rotateAngleY + (float) Math.toRadians(0), Tentacle5a.rotateAngleZ + (float) Math.toRadians(5));
        this.Tentacle5a.rotationPointX = this.Tentacle5a.rotationPointX + (float)(0);
        this.Tentacle5a.rotationPointY = this.Tentacle5a.rotationPointY - (float)(-0.25);
        this.Tentacle5a.rotationPointZ = this.Tentacle5a.rotationPointZ + (float)(0);
        this.Tentacle5a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle5b, Tentacle5b.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), Tentacle5b.rotateAngleY + (float) Math.toRadians(-1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle5b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle5c, Tentacle5c.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle5c.rotateAngleY + (float) Math.toRadians(-1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1.25), Tentacle5c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle6a, Tentacle6a.rotateAngleX + (float) Math.toRadians(-65+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-2.5), Tentacle6a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle6a.rotateAngleZ + (float) Math.toRadians(-5));
        this.Tentacle6a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle6b, Tentacle6b.rotateAngleX + (float) Math.toRadians(-20+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-5), Tentacle6b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle6b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle6c, Tentacle6c.rotateAngleX + (float) Math.toRadians(-7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-2.5), Tentacle6c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), Tentacle6c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle7a, Tentacle7a.rotateAngleX + (float) Math.toRadians(-55+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*-1.25), Tentacle7a.rotateAngleY + (float) Math.toRadians(45+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle7a.rotateAngleZ + (float) Math.toRadians(10));
        this.Tentacle7a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle7b, Tentacle7b.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-2.5), Tentacle7b.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), Tentacle7b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle7c, Tentacle7c.rotateAngleX + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*-1.25), Tentacle7c.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle7c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle8a, Tentacle8a.rotateAngleX + (float) Math.toRadians(-60), Tentacle8a.rotateAngleY + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle8a.rotateAngleZ + (float) Math.toRadians(-15));
        this.Tentacle8a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle8b, Tentacle8b.rotateAngleX + (float) Math.toRadians(-15), Tentacle8b.rotateAngleY + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), Tentacle8b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle8c, Tentacle8c.rotateAngleX + (float) Math.toRadians(-2.5), Tentacle8c.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle8c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle9a, Tentacle9a.rotateAngleX + (float) Math.toRadians(-55+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*1.25), Tentacle9a.rotateAngleY + (float) Math.toRadians(-5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle9a.rotateAngleZ + (float) Math.toRadians(-15));
        this.Tentacle9a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle9b, Tentacle9b.rotateAngleX + (float) Math.toRadians(-15+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle9b.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), Tentacle9b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle9c, Tentacle9c.rotateAngleX + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), Tentacle9c.rotateAngleY + (float) Math.toRadians(5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle9c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle10a, Tentacle10a.rotateAngleX + (float) Math.toRadians(-55+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360))*2.5), Tentacle10a.rotateAngleY + (float) Math.toRadians(0), Tentacle10a.rotateAngleZ + (float) Math.toRadians(-5));
        this.Tentacle10a.rotationPointX = this.Tentacle10a.rotationPointX + (float)(0);
        this.Tentacle10a.rotationPointY = this.Tentacle10a.rotationPointY - (float)(-0.25);
        this.Tentacle10a.rotationPointZ = this.Tentacle10a.rotationPointZ + (float)(0);
        this.Tentacle10a.setScale((float)1,(float)1,(float)(1.05+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360+30))*-0.05));
        this.setRotateAngle(Tentacle10b, Tentacle10b.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*5), Tentacle10b.rotateAngleY + (float) Math.toRadians(1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*2.5), Tentacle10b.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(Tentacle10c, Tentacle10c.rotateAngleX + (float) Math.toRadians(-2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*2.5), Tentacle10c.rotateAngleY + (float) Math.toRadians(1.25+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-120))*1.25), Tentacle10c.rotateAngleZ + (float) Math.toRadians(0));
        this.setRotateAngle(siphon, siphon.rotateAngleX + (float) Math.toRadians(-130+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180+60))*2.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*-5), siphon.rotateAngleY + (float) Math.toRadians(0), siphon.rotateAngleZ + (float) Math.toRadians(0));
        this.siphon.setScale((float)(1+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.05),(float)(0.8+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*0.2),(float)(1.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180-30))*-0.2));
        this.setRotateAngle(Shell, Shell.rotateAngleX + (float) Math.toRadians(-10+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*180))*5), Shell.rotateAngleY + (float) Math.toRadians(0), Shell.rotateAngleZ + (float) Math.toRadians(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*90))*5));
        this.Shell.rotationPointX = this.Shell.rotationPointX + (float)(0);
        this.Shell.rotationPointY = this.Shell.rotationPointY - (float)(7.5+Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-90))*-0.5);
        this.Shell.rotationPointZ = this.Shell.rotationPointZ + (float)(Math.sin((Math.PI/180)*((((double)tickAnim/20D))*360-60))*-0.5);
        this.setRotateAngle(root, root.rotateAngleX + (float) Math.toRadians(0), root.rotateAngleY + (float) Math.toRadians(180), root.rotateAngleZ + (float) Math.toRadians(0));

    }

    @Override
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity e) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, e);
        //this.resetToDefaultPose();

        //this.body.offsetY = 1.50F;

        EntityPrehistoricFloraAmmonite_Dactylioceras ee = (EntityPrehistoricFloraAmmonite_Dactylioceras) e;

        if (!e.isInWater()) {
            this.root.rotateAngleZ = (float) Math.toRadians(90);
            this.root.offsetY = -0.1F;
        }

    }

    public void animate(IAnimatedEntity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        EntityPrehistoricFloraAmmonite_Dactylioceras e = (EntityPrehistoricFloraAmmonite_Dactylioceras) entity;
        animator.update(entity);

        animator.setAnimation(e.SWIM_ANIMATION);
        animator.startKeyframe(e.swimTransitionLength()); //move to this keyframe over the right length

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);

        animator.setAnimation(e.UNSWIM_ANIMATION);
        animator.startKeyframe(e.unswimTransitionLength()); //move to this keyframe over the right length

        animator.endKeyframe();
        animator.setStaticKeyframe(0);
        animator.resetKeyframe(0);
    }
}

